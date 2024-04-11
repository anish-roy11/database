package com.example.test.randomNumberGenerator.controller;



import com.example.test.database.entity.EmployeeEntity;
import com.example.test.database.impl.EmployeeService;
import com.example.test.demo.model.Person;
import com.example.test.randomNumberGenerator.dao.RandomNumberParameters;
import com.example.test.restservice.controller.RestServiceController;
//import com.sun.istack.internal.NotNull;
//import com.sun.istack.NotNull;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@RequestMapping("api/v1/random")
@RestController
public class RandomNumberGeneratorController {

    private static final Logger logger = Logger.getLogger(RestServiceController.class.getName());

    @Autowired
    RestTemplate restTemplate;



    @RequestMapping(value = "/numberGenerator", method= RequestMethod.GET)
    //public List<Integer[]> getRandomNumbers(@Valid @NotNull @RequestBody RandomNumberParameters randomNumberParameters) {
    //public int[] getRandomNumbers(@Valid @NotNull @RequestBody RandomNumberParameters randomNumberParameters) {
    public int[] getRandomNumbers() {
        logger.info("logEntry:/getEmployeeList url method");
        RandomNumberParameters randomNumberParameters = new RandomNumberParameters(100,50,9,10,20);

        List<Integer[]> randomNumbers = new ArrayList<Integer[]>();
        int noOfRandomNumbers = randomNumberParameters.getNoOfRandomNumbers();
        int a = randomNumberParameters.getA();
        int b = randomNumberParameters.getB();
        int m = randomNumberParameters.getM();
        int seed = randomNumberParameters.getSeed();

        int randomNumbersArray[] = new int[noOfRandomNumbers];


        randomNumbersArray[0] = randomNumberParameters.getSeed();
        for(int i=1; i < noOfRandomNumbers; i++)
        {
            randomNumbersArray[i] = (a * randomNumbersArray[i-1] + b) % m;

        }

        //randomNumbers.add(randomNumbersArray);
        logger.info("logExit:/getEmployeeList url method");
        return randomNumbersArray;
    }
}
