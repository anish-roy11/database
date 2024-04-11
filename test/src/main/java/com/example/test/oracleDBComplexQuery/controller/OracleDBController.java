package com.example.test.oracleDBComplexQuery.controller;


//import com.example.test.database.entity.EmployeeEntity;
import com.example.test.database.entity.EmployeeEntity;
import com.example.test.database.impl.EmployeeService;
import com.example.test.oracleDBComplexQuery.entity.OracleTableAA1Entity;
import com.example.test.oracleDBComplexQuery.entity.StudentEntity;
import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.restservice.controller.RestServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.logging.Logger;
import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.oracleDBComplexQuery.repository.OracleTableAA1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableBB1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableCC1Repository;
import com.example.test.oracleDBComplexQuery.entity.OracleEmployeeEntity;



@RequestMapping("api/v1/oracledb")
@RestController

public class OracleDBController {
    private static final Logger logger = Logger.getLogger(OracleDBController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OracleDBService oracleDBService;



    @RequestMapping(value = "/getComplexQueryResult", method= RequestMethod.GET)
    public List<Object[]> getComplexQueryResult() {
        logger.info("logEntry:/getComplexQueryResult url method");
        return oracleDBService.getComplexQueryResult();
    }


    @RequestMapping(value = "/getTableAA1Data", method= RequestMethod.GET)
    public List<OracleTableAA1Entity> getTableAA1Data() {
        logger.info("logEntry:/getTableAA1Data url method");
        return oracleDBService.getOracleTableAA1Entity();
    }


    @RequestMapping(value = "/createStudent", method= RequestMethod.POST)
    public StudentEntity createStudent(@RequestBody StudentEntity studentEntity) {
        logger.info("logEntry:/createStudent url method");
        return oracleDBService.createStudent(studentEntity);
    }

    @RequestMapping(value = "/getStudents", method= RequestMethod.GET)
    public List<StudentEntity> getStudents() {
        logger.info("logEntry:/getStudents url method");
        return oracleDBService.getStudents();
    }



    @RequestMapping(value = "/updateStudent", method= RequestMethod.PUT)
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
        logger.info("logEntry:/updateStudent url method");
        return oracleDBService.updateStudent(studentEntity);
    }




    @RequestMapping(value = "/deleteStudent", method= RequestMethod.DELETE)
    public String deleteStudent(@RequestBody StudentEntity studentEntity) {
        logger.info("logEntry:/deleteStudent url method");
        return oracleDBService.deleteStudent(studentEntity);
    }
}
