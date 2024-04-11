package com.example.test.miscellaneous.service.cloneable;


public class TestCloneablePOC
{
    public String testCloneableMethod() throws CloneNotSupportedException
    {
        String result="success";
        TestCloneableComplex testCloneableComplex = new TestCloneableComplex("test", 10,100.20);
        TestCloneable testCloneable_1 = new TestCloneable(20, "GeeksForGeeks",testCloneableComplex);

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        TestCloneable testCloneable_2 = (TestCloneable)testCloneable_1.clone();

        System.out.println(testCloneable_2.i);
        System.out.println(testCloneable_2.s);
        System.out.println(testCloneable_2.testCloneableComplex.x);
        System.out.println(testCloneable_2.testCloneableComplex.f);
        System.out.println(testCloneable_2.testCloneableComplex.s);

        return result;
    }
}
