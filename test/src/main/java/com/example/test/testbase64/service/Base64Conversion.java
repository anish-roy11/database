package com.example.test.testbase64.service;


import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

@RequestMapping("api/v1/file")
@RestController
public class Base64Conversion {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("Base64Conversion");

    //@Test
    @RequestMapping("/fileToBase64StringConversion")
    public void fileToBase64StringConversion() throws IOException {
        logger.info("logentry: fileToBase64StringConversion method");

        String[] filenames = new String[4];
        filenames[0] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile\\Capture21.JPG";
        filenames[1] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\1_fileToBeUploaded\\test 3.txt";
        filenames[2] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\1_fileToBeUploaded\\test1.docx";
        filenames[3] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\1_fileToBeUploaded\\test2.pdf";

        String[] outputFilenames = new String[4];
        outputFilenames[0] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile_Base64Conversion_class\\Capture21.JPG";
        outputFilenames[1] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile_Base64Conversion_class\\test 3.txt";
        outputFilenames[2] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile_Base64Conversion_class\\test1.docx";
        outputFilenames[3] = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile_Base64Conversion_class\\test2.pdf";

        for(int i = 0; i <= filenames.length; i++)
        {
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
}