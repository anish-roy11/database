package com.example.test.excelfile.controller;



import com.example.test.excelfile.dao.ExcelFileManipulationImpl;
import com.example.test.excelfile.dto.Employee;
import com.example.test.excelfile.service.ExcelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.logging.Logger;

@RequestMapping("api/v1/excelFile")
@RestController
public class ExcelFileController {

    @Autowired
    RestTemplate restTemplate;

    //@Autowired
    //ExcelServiceImpl excelServiceImpl;

    @Autowired
    ExcelFileManipulationImpl excelFileManipulationImpl;

    //@Autowired
    //Employee employee;

    private static final Logger logger = Logger.getLogger(ExcelFileController.class.getName());



    @RequestMapping(value = "/downloadExcelFile", method= RequestMethod.POST)
    public void downloadExcelFile() {
        logger.info("logEntry:/downloadExcelFile url method");
        //excelServiceImpl.createAndDownloadExcelFile();
        excelFileManipulationImpl.createAndDownloadExcelFile();



        logger.info("logExit:/downloadExcelFile url method");
        //return numberList2;

    }
}
