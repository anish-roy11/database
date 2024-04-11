package com.example.test.miscellaneous.service.serialize_deserialize;

import com.example.test.miscellaneous.service.TestMiscellaneous;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.util.logging.Logger;

public class TestSerializeDeserialize {
    private static final Logger logger = Logger.getLogger(TestSerializeDeserialize.class.getName());

    public String testSerializeDeserializeMethod(String outputFileDirectory) throws IOException
    {

        //inputfileDir=C:\1nOS\installedFiles\Intellij_IDEA\1_testPRJ\1_myFiles\9_filesForReadAndWrite\1_inputDir\
        //outputfileDir=C:\1nOS\installedFiles\Intellij_IDEA\1_testPRJ\1_myFiles\9_filesForReadAndWrite\2_outputDir\

        //String result = null;
        //result = "successfully serialized and deserialized object";
        //return result;
        logger.info("logEntry:testSerializeDeserializeMethod method");

        logger.info("============serialization starts======================");
        Demo objectToSerialize = new Demo(1, "geeksforgeeks");
        logger.info("object created. Object details are::");
        logger.info("objectToSerialize.a=" + objectToSerialize.a);
        logger.info("objectToSerialize.b=" + objectToSerialize.b);


        String outputFileName = "4_ObjectSerializationFile.ser";
        String outputfilePath = outputFileDirectory + System.getProperty("file.separator") + outputFileName;
        logger.info("outputfilePath="+outputfilePath);

        File file1 = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        // Serialization
        try
        {
            file1 = new File(outputfilePath);
            fileOutputStream = new FileOutputStream(file1);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Method for serialization of object
            objectOutputStream.writeObject(objectToSerialize);
            System.out.println("Object has been serialized");

        }
        catch(Exception ex)
        {
            logger.info("logEntry:catch block of serialization");
            ex.printStackTrace();
        }
        finally{
            logger.info("logEntry:finally block of serialization");
            objectOutputStream.close();
            fileOutputStream.close();
        }
        logger.info("============serialization ends======================");


        //De-serialization -------------------------------------------------------------------------


        logger.info("============de-serialization starts======================");
        Demo objectDeSerialized = null;
        String inputfilePath = outputfilePath;
        logger.info("inputfilePath ="+ inputfilePath);

        File file2 = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        // Deserialization
        try
        {
            file2 = new File(inputfilePath);
            fileInputStream = new FileInputStream(file2);
            objectInputStream = new ObjectInputStream(fileInputStream);

            // Method for deserialization of object
            objectDeSerialized = (Demo)objectInputStream.readObject();

            logger.info("Object has been deserialized ");
            logger.info("objectDeSerialized.a = " + objectDeSerialized.a);
            logger.info("objectDeSerialized.b = " + objectDeSerialized.b);

        }
        catch(Exception ex)
        {
            logger.info("logEntry: catch block of de-serialization");
            ex.printStackTrace();
        }
        finally{
            logger.info("logEntry: finally block of de-serialization");
            objectInputStream.close();
            fileInputStream.close();
        }

        logger.info("============de-serialization ends======================");

        logger.info("logExit:testSerializeDeserializeMethod method");
        return "object successfully serialized in file and de-serialized ";
    }
}
