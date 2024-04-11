package com.example.test.miscellaneous.service.suspendresumethread;

import java.util.logging.Logger;

public class SuspendResume {

    private static final Logger logger = Logger.getLogger(SuspendResume.class.getName());

    public String suspendResumeThread() {

        logger.info("LogEntry:suspendResumeThread method");
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");


        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            logger.info("Suspending thread One");


            Thread.sleep(1000);
            ob1.myresume();
            logger.info("Resuming thread One");

            ob2.mysuspend();
            logger.info("Suspending thread Two");

            Thread.sleep(1000);
            ob2.myresume();
            logger.info("Resuming thread Two");


        } catch (InterruptedException interruptedException) {
            logger.info("Main thread Interrupted");
            interruptedException.printStackTrace();
        }

        // wait for threads to finish
        try {
            logger.info("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            logger.info("Main thread Interrupted");
        }

        logger.info("LogExit:suspendResumeThread method");
        return "success";
    }


}
