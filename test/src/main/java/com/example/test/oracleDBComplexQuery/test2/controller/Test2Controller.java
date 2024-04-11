package com.example.test.oracleDBComplexQuery.test2.controller;

import com.example.test.oracleDBComplexQuery.controller.OracleDBController;
import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.oracleDBComplexQuery.test2.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;
@RequestMapping("api/v1/Test2Controller")
@RestController
public class Test2Controller {
        private static final Logger logger = Logger.getLogger(Test2Controller.class.getName());

        @Autowired
        RestTemplate restTemplate;

        @Autowired
        Test2Service test2Service;


    //oneToOneMappingWith mappedby column
        @RequestMapping(value = "/onetoone_mapping", method= RequestMethod.GET)
        public String onetooneMappingDemo() {
            String result="success";
            logger.info("log entry:/onetooneMappingDemo url method");
            result=test2Service.oneToOneMappingDemo();
            logger.info("log exit:/onetooneMappingDemo url method");
            return result;
        }

        //oneToOneMappingWithJoiningTableDemo
        @RequestMapping(value = "/onetoone_mapping_with_joiningtable_demo", method= RequestMethod.GET)
        public String oneToOneMappingWithJoiningTableDemo() {
            String result="success";
            logger.info("log entry:/oneToOneMappingWithJoiningTableDemo url method");
            result=test2Service.oneToOneMappingWithJoiningTableDemo();
            logger.info("log exit:/oneToOneMappingWithJoiningTableDemo url method");
            return result;
        }



        //oneToManyMappingDemo
        @RequestMapping(value = "/oneToManyMappingDemo", method= RequestMethod.GET)
        public String oneToManyMappingDemo() {
            String result="success";
            logger.info("log entry:/oneToManyMappingDemo url method");
            result=test2Service.oneToManyMappingDemo();
            logger.info("log exit:/oneToManyMappingDemo url method");
            return result;
        }



    //manyToManyMappingDemo
    @RequestMapping(value = "/manyToManyMappingDemo", method= RequestMethod.GET)
    public String manyToManyMappingDemo() {
        String result="success";
        logger.info("log entry:/manyToManyMappingDemo url method");
        result=test2Service.manyToManyMappingDemo();
        logger.info("log exit:/manyToManyMappingDemo url method");
        return result;
    }


    //manyToManyMappingDemo
    @RequestMapping(value = "/manyToManyMappingUsingJoinTableDemo", method= RequestMethod.GET)
    public String manyToManyMappingUsingJoinTableDemo() {
        String result="success";
        logger.info("log entry:/manyToManyMappingUsingJoinTableDemo url method");
        result=test2Service.manyToManyMappingUsingJoinTableDemo();
        logger.info("log exit:/manyToManyMappingUsingJoinTableDemo url method");
        return result;
    }

    }
