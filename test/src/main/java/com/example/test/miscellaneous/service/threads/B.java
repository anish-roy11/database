package com.example.test.miscellaneous.service.threads;

import java.util.logging.Logger;

public class B {
    int count2;

    private static final Logger logger = Logger.getLogger(B.class.getName());
    public String threadDemo() throws InterruptedException {

        String result = "success";


        //RunnableImplementingA implements Runnable
        RunnableImplementingA runnableImplementingA = new RunnableImplementingA();

        Thread thread1 = new Thread(runnableImplementingA, "RunnableImplementingA_Thread1");
        thread1.start();

        Thread thread2 = new Thread(runnableImplementingA, "RunnableImplementingA_Thread2");
        thread2.start();

        //RunnableImplementingA implements Runnable
        RunnableImplementingC runnableImplementingC = new RunnableImplementingC();

        Thread thread3 = new Thread(runnableImplementingC, "RunnableImplementingC_Thread1");
        Thread thread4 = new Thread(runnableImplementingC, "RunnableImplementingC_Thread2");

        synchronized (this)
        {
            logger.info("logEntry:synchronized block1");
            processCountofMain();
            logger.info("log exit:synchronized block1");
        }

        synchronized (this)
        {
            logger.info("logEntry:synchronized block2");
            processCountofMain();
            logger.info("log exit:synchronized block2");
        }

        //wait for threads to finish processing
        thread1.join();
        thread2.join();

        System.out.println("count="+ runnableImplementingA.getCount());
        System.out.println("count2="+ runnableImplementingC.getCount());
        return result;
    }

    public void processCountofMain(){
        logger.info("Thread.currentThread().getName()="+Thread.currentThread().getName() +":log entry:processCountofMain");
        for(int i=0; i < 5; i++){
            try {
                Thread.sleep(i*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.count2++;


        }
        logger.info("Thread.currentThread().getName()="+Thread.currentThread().getName() +":log exit:processCountofMain");
    }


}
