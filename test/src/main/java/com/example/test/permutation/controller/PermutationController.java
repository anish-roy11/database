package com.example.test.permutation.controller;

/*
http://localhost:9090/api/v1/permutation/permutation
 */

import com.example.test.oracleDBComplexQuery.controller.OracleDBController;
import com.example.test.oracleDBComplexQuery.entity.OracleTableAA1Entity;
import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.permutation.service.PermutationServiceImpl;
import com.example.test.restservice.controller.RestServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.logging.Logger;



@RequestMapping("api/v1/permutation")
@RestController

public class PermutationController {

    private static final Logger logger = Logger.getLogger(PermutationController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PermutationServiceImpl permutationService;



    @RequestMapping(value = "/permutation", method= RequestMethod.GET)
    public void printPermutation()
    {
        logger.info("logEntry:/printPermutation url method");
        String str = "abcde";
        permutationService.printPermutn(str, "");


        str = "pqrqsst";
        permutationService.printDistinctPermutn(str, "");
        logger.info("logExit:/printPermutation url method");
    }


}
