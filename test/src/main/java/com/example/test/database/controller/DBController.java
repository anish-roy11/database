package com.example.test.database.controller;


import com.example.test.database.entity.EmployeeEntity;
import com.example.test.database.impl.EmployeeService;
import com.example.test.restservice.controller.RestServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;


@RequestMapping("api/v1/db")
@RestController

public class DBController {
    //private static final Logger logger = Logger.getLogger(RestServiceController.class.getName());
    private static final Logger logger = Logger.getLogger(DBController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/getEmployeeList", method= RequestMethod.GET)
    public List<EmployeeEntity> getEmployeeList() {
        logger.info("logEntry:/getEmployeeList url method");
        return employeeService.getAllEmployeeEntityList();
    }

}
