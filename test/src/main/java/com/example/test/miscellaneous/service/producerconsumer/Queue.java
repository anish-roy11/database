package com.example.test.miscellaneous.service.producerconsumer;

import java.util.logging.Logger;

public class Queue {
    private static final Logger logger = Logger.getLogger(Queue.class.getName());

    int n;
    boolean valueSet;

    public Queue() {
        this.n = 0;
        this.valueSet = false;
    }

    synchronized int get() {
        //logger.info("logEntry:queue get method");
        while (!valueSet) {
            //logger.info("logEntry:get ->  while (!valueSet). Calling wait of get method");
            try {
                wait();
                //logger.info("after wait of get method");
            } catch (InterruptedException e) {
                logger.info("InterruptedException caught");
                e.printStackTrace();
            }
            //logger.info("logExit:get ->  while (!valueSet) ");
        }

        logger.info("Got:" + n);
        valueSet = false;

        //logger.info("before notify of get method");
        notify();
        //logger.info("After notify of get method");

        //logger.info("logExit:queue get method");
        return n;

    }

    synchronized void put(int n) {
        //logger.info("logEntry:queue put method");
        while (valueSet) {
            //logger.info("logEntry:put -> while (valueSet). Calling wait method of put ");
            try {
                wait();
                //logger.info("after wait of put method");
            } catch (InterruptedException e) {
                logger.info("InterruptedException caught");
                e.printStackTrace();
            }
            //logger.info("logExit:put -> while (valueSet) ");
        }
        this.n = n;
        valueSet = true;
        logger.info("Put:" + n);

        //logger.info("before notify of put");
        notify();
        //logger.info("after notify of put");

        //logger.info("logExit:queue put method");
    }


}
