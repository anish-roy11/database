package com.example.test.miscellaneous.service.threads;

import java.util.logging.Logger;

public class RunnableImplementingC implements Runnable{
    private static final Logger logger = Logger.getLogger(RunnableImplementingC.class.getName());

    private int count2;


    @Override
    public void run() {
        processCount();
    }

    public int getCount() {
        return this.count2;
    }

    public void processCount() {
        logger.info("Thread.currentThread().getName()="+Thread.currentThread().getName() +":logEntry:processCount");
        for(int i=0; i < 5; i++){
            try {
                Thread.sleep(i*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count2++;
            logger.info("Thread.currentThread().getName()="+Thread.currentThread().getName() +":count="+count2);

        }
    }
}
