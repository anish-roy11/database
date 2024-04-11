package com.example.test.miscellaneous.service.singleton;

import java.io.*;
import java.util.logging.Logger;

public class SingletonService {

    private static final Logger logger = Logger.getLogger(SingletonService.class.getName());

    public String singletonDemo() {
        String result="success";
        Singleton x = Singleton.singletonMethod();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.singletonMethod();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.singletonMethod();

        // Now  changing variable of instance x
        // via toUpperCase() method
        x.s = (x.s).toUpperCase();

        // Print and display commands
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // Now again changing variable of instance x
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);

        //print hashcodes
        System.out.println(" x.hashCode()=" +  x.hashCode());
        System.out.println(" y.hashCode()=" +  y.hashCode());
        System.out.println(" z.hashCode()=" +  z.hashCode());
        //code for Singelton ends
























        //code for Singelton3 starts
        Singleton3 singleton_3_1 = Singleton3.getInstanceMethod();
        Singleton3 singleton_3_2 = Singleton3.getInstanceMethod();
        Singleton3 singleton3_3 = Singleton3.getInstanceMethod();

        logger.info("singleton3_1.str="+ singleton_3_1.str);
        logger.info("singleton3_2.str="+ singleton_3_2.str);
        logger.info("singleton3_3.str="+ singleton3_3.str);

        logger.info("singleton3_1.hashCode="+ singleton_3_1.hashCode());
        logger.info("singleton3_2.hashCode="+ singleton_3_2.hashCode());
        logger.info("singleton3_3.hashCode="+ singleton3_3.hashCode());
        //code for Singelton3 ends



        return result;

    }

}
