package com.example.test.testbase64.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;


@RequestMapping("api/v1/file")
//@Controller
@RestController
public class FileUploadController {

private static final Logger logger = Logger.getLogger(FileUploadController.class.getName());

    @RequestMapping("/index")
    public ModelAndView index () {
        logger.info("using java.util.logger");
        logger.info("logEntry FileUploadController>>hello method=");
        System.out.println("logEntry FileUploadController>>hello method=");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("uploader.html");
        return modelAndView;
    }


/*
    //@GetMapping("/index")
    //@RequestMapping(value="/index", method= RequestMethod.GET)
    @GetMapping("/index")
    public String hello() {
        System.out.println("logEntry FileUploadController>>hello method=");
        return "uploader";
    }

 */

    @RequestMapping(value="/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        logger.info("logEntry: fileUpload method");
        System.out.println("logEntry FileUploadController>>fileUpload method=");
        File convertFile = new File("C:\\1nOS\\installedFiles\\Intellij_IDEA\\testPRJ\\1_myFiles\\2_uploadedFile\\"+file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();
        return "File is upload successfully";
    }
}
