package com.example.test.miscellaneous.service.textFile;

import com.example.test.miscellaneous.service.textandbinaryFile.TextAndBinaryFileReadAndWrite;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.logging.Logger;

//@Service
public class TextFileReadAndWrite {
    private static final Logger logger = Logger.getLogger(TextFileReadAndWrite.class.getName());

    //@Value("${inputFileDir}")
    //private String inputFileDirectory;

    //@Value("${outputFileDir}")
    //private String outputFileDirectory;

    //inputfileDir=C:\1nOS\installedFiles\Intellij_IDEA\1_testPRJ\1_myFiles\9_filesForReadAndWrite\1_inputDir\
    //outputfileDir=C:\1nOS\installedFiles\Intellij_IDEA\1_testPRJ\1_myFiles\9_filesForReadAndWrite\2_outputDir\

    private static final int BUFFER_SIZE_4KB = 4096; // 4KB
    private static final int BUFFER_SIZE_16KB = 16384; // 16KB

    public String textFileReadAndWriteUsingBufferedReaderAndBufferedWriter(
            String inputFileDirectory, String outputFileDirectory) throws IOException {

        logger.info("logEntry:textFileReadAndWriteUsingBufferedReaderAndBufferedWriter method");

        String inputFileName  = "3_InputFile.txt";
        String outputFileName = "3_OutputFile.txt";

        String inputfilePath = inputFileDirectory + System.getProperty("file.separator") + inputFileName ;
        String outputfilePath = outputFileDirectory + System.getProperty("file.separator") + outputFileName;

        logger.info("inputfilePath="+inputfilePath);
        logger.info("outputfilePath="+outputfilePath);

        File inputFile =  null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        File outputFile =  null;
        FileWriter fileWriter  = null;
        BufferedWriter bufferedWriter = null;


        try
        {
            inputFile = new File(inputfilePath);
            fileReader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(fileReader);

            outputFile = new File(outputfilePath);
            fileWriter  = new FileWriter(outputFile);
            bufferedWriter = new BufferedWriter(fileWriter);

            String lineRead;
            while (  (lineRead = bufferedReader.readLine())  != null)
            {
                bufferedWriter.write(lineRead + "\n");

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally{
            logger.info("logEntry:finally block");
            bufferedWriter.close();
            bufferedReader.close();
        }
        logger.info("logExit:textFileReadAndWriteUsingBufferedReaderAndBufferedWriter method");


        return "text file successfully created";

    }


}
