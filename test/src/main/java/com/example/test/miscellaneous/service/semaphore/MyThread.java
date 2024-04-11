package com.example.test.miscellaneous.service.semaphore;

// use of semaphores Locks
import com.example.test.miscellaneous.service.serialize_deserialize.TestSerializeDeserialize;

import java.util.concurrent.*;
import java.util.logging.Logger;

//A shared resource/class.
//class Shared
//{
//    static int count = 0;
//}

public class MyThread extends Thread
{
    private static final Logger logger = Logger.getLogger(MyThread.class.getName());
    Semaphore semaphore;
    String threadName;

    public MyThread(Semaphore sem, String threadName)
    {
        super(threadName);
        this.semaphore = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        // run by thread A
        if(this.getName().equals("A"))
        {
            logger.info("Starting " + threadName);
            try
            {
                // First, get a permit.
                logger.info(threadName + " is waiting for a permit.");

                // acquiring the lock
                semaphore.acquire();

                logger.info(threadName + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this
                // thread release the lock
                for(int i=0; i < 5; i++)
                {
                    Shared.count++;
                    logger.info(threadName + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread B to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

            // Release the permit.
            logger.info(threadName + " releases the permit.");
            semaphore.release();
        }

        // run by thread B
        else
        {
            logger.info("Starting " + threadName);
            try
            {
                // First, get a permit.
                logger.info(threadName + " is waiting for a permit.");

                // acquiring the lock
                semaphore.acquire();

                logger.info(threadName + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this
                // thread release the lock
                for(int i=0; i < 5; i++)
                {
                    Shared.count--;
                    logger.info(threadName + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread A to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {

                exc.printStackTrace();
            }
            // Release the permit.
            logger.info(threadName + " releases the permit.");
            semaphore.release();
        }
    }
}

