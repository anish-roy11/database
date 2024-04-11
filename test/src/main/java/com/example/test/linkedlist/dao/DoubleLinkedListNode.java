package com.example.test.linkedlist.dao;

public class DoubleLinkedListNode {

    public int data;
    public DoubleLinkedListNode prev;
    public DoubleLinkedListNode next;

    public DoubleLinkedListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public DoubleLinkedListNode(int data, DoubleLinkedListNode prev, DoubleLinkedListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DoubleLinkedListNode() {
    }



    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListNode prev) {
        this.prev = prev;
    }

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }
}
