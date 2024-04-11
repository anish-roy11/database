package com.example.test.p29_javaLinkedList;

import java.util.LinkedList;

public class JavaLinkedList {

    LinkedList<Integer> integerLinkedList;
    LinkedList<String> stringLinkedList;

    JavaLinkedList(){
        integerLinkedList = new LinkedList<Integer>();
        stringLinkedList =  new LinkedList<String>();
    }

    public static void main(String args[])
    {
        JavaLinkedList javaLinkedList_obj1 = new JavaLinkedList();
        javaLinkedList_obj1.integerLinkedList.add(10);
        javaLinkedList_obj1.integerLinkedList.add(20);
        javaLinkedList_obj1.integerLinkedList.add(30);
        javaLinkedList_obj1.integerLinkedList.add(40);
        javaLinkedList_obj1.integerLinkedList.add(50);


        System.out.println("javaLinkedList_obj1 integerLinkedList size="+javaLinkedList_obj1.integerLinkedList.size());
        System.out.println("content of javaLinkedList_obj1 integerLinkedList:");
        for(int i=0; i < javaLinkedList_obj1.integerLinkedList.size(); i++ )
        {
            System.out.println("i="+i+":nodeData="+javaLinkedList_obj1.integerLinkedList.get(i));
        }



        javaLinkedList_obj1.stringLinkedList.add("n1");
        javaLinkedList_obj1.stringLinkedList.add("n2");
        javaLinkedList_obj1.stringLinkedList.add("n3");
        javaLinkedList_obj1.stringLinkedList.add("n4");
        javaLinkedList_obj1.stringLinkedList.add("n5");


        System.out.println("javaLinkedList_obj1 stringLinkedList size="+javaLinkedList_obj1.stringLinkedList.size());
        System.out.println("content of javaLinkedList_obj1 stringLinkedList:");
        for(int i=0; i < javaLinkedList_obj1.stringLinkedList.size(); i++ )
        {
            System.out.println("i="+i+":nodeData="+javaLinkedList_obj1.stringLinkedList.get(i));
        }

    }
}
