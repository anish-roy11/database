package com.example.test.p30_javaQueue;


import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");

        System.out.println("Queue: " + queue);

        // Removing and processing elements from the queue
        String front = queue.poll(); // Retrieves and removes the head of the queue
        System.out.println("Removed from the front: " + front);
        System.out.println("Queue after removal: " + queue);

        // Adding another element to the queue
        queue.add("Eva");

        // Peeking at the front of the queue without removing it
        String peekedElement = queue.peek();
        System.out.println("Front of the queue (peek): " + peekedElement);
        System.out.println("Queue after peek: " + queue);
    }
}


//output:Queue: [Alice, Bob, Charlie, David]
//Removed from the front: Alice
//Queue after removal: [Bob, Charlie, David]
//Front of the queue (peek): Bob
//Queue after peek: [Bob, Charlie, David, Eva]