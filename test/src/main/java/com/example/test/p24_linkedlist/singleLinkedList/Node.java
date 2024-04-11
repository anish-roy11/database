package com.example.test.p24_linkedlist.singleLinkedList;

/* Node Class */
public class Node
{
    int data;
    public Node next;

 // Constructor to create a new node
    public Node() {    
    	
    }
    
    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        next = null;
    }
    
 // Constructor to create a new node
    public Node(int value, Node nextNode) {
        data = value;
        next = nextNode;
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