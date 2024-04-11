package com.example.test.linkedlist.dao;
/* Node Class */
public class Node
{
    int data;
    public Node next;

    // Constructor to create a new node
    public Node(int d) {
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}