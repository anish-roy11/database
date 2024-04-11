package com.example.test.p10_com.test.base64;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.*;
import java.util.logging.*;

/**
 * 
 * @author acs_pc
 * {@docRoot this file encodes 4 different types of files (.txt, .png, .docx, .pdf) into base64 format
 * and then decodes them in a separate directory, creating the exact copies of 4 files}
 *
 */


public class Base64Conversion {

    private static Logger logger = Logger.getLogger(Base64Conversion.class.getName());


    public void fileToBase64StringConversion() throws IOException {
        logger.info("logentry: fileToBase64StringConversion method");

        String[] filenames = new String[4];
        filenames[0] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\1_fileToBeUploaded\\Capture21.JPG";
        filenames[1] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\1_fileToBeUploaded\\test 3.txt";
        filenames[2] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\1_fileToBeUploaded\\test1.docx";
        filenames[3] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\1_fileToBeUploaded\\test2.pdf";

        String[] outputFilenames = new String[4];
        outputFilenames[0] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\3_uploadedFile_Base64Conversion_class\\Capture21.JPG";
        outputFilenames[1] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\3_uploadedFile_Base64Conversion_class\\test 3.txt";
        outputFilenames[2] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\3_uploadedFile_Base64Conversion_class\\test1.docx";
        outputFilenames[3] = "E:\\1_SourceCode\\1_Intellij_IDEA\\1_testPRJ\\1_myFiles\\3_uploadedFile_Base64Conversion_class\\test2.pdf";

        for (int i = 0; i < filenames.length; i++) {
            //File inputFile = new File("C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile\\Capture21.JPG");
            File inputFile = new File(filenames[i]);

            byte[] fileContent = FileUtils.readFileToByteArray(inputFile);
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            //System.out.println("encodedString=="+ encodedString);
            logger.info("encodedString for input filename[" + i + "]== " + encodedString);

            // create output file
            //File outputFile = new File("C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile_Base64Conversion_class\\Capture21_output.JPG");
            File outputFile = new File(outputFilenames[i]);

            // decode the string and write to file
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            FileUtils.writeByteArrayToFile(outputFile, decodedBytes);
        }

        logger.info("logexit: fileToBase64StringConversion method");

        //assertTrue(FileUtils.contentEquals(inputFile, outputFile));
    }


    public static void main(String[] args) {

        Base64Conversion base64Conversion = new Base64Conversion();
        try {
            base64Conversion.fileToBase64StringConversion();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}