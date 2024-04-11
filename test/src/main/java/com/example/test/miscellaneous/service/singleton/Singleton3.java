package com.example.test.miscellaneous.service.singleton;

//this is most widely used Singleton class design
public class Singleton3 {



    // Declaring a variable of type String
    public String str;


    // private constructor
    private Singleton3()
    {
        this.str="Singleton3.str has been initialized here";
    }

    // Inner class to provide instance of Singleton3 class
    private static class BillPughSingleton
    {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstanceMethod(){

        return BillPughSingleton.INSTANCE;
    }




}
