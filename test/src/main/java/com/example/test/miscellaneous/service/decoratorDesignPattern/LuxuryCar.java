package com.example.test.miscellaneous.service.decoratorDesignPattern;

import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.logging.Logger;

public class LuxuryCar extends CarDecorator {
    private static final Logger logger = Logger.getLogger(LuxuryCar.class.getName());

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        logger.info(" log entry:LuxuryCar.assemble method.");

        super.assemble();
        logger.info(" Adding features of Luxury Car.");
        logger.info(" log exit:LuxuryCar.assemble method.");

    }
}

