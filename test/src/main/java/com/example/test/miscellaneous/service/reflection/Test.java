package com.example.test.miscellaneous.service.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    // creating a private field
    private String s;

    // Constructor of this class

    // Constructor 1
    // Public constructor
    public Test() {
        s = "GeeksforGeeks";
    }


    // no arguments
    public void method1() {
        System.out.println("The string is " + s);
    }


    // int as argument
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }


    // Private method
    private void method3()
    {
        System.out.println("Private method invoked");
    }
}

