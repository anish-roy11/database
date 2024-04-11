package com.example.test.oracleDBComplexQuery.test3.service;

import com.example.test.oracleDBComplexQuery.test3.controller.BookingController;
import com.example.test.oracleDBComplexQuery.test3.entity.Booking;
import com.example.test.oracleDBComplexQuery.test3.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class BookingService {
    private static final Logger logger = Logger.getLogger(BookingService.class.getName());

    @Autowired
    private BookingRepository bookingRepository;

    // some booking service methods

    // get all bookings booked by a customer with matching phone number and books written by a given list of authors
    public void getAllBy(String phone, List<String> authors) {
        logger.info("log entry: getAllBy method");
        List<Booking> bookingsList = new ArrayList<Booking>();

        bookingsList =  bookingRepository.queryBy(phone, authors);

        logger.info("bookingsList.size() = "+bookingsList.size());
        for(int i=0; i < bookingsList.size(); i++)
        {
            logger.info("i==" +i);
            Booking booking = bookingsList.get(i);
            logger.info("booking.getId==" + booking.getId());
            logger.info("booking.getBookId==" + booking.getBookId());
            logger.info("booking.getCustomerId==" + booking.getCustomerId());

            logger.info("booking.getCustomer1().getId==" + booking.getCustomer1().getId());
            logger.info("booking.getCustomer1().getName==" + booking.getCustomer1().getName());
            logger.info("booking.getCustomer1().getPhone==" + booking.getCustomer1().getPhone());

            logger.info("booking.getBook1().getId==" + booking.getBook1().getId());
            logger.info("booking.getBook1().getAuthor==" + booking.getBook1().getAuthor());
            logger.info("booking.getBook1().getBookName==" + booking.getBook1().getBookName());

        }
    }

    public void saveBooking(Booking booking) {
        logger.info("log entry:saveBooking method ");
        bookingRepository.save(booking);
    }
}
