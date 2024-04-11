package com.example.test.testbase64.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("api/v1/file")
public class FileDownloadController {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FileDownloadController.class.getName());

    @RequestMapping(value="/download", method=RequestMethod.GET)
    public ResponseEntity<Object> downloadFile() throws IOException {
        //Logger logger = Logger.getLogger("FileDownloadController");
        logger.info("logentry: FileDownloadController>>downloadFile");

        //String filename = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile\\test 3.txt";
        //String filename = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile\\Capture21.JPG";
        //String filename = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\fileUploadDownload\\1_myFiles\\2_uploadedFile\\test1.docx";
        String filename = "C:\\1nOS\\installedFiles\\Intellij_IDEA\\testPRJ\\1_myFiles\\2_uploadedFile\\test2.pdf";
        File file = new File(filename);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment;filename=\"%s\"", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, mustrevalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/txt"))
                .body(resource);
        return responseEntity;
    }
}

