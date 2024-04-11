package com.example.test.excelfile.service;

import com.example.test.excelfile.dto.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.sql.Timestamp;
import java.util.logging.Logger;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter

public class ExcelServiceImpl {

    @Autowired
    Employee employee2;


    private static final Logger logger = Logger.getLogger(ExcelServiceImpl.class.getName());


    //public ResponseEntity<Object> createAndDownloadExcelFile()
    public void createAndDownloadExcelFile()
    {
        logger.info("logEntry:createAndDownloadExcelFile  method");
        ResponseEntity<Object> responseEntity =null;

        FileInputStream file = null;

        try {


            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet("Employee");
            sheet.setColumnWidth(0, 6000);
            sheet.setColumnWidth(1, 4000);
            sheet.setColumnWidth(2, 4000);
            sheet.setColumnWidth(3, 4000);
            sheet.setColumnWidth(4, 4000);

            Row header = sheet.createRow(0);

            CellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            XSSFFont font = ((XSSFWorkbook) workbook).createFont();
            font.setFontName("Arial");
            font.setFontHeightInPoints((short) 10);
            font.setBold(true);
            headerStyle.setFont(font);

            Cell headerCell = header.createCell(0);
            headerCell.setCellValue("SNo.");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(1);
            headerCell.setCellValue("ID");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(2);
            headerCell.setCellValue("Name");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(3);
            headerCell.setCellValue("DateOfBirth");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(4);
            headerCell.setCellValue("CreationTime");
            headerCell.setCellStyle(headerStyle);









            CellStyle style = workbook.createCellStyle();
            style.setWrapText(true);

            Row row = sheet.createRow(2);

            Cell cell = row.createCell(0);
            cell.setCellValue(1);
            cell.setCellStyle(style);

            cell = row.createCell(1);
            cell.setCellValue(12345);
            cell.setCellStyle(style);

            cell = row.createCell(2);
            cell.setCellValue("Joh Smith");
            cell.setCellStyle(style);



            CreationHelper creationHelper = workbook.getCreationHelper();
            CellStyle cellStyle = workbook.createCellStyle();
            short dateTimeFormat = creationHelper.createDataFormat().getFormat("yyyy-dd-mm");
            cellStyle.setDataFormat(dateTimeFormat);
            Cell cellDate = row.createCell(3);
            java.util.Date date1 = new java.util.Date();
            cellDate.setCellValue(date1);
            cellDate.setCellStyle(cellStyle);



            CreationHelper creationHelper2 = workbook.getCreationHelper();
            CellStyle cellStyle2 = workbook.createCellStyle();
            short dateTimeFormat2 = creationHelper.createDataFormat().getFormat("yyyy-dd-mm hh:mm:ss");
            cellStyle.setDataFormat(dateTimeFormat2);
            Cell cellDateTime = row.createCell(4);
            long long1 = 1576800000000l;
            Timestamp timestamp1 = new Timestamp(long1);
            cellDateTime.setCellValue(timestamp1);
            cellDateTime.setCellStyle(cellStyle);

//creating 2nd row of data
            CellStyle style2 = workbook.createCellStyle();
            style.setWrapText(true);

            Row row2 = sheet.createRow(2);

            Cell cell_row2 = row.createCell(0);
            cell_row2.setCellValue(2);
            cell_row2.setCellStyle(style);

            cell_row2 = row.createCell(1);
            cell_row2.setCellValue(56456);
            cell_row2.setCellStyle(style);

            cell_row2 = row.createCell(2);
            cell_row2.setCellValue("Jamie");
            cell_row2.setCellStyle(style);





            CreationHelper creationHelper_2_1 = workbook.getCreationHelper();
            CellStyle cellStyle_2_1 = workbook.createCellStyle();
            short dateTimeFormat_2_1 = creationHelper_2_1.createDataFormat().getFormat("yyyy-dd-mm");
            cellStyle_2_1.setDataFormat(dateTimeFormat_2_1);
            Cell cellDate_2_1 = row.createCell(3);
            java.util.Date date2 = new java.util.Date();
            cellDate_2_1.setCellValue(date2);
            cellDate_2_1.setCellStyle(cellStyle_2_1);





            CreationHelper creationHelper_2_2 = workbook.getCreationHelper();
            CellStyle cellStyle_2_2 = workbook.createCellStyle();
            short dateTimeFormat_2_2 = creationHelper_2_2.createDataFormat().getFormat("yyyy-dd-mm hh:mm:ss");
            cellStyle_2_2.setDataFormat(dateTimeFormat2);
            Cell cellDateTime_2_2 = row.createCell(4);
            long long2 = 1576830000000l;
            Timestamp timestamp2 = new Timestamp(long1);
            cellDateTime_2_2.setCellValue(timestamp1);
            cellDateTime_2_2.setCellStyle(cellStyle);


            try {
                String fileName = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\1_testPRJ\\1_myFiles\\7_ExcelFiles\\TestExcelFile.xlsx";
                //file = new FileInputStream(new File("C:\\1nOS\\installedFiles\\Intellij_IDEA\\1_testPRJ\\1_myFiles\\7_ExcelFiles\\"));

                OutputStream outputStream = new FileOutputStream(fileName);
                workbook.write(outputStream);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }




        } catch (FileNotFoundException e) {
            logger.info("logEntry:FileNotFoundException  exception");
            e.printStackTrace();
        }
        catch (IOException e) {
            logger.info("logEntry:IOException  exception");
            e.printStackTrace();
        }



        logger.info("logExit:createAndDownloadExcelFile  method");
        //return responseEntity;
    }



    public void createAndDownloadExcelFile2()
    {
        logger.info("logEntry:createAndDownloadExcelFile2  method");
        ResponseEntity<Object> responseEntity =null;

        FileInputStream file = null;

        try {


            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet("Persons");
            sheet.setColumnWidth(0, 6000);
            sheet.setColumnWidth(1, 4000);
            sheet.setColumnWidth(2, 6000);

            //table header
            Row header = sheet.createRow(0);

            CellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            //headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            XSSFFont font = ((XSSFWorkbook) workbook).createFont();
            font.setFontName("Arial");
            font.setFontHeightInPoints((short) 10);
            font.setBold(true);
            headerStyle.setFont(font);

            Cell headerCell = header.createCell(0);
            headerCell.setCellValue("Name");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(1);
            headerCell.setCellValue("Age");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(2);
            headerCell.setCellValue("StartTime");
            headerCell.setCellStyle(headerStyle);





            //table values
            CellStyle style = workbook.createCellStyle();
            style.setWrapText(true);

            Row row1 = sheet.createRow(1);

            Cell cell = row1.createCell(0);
            cell.setCellValue("John Smith");
            cell.setCellStyle(style);

            cell = row1.createCell(1);
            cell.setCellValue(20);
            cell.setCellStyle(style);

            CreationHelper creationHelper1 = workbook.getCreationHelper();
            CellStyle cellStyle1 = workbook.createCellStyle();
            short dateTimeFormat1 = creationHelper1.createDataFormat().getFormat("yyyy-dd-mm hh:mm:ss");
            cellStyle1.setDataFormat(dateTimeFormat1);
            Cell cellDateTime1 = row1.createCell(2);
            long long1 = 1576860000000l;
            Timestamp timestamp1 = new Timestamp(long1);
            cellDateTime1.setCellValue(timestamp1);
            cellDateTime1.setCellStyle(cellStyle1);


            //populating row2 columns
            Row row2 = sheet.createRow(2);
            Cell row2Cell = row2.createCell(0);
            row2Cell.setCellValue("Michael Adam");
            row2Cell.setCellStyle(style);

            row2Cell = row2.createCell(1);
            row2Cell.setCellValue(24);
            row2Cell.setCellStyle(style);

            CreationHelper creationHelper2 = workbook.getCreationHelper();
            CellStyle cellStyle2 = workbook.createCellStyle();
            short dateTimeFormat2 = creationHelper2.createDataFormat().getFormat("yyyy-dd-mm hh:mm:ss");
            cellStyle2.setDataFormat(dateTimeFormat2);
            Cell cellDateTime2 = row2.createCell(2);
            long long2 = 1656843000000l;
            Timestamp timestamp2 = new Timestamp(long2);
            cellDateTime2.setCellValue(timestamp2);
            cellDateTime2.setCellStyle(cellStyle2);



            try {
                String fileName = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\1_testPRJ\\1_myFiles\\7_ExcelFiles\\TestExcelFile.xlsx";
                //file = new FileInputStream(new File("C:\\1nOS\\installedFiles\\Intellij_IDEA\\1_testPRJ\\1_myFiles\\7_ExcelFiles\\"));

                OutputStream outputStream = new FileOutputStream(fileName);
                workbook.write(outputStream);
                workbook.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }




        } catch (FileNotFoundException e) {
            logger.info("logEntry:FileNotFoundException  exception");
            e.printStackTrace();
        }
        catch (IOException e) {
            logger.info("logEntry:IOException  exception");
            e.printStackTrace();
        }



        logger.info("logExit:createAndDownloadExcelFile2  method");
        //return responseEntity;
    }
}
