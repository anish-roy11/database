package com.example.test.testbase64.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.web.servlet.error.ErrorController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin(origins="*", allowedHeaders = "*")
public class CustomErrorController implements ErrorController{

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
        System.out.println("logEntry CustomErrorController>>handleError method");
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            System.out.println("statusCode=="+statusCode);
/*
            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "error-404";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "error-500";
            }

 */
        }
        //return "error";
        return "<h1>Something went wrong!</h1>";
    }



    public String getErrorPath() {
        return "/error";
    }
    /*
    public String getErrorPath() {
        System.out.println("logEntry ErrorController.java>>getErrorPath method");
        //return "forward:/error.html";
        return "error.html";
    }

     */
}
