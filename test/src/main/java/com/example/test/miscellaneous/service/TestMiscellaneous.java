package com.example.test.miscellaneous.service;

import com.example.test.miscellaneous.service.__test.TestClass;
import com.example.test.miscellaneous.service.cloneable.TestCloneablePOC;
import com.example.test.miscellaneous.service.datastructures.DataStructure;
import com.example.test.miscellaneous.service.decoratorDesignPattern.DecoratorPatternTest;
import com.example.test.miscellaneous.service.prime.TestPrimeClass;
import com.example.test.miscellaneous.service.reflection.TestReflection;
import com.example.test.miscellaneous.service.regularExpression.TestRegularExpression;
import com.example.test.miscellaneous.service.semaphore.SemaphoreDemo;
import com.example.test.miscellaneous.service.serialize_deserialize.Demo;
import com.example.test.miscellaneous.dto.MiscellaneousInterface;
import com.example.test.miscellaneous.service.enumrelated.TestEnum;
import com.example.test.miscellaneous.service.producerconsumer.TestProducerConsumer;
import com.example.test.miscellaneous.service.serialize_deserialize.TestSerializeDeserialize;
import com.example.test.miscellaneous.service.singleton.SingletonService;
import com.example.test.miscellaneous.service.stream_map.StreamMapTest;
import com.example.test.miscellaneous.service.suspendresumethread.SuspendResume;
import com.example.test.miscellaneous.service.textFile.TextFileReadAndWrite;
import com.example.test.miscellaneous.service.textandbinaryFile.TextAndBinaryFileReadAndWrite;
import com.example.test.miscellaneous.service.threads.ThreadService;
import com.example.test.miscellaneous.service.wordcount.WordCount;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Value;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;


@Service
public class TestMiscellaneous implements MiscellaneousInterface {

    private static final Logger logger = Logger.getLogger(TestMiscellaneous.class.getName());

    @Value("${inputFileDir}")
    private String inputFileDirectory;

    @Value("${outputFileDir}")
    private String outputFileDirectory;

    @Override
    public String testRegularExpression() {
        logger.info("logEntry:testRegularExpression method");

        TestRegularExpression testRegularExpression = new TestRegularExpression();
        String result =  testRegularExpression.testRegularRxpressionMethod();

        logger.info("logExit:testRegularExpression method");
        return result;
    }


    @Override
    public String textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream() throws IOException {
        logger.info("logEntry:textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream method");

        logger.info("inputFileDirectory="+inputFileDirectory);
        logger.info("outputFileDirectory="+outputFileDirectory);

        TextAndBinaryFileReadAndWrite textAndBinaryFileReadAndWrite = new TextAndBinaryFileReadAndWrite();
        String result = textAndBinaryFileReadAndWrite.textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream(inputFileDirectory,outputFileDirectory);

        logger.info("logExit:textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream method");
        return result;
    }


    @Override
    public String textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream() throws IOException
    {
        logger.info("logEntry:textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream method");

        logger.info("inputFileDirectory="+inputFileDirectory);
        logger.info("outputFileDirectory="+outputFileDirectory);

        TextAndBinaryFileReadAndWrite textAndBinaryFileReadAndWrite = new TextAndBinaryFileReadAndWrite();
        String result = textAndBinaryFileReadAndWrite.textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream(inputFileDirectory,outputFileDirectory);

        logger.info("logExit:textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream method");
        return result;

    }


    @Override
    public String textFileReadAndWriteUsingBufferedReaderAndBufferedWriter() throws IOException
    {
        logger.info("logEntry:textFileReadAndWriteUsingBufferedReaderAndBufferedWriter method");

        logger.info("inputFileDirectory="+inputFileDirectory);
        logger.info("outputFileDirectory="+outputFileDirectory);

        TextFileReadAndWrite textFileReadAndWrite = new TextFileReadAndWrite();
        String result = textFileReadAndWrite.textFileReadAndWriteUsingBufferedReaderAndBufferedWriter(inputFileDirectory,outputFileDirectory);

        logger.info("logExit:textFileReadAndWriteUsingBufferedReaderAndBufferedWriter method");
        return result;
    }


    @Override
    public String serialization_deserialization() throws IOException {
        logger.info("logEntry:serialization_deserialization method");
        logger.info("outputFileDirectory="+outputFileDirectory);

        TestSerializeDeserialize testSerializeDeserialize = new TestSerializeDeserialize();
        String result = testSerializeDeserialize.testSerializeDeserializeMethod(outputFileDirectory);

        logger.info("logExit:serialization_deserialization method");
        return result;

    }



    @Override
    public String producer_consumer() throws IOException {
        logger.info("logEntry:producer_consumer method");

        TestProducerConsumer testProducerConsumer = new TestProducerConsumer();
        String result = testProducerConsumer.testProducerConsumer();

        logger.info("logExit:producer_consumer method");
        return result;
    }



    @Override
    public String suspendResumeThread() {
        logger.info("logEntry:suspendResumeThread method");

        SuspendResume suspendResume = new SuspendResume();
        String result = suspendResume.suspendResumeThread();

        logger.info("logExit:suspendResumeThread method");
        return result;
    }



    @Override
    public String testenum() {
        logger.info("logEntry:testenum method");

        TestEnum testEnum = new TestEnum();
        String result = testEnum.enumdemoMethod();

        logger.info("logExit:testenum method");
        return result;
    }

    @Override
    public String singletonDemo() {
        logger.info("logEntry:singletonDemo method");
        String result = "success";
        SingletonService singletonService = new SingletonService();
        return singletonService.singletonDemo();

    }

    @Override
    public String testMultiThreading() throws InterruptedException {
        logger.info("logEntry:testMultiThreading method");
        String result = null;

        ThreadService threadService = new ThreadService();
        result= threadService.threadDemo();
        logger.info("logExit:testMultiThreading method");
        return result;

    }

    @Override
    public String testReflectionMethod() {
        logger.info("log entry:testReflectionMethod method");
        String result = "success";

        TestReflection testReflection = new TestReflection();
        testReflection.testReflectionMethod();

        logger.info("log exit:testReflectionMethod method");
        return result;
    }

    @Override
    public String decoratorPatternTest() {
        logger.info("log entry:decoratorPatternTest method");
        String result = "success";

        DecoratorPatternTest decoratorPatternTest1 = new DecoratorPatternTest();
        decoratorPatternTest1.decoratorPatternTestMethod();

        logger.info("log exit:decoratorPatternTest method");
        return result;
    }

    @Override
    public String semaphoreDemoMethod() throws InterruptedException {
        logger.info("log entry:semaphoreDemoMethod method");
        String result = "success";

        SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
        result = semaphoreDemo.semaphoreDemoMethod();

        logger.info("log exit:semaphoreDemoMethod method");
        return result;
    }


    @Override
    public String cloneableDemoMethod() throws CloneNotSupportedException {
        logger.info("log entry:cloneableDemoMethod method");
        String result = "success";

        TestCloneablePOC testCloneablePOC_1 = new TestCloneablePOC();
        result = testCloneablePOC_1.testCloneableMethod();

        logger.info("log exit:cloneableDemoMethod method");
        return result;
    }

    @Override
    public String streamMapTestDemoMethod() {
        logger.info("log entry:streamMapTestDemoMethod method");
        String result = "success";

        StreamMapTest streamMapTest = new StreamMapTest();
        result = streamMapTest.streamMapTestMethod();

        logger.info("log exit:streamMapTestDemoMethod method");
        return result;
    }


    @Override
    public String dataStructuresMethod() {
        logger.info("log entry:dataStructuresMethod method");
        String result = "success";

        DataStructure dataStructure = new DataStructure();
        result = dataStructure.testvariousDataStructures();

        logger.info("log exit:dataStructuresMethod method");
        return result;
    }


    @Override
    public String wordCount() {
        String result;
        logger.info("log entry:wordCount method");


        WordCount wordCount_obj1 = new WordCount();

        result = wordCount_obj1.wordCount();
        result = wordCount_obj1.wordCountUsingHashMap();

        logger.info("log exit:wordCount method");
        return result;
    }


    @Override
    public String testclass() {
        logger.info("log exit:testclass method");
        TestClass testClass = new TestClass();
        testClass.testMethodA();
        return null;
    }


    @Override
    public String testprimeNumbers() {
        logger.info("log exit:testprimeNumbers method");
        String result;
        TestPrimeClass testPrimeClass_1 = new TestPrimeClass();
        result = testPrimeClass_1.getPrime();
        logger.info("log exit:testprimeNumbers method");
        return result;
    }



    @Override
    public String findMissingValueInSequence() {
        logger.info("log exit:findMissingValueInSequence method");
        String result;
        TestPrimeClass testPrimeClass_1 = new TestPrimeClass();
        result = testPrimeClass_1.getMissingNumber();
        logger.info("log exit:findMissingValueInSequence method");
        return result;
    }

}
