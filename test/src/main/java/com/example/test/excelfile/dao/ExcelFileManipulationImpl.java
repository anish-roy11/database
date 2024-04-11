package com.example.test.excelfile.dao;

import com.example.test.excelfile.controller.ExcelFileController;
import com.example.test.excelfile.dto.Employee;
import com.example.test.excelfile.service.ExcelServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter

//@Repository("ExcelFileManipulation")
@Service
public class ExcelFileManipulationImpl implements ExcelFileManipulation{


    //@Autowired
    //ExcelServiceImpl excelServiceImpl;

    private static final Logger logger = Logger.getLogger(ExcelFileController.class.getName());

    @Override
    public void createAndDownloadExcelFile()
    {

        logger.info("log entry:createAndDownloadExcelFile method");

        ExcelServiceImpl excelServiceImpl = new ExcelServiceImpl();
        //excelServiceImpl.createAndDownloadExcelFile();
        excelServiceImpl.createAndDownloadExcelFile2();


        logger.info("log exit:createAndDownloadExcelFile method");
        return;
    }
}
