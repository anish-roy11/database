package com.example.test.miscellaneous.service.threads;

import java.util.logging.Logger;

public class RunnableImplementingA implements Runnable{
    private static final Logger logger = Logger.getLogger(RunnableImplementingA.class.getName());

    private int count;


    @Override
    public void run() {
        processCount();
    }

    public int getCount() {
        return this.count;
    }

synchronized public void processCount() {
    logger.info("Thread.currentThread().getName()="+Thread.currentThread().getName() +":logEntry:processCount");
    for(int i=0; i < 5; i++){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        logger.info("Thread.currentThread().getName()="+Thread.currentThread().getName() +":count="+count);

    }
}



}
