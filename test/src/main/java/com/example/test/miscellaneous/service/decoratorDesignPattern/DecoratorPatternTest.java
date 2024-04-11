package com.example.test.miscellaneous.service.decoratorDesignPattern;

import com.example.test.miscellaneous.service.TestMiscellaneous;

import java.util.logging.Logger;

public class DecoratorPatternTest {
    private static final Logger logger = Logger.getLogger(DecoratorPatternTest.class.getName());

    public void decoratorPatternTestMethod()
    {
        logger.info("log entry:decoratorPatternTestMethod method");
        Car car1 = new BasicCar();
        Car car2 = new SportsCar(car1);

        Car car3 = new BasicCar();
        Car car4 = new LuxuryCar(car3);
        Car car5 = new SportsCar(car4);


        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        logger.info("*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        logger.info("log exit:decoratorPatternTestMethod method");

    }
}
