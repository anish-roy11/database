package com.example.test.miscellaneous.service.decoratorDesignPattern;


import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.logging.Logger;

public class SportsCar extends CarDecorator {
    private static final Logger logger = Logger.getLogger(SportsCar.class.getName());

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        logger.info(" log entry:SportsCar.assemble overridden method");
        super.assemble();
        logger.info(" Adding features of Sports Car.");
        logger.info(" log exit:SportsCar.assemble overridden method");
    }
}

