package com.example.test.miscellaneous.service.decoratorDesignPattern;

import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.logging.Logger;

public class CarDecorator implements Car {
    private static final Logger logger = Logger.getLogger(CarDecorator.class.getName());

    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        logger.info(" log entry:CarDecorator.assemble method.");
        this.car.assemble();
        logger.info(" log exit:CarDecorator.assemble method");
    }

}

