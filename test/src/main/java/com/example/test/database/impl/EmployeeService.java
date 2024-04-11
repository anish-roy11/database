package com.example.test.database.impl;

import com.example.test.database.entity.EmployeeEntity;
import com.example.test.database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

    public List<EmployeeEntity> getAllEmployeeEntityList() {
        logger.info("logEntry:getAllEmployeeEntityList method");

        List<EmployeeEntity> employeeEntityList2 = employeeRepository.findAll();
        employeeEntityList2.forEach(System.out :: println);

        logger.info("logExit:getAllEmployeeEntityList method");
        return employeeEntityList2;
    }

}
