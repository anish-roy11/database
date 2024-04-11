package com.example.test.linkedlist.dao;

public class LinkedList {

    public Node head;  // head of list



    public LinkedList()
    {

    }

    public LinkedList(Node head) {
        this.head = head;
    }



    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

/*
    public void push(int new_data)
    {
     //1 & 2: Allocate the Node &  Put in the data
        Node new_node = new Node(new_data);

        // 3. Make next of new Node as head
        new_node.next = head;

        // 4. Move the head to point to new Node //
        head = new_node;
    }
    */

}
