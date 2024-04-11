package com.example.test.miscellaneous.service.cloneable;

import java.lang.Cloneable;

public class TestCloneable implements Cloneable {

    int i;
    String s;
    TestCloneableComplex testCloneableComplex;

    // A class constructor
    public TestCloneable(int i,String s, TestCloneableComplex testCloneableComplex)
    {
        this.i = i;
        this.s = s;
        this.testCloneableComplex = testCloneableComplex;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}


