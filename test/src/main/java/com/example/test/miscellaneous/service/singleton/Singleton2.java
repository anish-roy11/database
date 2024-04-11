package com.example.test.miscellaneous.service.singleton;

public class Singleton2 {


    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static Singleton2 instance;

    // Declaring a variable of type String
    public String str;

    private Singleton2()
    {
        // private constructor
        this.str = "Singleton2.str has been initialized here";
    }

    public static Singleton2 getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (Singleton2.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new Singleton2();
                }

            }
        }
        return instance;
    }

}
