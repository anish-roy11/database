package com.example.test.linkedlist.controller;



import com.example.test.linkedlist.dao.DoubleLinkedListImpl;
import com.example.test.linkedlist.dao.LinkedListImpl;
import com.example.test.restservice.controller.RestServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RequestMapping("api/v1/linkedlist")
@RestController
public class LinkedListController {


    private static final Logger logger = Logger.getLogger(RestServiceController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/createlinkedlist", method= RequestMethod.POST)
    public void createlinkedlist() {
        logger.info("logEntry:/createlinkedlist url method");

        LinkedListImpl linkedListImpl = new LinkedListImpl();
        linkedListImpl.workWithLinkedList();

        logger.info("logExit:/createlinkedlist url method");
        //return numberList2;

    }




    @RequestMapping(value = "/createdoublelinkedlist", method= RequestMethod.POST)
    public void createdoublelinkedlist() {
        logger.info("logEntry:/createdoublelinkedlist url method");

        DoubleLinkedListImpl doubleLinkedListImpl = new DoubleLinkedListImpl();
        doubleLinkedListImpl.workWithDoubleLinkedList();

        logger.info("logExit:/createdoublelinkedlist url method");
        //return numberList2;

    }
}
