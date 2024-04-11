package com.example.test.p32_priorityQueue;



import java.util.PriorityQueue;

public class JavaPriorityQueue {

    public static void main(String[] args) {
        // Creating a priority queue of integers (natural order)
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue1.add(5);
        priorityQueue1.add(3);
        priorityQueue1.add(8);
        priorityQueue1.add(1);
        priorityQueue1.add(7);
        priorityQueue1.add(89);
        priorityQueue1.add(86);
        priorityQueue1.add(76);
        priorityQueue1.add(79);
        priorityQueue1.add(55);

        System.out.println("Priority Queue: " + priorityQueue1);

        // Removing elements from the priority queue
        int removedElement = priorityQueue1.poll();
        System.out.println("Removed element: " + removedElement);

        removedElement = priorityQueue1.poll();
        System.out.println("Removed element: " + removedElement);

        removedElement = priorityQueue1.poll();
        System.out.println("Removed element: " + removedElement);


        System.out.println("Priority Queue after removal: " + priorityQueue1);

        // Adding another element
        priorityQueue1.add(4);

        // Peeking at the front element without removing it
        int frontElement = priorityQueue1.peek();
        System.out.println("Front element (peek): " + frontElement);
        System.out.println("Priority Queue after peek: " + priorityQueue1);























        PriorityQueue<String> priorityQueueString1 = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueueString1.add("a");
        priorityQueueString1.add("b");
        priorityQueueString1.add("p");
        priorityQueueString1.add("A");
        priorityQueueString1.add("C");
        priorityQueueString1.add("M");
        priorityQueueString1.add("0");
        priorityQueueString1.add("1");
        priorityQueueString1.add("2");

        System.out.println("Priority Queue priorityQueueString1: " + priorityQueueString1);

        // Removing elements from the priority queue
        String removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);


        System.out.println("Priority Queue priorityQueueString1 after removal: " + priorityQueueString1);

        // Adding another element
        priorityQueueString1.add("t");

        // Peeking at the front element without removing it
        String frontStringElement = priorityQueueString1.peek();
        System.out.println("frontStringElement (peek): " + frontStringElement);
        System.out.println("Priority Queue priorityQueue1 after peek: " + priorityQueueString1);

        // Removing elements from the priority queue
        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        // Removing elements from the priority queue
        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        // Removing elements from the priority queue
        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        // Removing elements from the priority queue
        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        // Removing elements from the priority queue
        removedStringElement = priorityQueueString1.poll();
        System.out.println("removedStringElement: " + removedStringElement);

        System.out.println("Priority Queue priorityQueue1 after peek: " + priorityQueueString1);


    }

}



//output:
//Priority Queue: [1, 3, 8, 5, 7, 89, 86, 76, 79, 55]
//Removed element: 1
//Removed element: 3
//Removed element: 5
//Priority Queue after removal: [7, 55, 8, 76, 79, 89, 86]
//Front element (peek): 4
//Priority Queue after peek: [4, 7, 8, 55, 79, 89, 86, 76]
//Priority Queue priorityQueueString1: [0, 1, A, 2, a, p, M, b, C]
//removedStringElement: 0
//removedStringElement: 1
//removedStringElement: 2
//Priority Queue priorityQueueString1 after removal: [A, C, M, b, a, p]
//frontStringElement (peek): A
//Priority Queue priorityQueue1 after peek: [A, C, M, b, a, p, t]
//removedStringElement: A
//removedStringElement: C
//removedStringElement: M
//removedStringElement: a
//removedStringElement: b
//Priority Queue priorityQueue1 after peek: [p, t]
//
//Process finished with exit code 0