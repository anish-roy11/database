package com.example.test.p24_linkedlist.singleLinkedList;


import java.util.HashSet;
import java.util.logging.Logger;

public class LinkedListDemo {
	

    private static final Logger logger = Logger.getLogger(LinkedListDemo.class.getName());

    public void workWithLinkedList(){
        logger.info("log entry: workWithLinkedList method");
        LinkedList linkedlist1 = createLinkedList();

        logger.info("printing linked list after linked list creation");
        printLinkedList(linkedlist1);

        //add a new node at start of linked list
        int newData = 10;
        linkedlist1 = push(linkedlist1, newData);
        logger.info("printing linked list after adding a new node at start of linked list");
        printLinkedList(linkedlist1);

        //add a new node after a specified psition (after position 2) in linked list
        //Node one = linkedlist1.head.next;
        Node one = linkedlist1.head;
        Node two = one.next;
        insertAfter(two, 30);
        logger.info("printing linked list after inserting a node after the given prev_node of linkedlist");
        printLinkedList(linkedlist1);


        linkedlist1 = append(linkedlist1, 100);
        logger.info("printing linked list after appending a node at the end of linkedlist");
        printLinkedList(linkedlist1);


        LinkedList linkedListWithLoop1 = createLinkedListWithLoop();
        //logger.info("printing linked list with loop");
        //printLinkedList(linkedListWithLoop1);

        boolean isLoopFound=false;
        logger.info("detecting loop in a  linkedlist");
        isLoopFound = detectLoop(linkedlist1);
        logger.info("isLoopFound=" +isLoopFound);


        logger.info("detecting loop in a  linkedListWithLoop1");
        isLoopFound = detectLoop(linkedListWithLoop1);
        logger.info("isLoopFound=" +isLoopFound);





        logger.info("log exit: workWithLinkedList method");
    }





    public void printLinkedList(LinkedList linkedList)
    {
        logger.info("logEntry:printLinkedList  method");
        Node n = linkedList.head;
        while (n != null) {
            System.out.print(n.data + "   ");
            n = n.next;
        }
        logger.info("");
        logger.info("log exit:printLinkedList  method");
    }


    public LinkedList createLinkedList()
    {
        logger.info("log entry:createLinkedList  method");


        Node first  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        Node fourth = new Node(4);
        Node fifth  = new Node(5);

        LinkedList llist = new LinkedList();
        llist.head = first;

        /*
        Three nodes have been allocated dynamically.
          We have references to these three blocks as head,
          second and third

          llist.head        second              third              fourth                   fifth
             |                |                  |                    |                       |
             |                |                  |                    |                       |
         +----+------+     +----+------+     +----+------+        +----+------+            +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |        |  4 | null |            |  5 | null |
         +----+------+     +----+------+     +----+------+        +----+------+            +----+------+
         */

        //llist.head.next = second; // Link first node with the second node
        first.next = second;

        /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        second.next = third; // Link second node with the third node

        /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */

        third.next = fourth;
        fourth.next = fifth;

        fifth.next = null;

        logger.info("log exit:createLinkedList  method");
        return llist;
    }





    //method to insert a node at start of linkedlist
    public LinkedList push(LinkedList llist, int new_data)
    {
        logger.info("log Entry:push  method");
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = llist.head;
        //this will make new_node point to where head is pointing

        /* 4. Move the head to point to new Node */
        llist.head = new_node;
        logger.info("log exit:push  method");
        return llist;
    }





    //method to insert a node after the given prev_node of linkedlist

    public void insertAfter(Node prev_node, int new_data)
    {
        logger.info("log entry:insertAfter  method");
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
    3. Put in the data*/
        Node new_node = new  Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
    //this will make new_node.next point to where prev_node.next is ponting

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;

        logger.info("log exit:insertAfter  method");
    }


    /* Appends a new node at the end.  This method is
   defined inside LinkedList class shown above */
    public LinkedList append(LinkedList llist, int new_data)
    {
        logger.info("log entry:append  method");
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (llist.head == null)
        {
            //llist.head = new Node(new_data);
            llist.head = new_node;
            logger.info("log exit:append  method");
            return llist;
        }

    /* 4. This new node is going to be the last node, so make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = llist.head;
        while (last.next != null) {
            last = last.next;
        }

        /* 6. Change the next of last node */
        last.next = new_node;
        logger.info("log exit:append  method");
        return llist;
    }



    // Returns true if there is a loop in linked
    // list else returns false.
    public boolean detectLoop(LinkedList llist)
    {
        logger.info("log entry:detectLoop  method");

        HashSet<Node> hashSet = new HashSet<Node>();
        Node tempNode = llist.head;
        while (tempNode != null)
        {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (hashSet.contains(tempNode)) {
                logger.info("log exit:detectLoop  method");
                return true;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            hashSet.add(tempNode);

            tempNode = tempNode.next;
        }
        logger.info("log exit:detectLoop  method");

        return false;
    }





    public LinkedList createLinkedListWithLoop()
    {
        logger.info("log entry:createLinkedListWithLoop  method");


        Node node_1 = new Node(1);
        Node node_2 = new Node(2);
        Node node_3 = new Node(3);
        Node node_4 = new Node(4);
        Node node_5 = new Node(5);
        Node node_6 = new Node(6);
        Node node_7 = new Node(7);
        Node node_8 = new Node(8);


        LinkedList llist = new LinkedList();
        llist.head = node_1;


        //llist.head.next = _2;
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;
        node_6.next = node_7;
        node_7.next = node_8;
        node_8.next = node_3;
        logger.info("log exit:createLinkedListWithLoop  method");
        return llist;
    }
    
    
   
    
}
