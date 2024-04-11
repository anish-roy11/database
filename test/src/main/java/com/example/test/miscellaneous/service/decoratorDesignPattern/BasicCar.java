package com.example.test.miscellaneous.service.decoratorDesignPattern;

import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.logging.Logger;

public class BasicCar implements Car {
    private static final Logger logger = Logger.getLogger(BasicCar.class.getName());

    @Override
    public void assemble() {
        logger.info("log entry:BasicCar.assemble method.");
        logger.info("Basic Car.");
        logger.info("log exit:BasicCar.assemble method.");
    }

}

