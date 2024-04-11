package com.example.test.miscellaneous.service.producerconsumer;

import com.example.test.miscellaneous.service.suspendresumethread.SuspendResume;

import java.util.logging.Logger;

public class Consumer implements Runnable {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());

    Queue queue;
    Thread thread1;

    public Consumer(Queue queue) {
        this.queue = queue;
        thread1 = new Thread(this, "ConsumerThread");
        thread1.start();
    }

    public void run() {
        for(int j=0; j < 10; j++)
        {
            queue.get();
        }
        logger.info("end of consumer run method");
    }

    /*
    //for infinite loop
    public void run() {
        while(true) {
            queue.get();
        }
    }

     */

}

