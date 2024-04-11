package com.example.test.miscellaneous.service.textandbinaryFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.logging.Logger;

//@Service
public class TextAndBinaryFileReadAndWrite {

    private static final Logger logger = Logger.getLogger(TextAndBinaryFileReadAndWrite.class.getName());

    //@Value("${inputFileDir}")
    //private String inputFileDirectory;

    //@Value("${outputFileDir}")
    //private String outputFileDirectory;

    //inputfileDir=C:\1nOS\installedFiles\Intellij_IDEA\1_testPRJ\1_myFiles\9_filesForReadAndWrite\1_inputDir\
    //outputfileDir=C:\1nOS\installedFiles\Intellij_IDEA\1_testPRJ\1_myFiles\9_filesForReadAndWrite\2_outputDir\

    private static final int BUFFER_SIZE_4KB = 4096; // 4KB
    private static final int BUFFER_SIZE_16KB = 16384; // 16KB

    public String textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream(
               String inputFileDirectory, String outputFileDirectory) throws IOException {
        logger.info("logEntry:textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream method");

        //part 1 - binary file read and write
        {
            String inputFileName  = "1_InputFile.7z";
            String outputFileName = "1_OutputFile.7z";

            //String inputFileName  = "1_InputFile.txt";
            //String outputFileName = "1_OutputFile.txt";

            String inputfilePath = inputFileDirectory + System.getProperty("file.separator") + inputFileName;
            String outputfilePath = outputFileDirectory + System.getProperty("file.separator") + outputFileName;

            logger.info("inputfilePath=" + inputfilePath);
            logger.info("outputfilePath=" + outputfilePath);

            File inputFile = null;
            FileInputStream fileInputStream = null;
            InputStream inputStream = null;

            File outputFile = null;
            FileOutputStream fileOutputStream = null;
            OutputStream outputStream = null;

            try {
                inputFile = new File(inputfilePath);
                fileInputStream = new FileInputStream(inputFile);
                inputStream = fileInputStream;

                outputFile = new File(outputfilePath);
                fileOutputStream = new FileOutputStream(outputFile);
                outputStream = fileOutputStream;

                byte[] buffer = new byte[BUFFER_SIZE_4KB];   //4096
                int bytesRead = -1;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                logger.info("logEntry:finally block");
                inputStream.close();
                outputStream.close();
            }

        }

        //part 2 - text file read and write
        {
            //String inputFileName = "1_InputFile.7z";
            //String outputFileName = "1_OutputFile.7z";

            String inputFileName  = "1_InputFile.txt";
            String outputFileName = "1_OutputFile.txt";

            String inputfilePath = inputFileDirectory + System.getProperty("file.separator") + inputFileName;
            String outputfilePath = outputFileDirectory + System.getProperty("file.separator") + outputFileName;

            logger.info("inputfilePath=" + inputfilePath);
            logger.info("outputfilePath=" + outputfilePath);

            File inputFile = null;
            FileInputStream fileInputStream = null;
            InputStream inputStream = null;

            File outputFile = null;
            FileOutputStream fileOutputStream = null;
            OutputStream outputStream = null;

            try {
                inputFile = new File(inputfilePath);
                fileInputStream = new FileInputStream(inputFile);
                inputStream = fileInputStream;

                outputFile = new File(outputfilePath);
                fileOutputStream = new FileOutputStream(outputFile);
                outputStream = fileOutputStream;

                byte[] buffer = new byte[BUFFER_SIZE_4KB];   //4096
                int bytesRead = -1;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                logger.info("logEntry:finally block");
                inputStream.close();
                outputStream.close();
            }

        }

        logger.info("logExit:textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream method");
        return "file successfully created";
    }





    public String textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream(
            String inputFileDirectory, String outputFileDirectory) throws IOException {

        logger.info("logEntry:textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream method");

        //part 1 - binary file read and write
        {
            String inputFileName  = "2_InputFile.7z";
            String outputFileName = "2_OutputFile.7z";
            //String inputFileName  = "2_InputFile.txt";
            //String outputFileName = "2_OutputFile.txt";

            String inputfilePath = inputFileDirectory + System.getProperty("file.separator") + inputFileName;
            String outputfilePath = outputFileDirectory + System.getProperty("file.separator") + outputFileName;

            logger.info("inputfilePath=" + inputfilePath);
            logger.info("outputfilePath=" + outputfilePath);

            File inputFile = null;
            FileInputStream fileInputStream = null;
            BufferedInputStream bufferedInputStream = null;
            InputStream inputStream = null;

            File outputFile = null;
            FileOutputStream fileOutputStream = null;
            BufferedOutputStream bufferedOutputStream = null;
            OutputStream outputStream = null;

            try {
                inputFile = new File(inputfilePath);
                fileInputStream = new FileInputStream(inputFile);
                bufferedInputStream = new BufferedInputStream(fileInputStream, BUFFER_SIZE_16KB);
                inputStream = bufferedInputStream;

                outputFile = new File(outputfilePath);
                fileOutputStream = new FileOutputStream(outputFile);
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER_SIZE_16KB);
                outputStream = bufferedOutputStream;

                byte[] buffer = new byte[BUFFER_SIZE_16KB];
                int bytesRead = -1;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                logger.info("logEntry:finally block");
                inputStream.close();
                bufferedInputStream.close();
                fileInputStream.close();

                outputStream.close();
                bufferedOutputStream.close();
                fileOutputStream.close();
            }
        }




        //part 2 - text file read and write
        {
            //String inputFileName = "2_InputFile.7z";
            //String outputFileName = "2_OutputFile.7z";

            String inputFileName  = "2_InputFile.txt";
            String outputFileName = "2_OutputFile.txt";

            String inputfilePath = inputFileDirectory + System.getProperty("file.separator") + inputFileName;
            String outputfilePath = outputFileDirectory + System.getProperty("file.separator") + outputFileName;

            logger.info("inputfilePath=" + inputfilePath);
            logger.info("outputfilePath=" + outputfilePath);

            File inputFile = null;
            FileInputStream fileInputStream = null;
            BufferedInputStream bufferedInputStream = null;
            InputStream inputStream = null;

            File outputFile = null;
            FileOutputStream fileOutputStream = null;
            BufferedOutputStream bufferedOutputStream = null;
            OutputStream outputStream = null;

            try {
                inputFile = new File(inputfilePath);
                fileInputStream = new FileInputStream(inputFile);
                bufferedInputStream = new BufferedInputStream(fileInputStream, BUFFER_SIZE_16KB);
                inputStream = bufferedInputStream;

                outputFile = new File(outputfilePath);
                fileOutputStream = new FileOutputStream(outputFile);
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER_SIZE_16KB);
                outputStream = bufferedOutputStream;

                byte[] buffer = new byte[BUFFER_SIZE_16KB];
                int bytesRead = -1;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                logger.info("logEntry:finally block");
                inputStream.close();
                bufferedInputStream.close();
                fileInputStream.close();

                outputStream.close();
                bufferedOutputStream.close();
                fileOutputStream.close();
            }
        }



        logger.info("logExit:textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream method");

        return "binary file successfully created";

    }

}
