package com.example.test.oracleDBComplexQuery.test3.controller;

import com.example.test.oracleDBComplexQuery.controller.OracleDBController;
import com.example.test.oracleDBComplexQuery.impl.OracleDBService;
import com.example.test.oracleDBComplexQuery.test2.controller.Test2Controller;
import com.example.test.oracleDBComplexQuery.test2.service.Test2Service;
import com.example.test.oracleDBComplexQuery.test3.entity.Book;
import com.example.test.oracleDBComplexQuery.test3.entity.Booking;
import com.example.test.oracleDBComplexQuery.test3.entity.Customer;
import com.example.test.oracleDBComplexQuery.test3.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
@RequestMapping("api/v1/bookings")
@RestController

public class BookingController {
    private static final Logger logger = Logger.getLogger(BookingController.class.getName());

    @Autowired
    BookingService bookingService;

    // some booking apis which return Booking objects


    @RequestMapping(value = "/getAllBookingsBy", method= RequestMethod.GET)
    public String getAllBookingsBy() {
        logger.info("log entry:getAllBookingsBy url method");
        String phone = "3423454568";
        List<String> authors = new ArrayList<String>();
        authors.add("author2");
        authors.add("author3");
        authors.add("author4");

        bookingService.getAllBy(phone, authors);
        return "success";
    }


    @RequestMapping(value = "/addBooking", method= RequestMethod.GET)
    //public Booking addBooking(@RequestBody Booking booking) {
    public Booking addBooking() {
        logger.info("log entry:addBooking url method");

        Book book2 = new Book(123456,"bookname2","author2");
        Customer customer2 = new Customer(234341,"name12","3423454568");
        Booking booking2 = new Booking(349871,123456,234341,book2,customer2);

        Book book3 = new Book(123457,"bookname3","author4");
        Customer customer3 = new Customer(234342,"name13","3423454569");
        Booking booking3 = new Booking(349872,123457,234342,book3,customer3);

        Book book4 = new Book(123458,"bookname4","author2");
        Customer customer4 = new Customer(234344,"name14","3423454568");
        Booking booking4 = new Booking(349874,123458,234344,book4,customer4);

        bookingService.saveBooking(booking2);
        bookingService.saveBooking(booking3);
        bookingService.saveBooking(booking4);

        return booking2;
    }
}