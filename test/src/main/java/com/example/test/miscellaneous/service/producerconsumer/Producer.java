package com.example.test.miscellaneous.service.producerconsumer;

import java.util.logging.Logger;

public class Producer implements Runnable {
    private static final Logger logger = Logger.getLogger(Producer.class.getName());
    Queue queue;
    Thread thread1;

    public Producer(Queue queue) {
        this.queue = queue;
        this.thread1 = new Thread(this, "ProducerThread");
        thread1.start();
    }

    public void run() {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            queue.put(i++);
        }
        logger.info("end of producer run method");
    }
    /*
    //for infinite loop
    public void run() {
        int i = 0;
        while(true) {
            queue.put(i++);
        }
    }

     */
}


