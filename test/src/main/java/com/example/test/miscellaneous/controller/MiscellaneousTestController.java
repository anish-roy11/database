package com.example.test.miscellaneous.controller;


import com.example.test.miscellaneous.dto.MiscellaneousInterface;
import com.example.test.miscellaneous.service.TestMiscellaneous;
import com.example.test.miscellaneous.service.singleton.SingletonService;
import com.example.test.miscellaneous.service.threads.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.logging.Logger;



@RequestMapping("api/v1/miscellaneous")
@RestController

public class MiscellaneousTestController {

    private static final Logger logger = Logger.getLogger(MiscellaneousTestController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    TestMiscellaneous testRegularExpression;

    @Autowired
    MiscellaneousInterface miscellaneousInterface;


    // API-1
    @RequestMapping(value = "/testRegularExpression", method= RequestMethod.GET)
    public String getComplexQueryResult() {
        logger.info("logEntry:/testRegularExpression url method");
        return miscellaneousInterface.testRegularExpression();

    }


    // API-2
    @RequestMapping(value = "/textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream", method= RequestMethod.GET)
    public String textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream() throws IOException {
        logger.info("logEntry:/textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream url method");
        return miscellaneousInterface.textAndBinaryFileReadAndWriteUsingFileInputStreamAndFileOutputStream();

    }

    // API-3
    @RequestMapping(value = "/textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream", method= RequestMethod.GET)
    public String textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream() throws IOException {
        logger.info("logEntry:/textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream url method");
        return miscellaneousInterface.textAndBinaryFileReadAndWriteUsingBufferedInputStreamAndBufferedOutputStream();

    }

// API-4
    @RequestMapping(value = "/textFileReadAndWriteUsingBufferedReaderAndBufferedWriter", method= RequestMethod.GET)
    public String textFileReadAndWriteUsingBufferedReaderAndBufferedWriter() throws IOException {
        logger.info("logEntry:/textFileReadAndWriteUsingBufferedReaderAndBufferedWriter url method");
        return miscellaneousInterface.textFileReadAndWriteUsingBufferedReaderAndBufferedWriter();

    }





    // API-5
    @RequestMapping(value = "/serialization_deserialization", method= RequestMethod.GET)
    public String serialization_deserialization() throws IOException {
        logger.info("logEntry:/serialization_deserialization url method");
        return miscellaneousInterface.serialization_deserialization();

    }






    // API-6
    @RequestMapping(value = "/producer_consumer", method= RequestMethod.GET)
    public String producer_consumer() throws IOException {
        //this runs in infinite loop
        logger.info("logEntry:/producer_consumer url method");
        return miscellaneousInterface.producer_consumer();

    }




    // API-7
    @RequestMapping(value = "/suspendResumeThread", method= RequestMethod.GET)
    public String suspendResumeThread() throws IOException {
        logger.info("logEntry:/suspendResumeThread url method");
        return miscellaneousInterface.suspendResumeThread();

    }




    // API-8
    @RequestMapping(value = "/testenum", method= RequestMethod.GET)
    public String testenum() throws IOException {
        logger.info("logEntry:/testenum url method");
        return miscellaneousInterface.testenum();

    }


    // API-8
    @RequestMapping(value = "/testSingleton", method= RequestMethod.GET)
    public String testSingleton() {
        logger.info("logEntry:/testSingleton url method");
        SingletonService singletonService = new SingletonService();

        return miscellaneousInterface.singletonDemo();

    }




    // API-9
    @RequestMapping(value = "/testMultiThreading", method= RequestMethod.GET)
    public String testMultiThreading() throws InterruptedException {
        logger.info("logEntry:/testMultiThreading url method");
        return miscellaneousInterface.testMultiThreading();

    }



    // API-10
    @RequestMapping(value = "/testReflection", method= RequestMethod.GET)
    public String testReflection() throws InterruptedException {
        logger.info("logEntry:/testReflection url method");
        return miscellaneousInterface.testReflectionMethod();

    }



    // API-11
    @RequestMapping(value = "/testDecoratorPattern", method= RequestMethod.GET)
    public String testDecoratorPattern(){
        logger.info("logEntry:/testDecoratorPattern url method");
        return miscellaneousInterface.decoratorPatternTest();

    }


    //semaphoreDemoMethod
    // API-12
    @RequestMapping(value = "/semaphoreDemoMethod", method= RequestMethod.GET)
    public String semaphoreDemoMethod() throws InterruptedException {
        logger.info("logEntry:/semaphoreDemoMethod url method");
        return miscellaneousInterface.semaphoreDemoMethod();

    }


    // API-13
    @RequestMapping(value = "/cloneableDemoMethod", method= RequestMethod.GET)
    public String cloneableDemoMethod() throws CloneNotSupportedException {
        logger.info("logEntry:/cloneableDemoMethod url method");
        return miscellaneousInterface.cloneableDemoMethod();

    }


    // API-14
    @RequestMapping(value = "/streamMapTestDemoURLMethod", method= RequestMethod.GET)
    public String streamMapTestDemoURLMethod() throws CloneNotSupportedException {
        logger.info("logEntry:/streamMapTestDemoURLMethod url method");
        return miscellaneousInterface.streamMapTestDemoMethod();

    }





    // API-15
    @RequestMapping(value = "/dataStructuresURLMethod", method= RequestMethod.GET)
    public String dataStructuresURLMethod() {
        logger.info("logEntry:/dataStructuresURLMethod url method");
        return miscellaneousInterface.dataStructuresMethod();

    }


    // API-15
    @RequestMapping(value = "/wordCount", method= RequestMethod.GET)
    public String wordCount() {
        logger.info("logEntry:/wordCount url method");
        return miscellaneousInterface.wordCount();

    }















    // API-15
    @RequestMapping(value = "/testclass", method= RequestMethod.GET)
    public String testclass() {
        logger.info("logEntry:/testclass url method");
        return miscellaneousInterface.testclass();

    }



    //API 16
    //TestPrimeClass
    @RequestMapping(value = "/testprimeNumbers", method= RequestMethod.GET)
    public String testprimeNumbers() {
        logger.info("logEntry:/testprimeNumbers url method");
        return miscellaneousInterface.testprimeNumbers();

    }




    //API 17
    @RequestMapping(value = "/findmissingvalueinsequence", method= RequestMethod.GET)
    public String findMissingValueInSequence() {
        logger.info("logEntry:/findMissingValueInSequence url method");
        return miscellaneousInterface.findMissingValueInSequence();

    }

}
