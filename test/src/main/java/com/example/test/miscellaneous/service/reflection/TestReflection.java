package com.example.test.miscellaneous.service.reflection;

import com.example.test.miscellaneous.service.TestMiscellaneous;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class TestReflection {
    private static final Logger logger = Logger.getLogger(TestReflection.class.getName());

    public void testReflectionMethod(){
        logger.info("log entry:testReflectionMethod method");
        try{
            // Creating object whose property is to be checked

            // Creating an object of class 1 inside main()
            // method
            Test obj = new Test();

            // Creating class object from the object using
            // getClass() method
            Class class1 = obj.getClass();

            // Printing the name of class
            // using getName() method
            System.out.println("The name of class is " + class1.getName());

            // Getting the constructor of the class through the
            // object of the class
            Constructor constructor = class1.getConstructor();

            // Printing the name of constructor
            // using getName() method
            System.out.println("The name of constructor is "+ constructor.getName());

            // Display message only
            System.out.println("The public methods of class are : ");

            // Getting methods of the class through the object
            // of the class by using getMethods
            Method[] methods = class1.getMethods();

            // Printing method names
            for (Method method : methods)
            {
                System.out.println(method.getName());
            }


            // Creates object of desired method by
            // providing the method name and parameter class as
            //  arguments to the getDeclaredMethod() method
            Method methodcall1 = class1.getDeclaredMethod("method2", int.class);

            // Invoking the method at runtime
            methodcall1.invoke(obj, 19);

            // Creates object of the desired field by
            // providing the name of field as argument to the
            // getDeclaredField() method
            Field field = class1.getDeclaredField("s");

            // Allows the object to access the field
            // irrespective of the access specifier used with
            // the field
            field.setAccessible(true);

            // Takes object and the new value to be assigned
            // to the field as arguments
            field.set(obj, "JAVA");

            // Creates object of desired method by providing the
            // method name as argument to the
            // getDeclaredMethod()
            Method methodcall2 = class1.getDeclaredMethod("method1");

            // Invokes the method at runtime
            methodcall2.invoke(obj);

            // Creates object of the desired method by providing
            // the name of method as argument to the
            // getDeclaredMethod() method
            Method methodcall3 = class1.getDeclaredMethod("method3");

            // Allows the object to access the method
            // irrespective of the access specifier used with
            // the method
            methodcall3.setAccessible(true);

            // Invoking the method at runtime
            methodcall3.invoke(obj);

        } catch(Exception ex)
        {
            ex.printStackTrace();
        }


        logger.info("log exit:testReflectionMethod method");
    }
}
