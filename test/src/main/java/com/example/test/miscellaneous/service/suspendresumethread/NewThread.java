package com.example.test.miscellaneous.service.suspendresumethread;

import java.util.logging.Logger;

//suspending and resuming thread the modern way
public class NewThread implements Runnable {
    private static final Logger logger = Logger.getLogger(NewThread.class.getName());

    String name; // name of thread
    boolean suspendFlag;
    public Thread t;

    public NewThread(String threadname) {
        name = threadname;
        suspendFlag = false;
        t = new Thread(this, name);
        logger.info("New thread:=" + t);
        t.start(); // Start the thread
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                logger.info(name + ": " + i);
                Thread.sleep(200);

                synchronized (this) {    //synchronized block
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException interruptedException) {
            logger.info(name + " interrupted.");
            interruptedException.printStackTrace();
        }
        logger.info(name + " exiting.");
    }


    public void mysuspend() {
        suspendFlag = true;
    }

    synchronized public void myresume() {
        suspendFlag = false;
        notify();
    }
}
