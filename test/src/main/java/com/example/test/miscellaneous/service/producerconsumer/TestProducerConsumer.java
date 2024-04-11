package com.example.test.miscellaneous.service.producerconsumer;

import java.util.logging.Logger;

public class TestProducerConsumer {
    private static final Logger logger = Logger.getLogger(TestProducerConsumer.class.getName());

    public String testProducerConsumer() {
        logger.info("logEntry:testProducerConsumer method");
        Queue queue = new Queue();
        new Producer(queue);
        new Consumer(queue);
        logger.info("Press Control-C to stop.");

        return "successfully created producer-consumer scenario";
    }
}
