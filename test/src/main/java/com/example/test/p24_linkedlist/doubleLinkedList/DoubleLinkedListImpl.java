package com.example.test.p24_linkedlist.doubleLinkedList;


//import java.util.HashSet;

import java.util.logging.Logger;

public class DoubleLinkedListImpl {

    private static final Logger logger = Logger.getLogger(DoubleLinkedListImpl.class.getName());

    public void workWithDoubleLinkedList() {
        logger.info("log entry: workWithDoubleLinkedList method");

        DoubleLinkedList doubleLinkedList = createDoubleLinkedList();

        logger.info("printing double linked list after linked list creation");
        printDoubleLinkedList(doubleLinkedList);

        doubleLinkedList=pushIntoDoubleLinkedList(doubleLinkedList, 30);
        doubleLinkedList=pushIntoDoubleLinkedList(doubleLinkedList, 40);
        logger.info("printing double linked list after pushIntoDoubleLinkedList");
        printDoubleLinkedList(doubleLinkedList);


        DoubleLinkedListNode dllnode1 = doubleLinkedList.head;
        DoubleLinkedListNode dllnode2 = dllnode1.next;
        DoubleLinkedListNode dllnode3 = dllnode2.next;



        insertBefore(doubleLinkedList, dllnode2, 80);
        logger.info("printing double linked list after insertBefore method");
        printDoubleLinkedList(doubleLinkedList);



        insertAfter(doubleLinkedList, dllnode3, 100);
        logger.info("printing double linked list after insertAfter method");
        printDoubleLinkedList(doubleLinkedList);


        append(doubleLinkedList,1000);
        logger.info("printing double linked list after append method");
        printDoubleLinkedList(doubleLinkedList);
    }

    public DoubleLinkedList createDoubleLinkedList()
    {
        logger.info("log entry:createDoubleLinkedList  method");


        //doubleLinkedList.head = new DoubleLinkedListNode(1);

        DoubleLinkedListNode dllNode1 = new DoubleLinkedListNode(1);
        DoubleLinkedListNode dllNode2 = new DoubleLinkedListNode(2);
        DoubleLinkedListNode dllNode3 = new DoubleLinkedListNode(3);
        DoubleLinkedListNode dllNode4 = new DoubleLinkedListNode(4);
        DoubleLinkedListNode dllNode5 = new DoubleLinkedListNode(5);



        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.head = dllNode1;

        dllNode1.next = dllNode2;
        dllNode1.prev = null;

        dllNode2.next = dllNode3;
        dllNode2.prev = dllNode1;

        dllNode3.next = dllNode4;
        dllNode3.prev = dllNode2;

        dllNode4.next = dllNode5;
        dllNode4.prev = dllNode3;

        dllNode5.next = null;
        dllNode5.prev = dllNode4;



        logger.info("log exit:createDoubleLinkedList  method");

        return doubleLinkedList;
    }



















    public void printDoubleLinkedList(DoubleLinkedList doubleLinkedList)
    {
        logger.info("logEntry:printDoubleLinkedList  method");
        DoubleLinkedListNode dllNode = doubleLinkedList.head;
        DoubleLinkedListNode last = null;

        logger.info("Traversal in forward Direction:");
        while (dllNode != null) {
            System.out.print(dllNode.data + "   ");
            last = dllNode;
            dllNode = dllNode.next;
        }
        logger.info("\n");

        logger.info("\n");
        logger.info("Traversal in reverse direction:");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        logger.info("\n");
        logger.info("log exit:printDoubleLinkedList  method");

    }





















    // Adding a node at the front of the list
    public DoubleLinkedList pushIntoDoubleLinkedList(DoubleLinkedList doubleLinkedList, int new_data)
    {
        logger.info("log entry:pushIntoDoubleLinkedList  method");
        /* 1. allocate node
         * 2. put in the data */
        DoubleLinkedListNode new_Node = new DoubleLinkedListNode(new_data);

        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = doubleLinkedList.head; //after this, new_Node.next will point to the same node which doubleLinkedList.head points to currently
        new_Node.prev = null;

        /* 4. change prev of head node to new node */
        if (doubleLinkedList.head != null) {
            doubleLinkedList.head.prev = new_Node;
        }

        /* 5. move the head to point to the new node */
        doubleLinkedList.head = new_Node;
        logger.info("log exit:pushIntoDoubleLinkedList  method");
        return doubleLinkedList;
    }














    // Add a node before the given node
    public void insertBefore(DoubleLinkedList dllList, DoubleLinkedListNode next_node, int new_data)
    {
        logger.info("log entry:insertBefore");
        /*Check if the given nx_node is NULL*/
        if(next_node == null)
        {
            logger.info("The given next node can not be NULL");

            return;
        }

        //Allocate node, put in the data
        DoubleLinkedListNode new_node = new DoubleLinkedListNode(new_data);

        //Making prev of new node as prev of next node
        new_node.prev = next_node.prev;

        //Making prev of next node as new node
        next_node.prev = new_node;

        //Making next of new node as next node
        new_node.next = next_node;

        //Check if new node is added as head
        if(new_node.prev != null) {
            new_node.prev.next = new_node;
        }
        else {
            dllList.head = new_node;
        }

        logger.info("log exit:insertBefore");
    }






















    /* Given a node as prev_node, insert
    a new node after the given node */
    public void insertAfter(DoubleLinkedList dllList, DoubleLinkedListNode prev_Node, int new_data)
    {

        logger.info("log entry:insertAfter");
        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {

            logger.info("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        DoubleLinkedListNode new_node = new DoubleLinkedListNode(new_data);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node;

        /* 7. Change previous of new_node's next node */
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }

        /*8. Maintaining tail node if we are inserting after the second last node */
        //if (new_node.next==null){
        //dllList.tail = new_node;
        //}

        logger.info("log exit:insertAfter");
    }


















    // Add a node at the end of the list
    void append(DoubleLinkedList dllList, int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        DoubleLinkedListNode new_node = new DoubleLinkedListNode(new_data);

        DoubleLinkedListNode last = dllList.head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (dllList.head == null) {
            new_node.prev = null;
            dllList.head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null) {
            last = last.next;
        }
        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }


    public static void main(String[] args)
    {
        DoubleLinkedListImpl doubleLinkedListImpl_Obj1 = new DoubleLinkedListImpl();
        doubleLinkedListImpl_Obj1.workWithDoubleLinkedList();
    }


}
