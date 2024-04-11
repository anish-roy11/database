package com.example.test.p31_javaDequeue;



import java.util.Deque;
import java.util.LinkedList;

public class JavaDeque {

    public static void main(String[] args) {
        // Creating a Deque using LinkedList
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the front of the deque
        deque.addFirst("Alice");
        deque.addFirst("Bob");
        deque.addFirst("Charlie");

        // Adding elements to the end of the deque
        deque.addLast("David");
        deque.addLast("Eva");

        System.out.println("Deque: " + deque);

        // Removing elements from the front and end of the deque
        String removedFromFront = deque.removeFirst();
        String removedFromEnd = deque.removeLast();

        System.out.println("Removed from the front: " + removedFromFront);
        System.out.println("Removed from the end: " + removedFromEnd);
        System.out.println("Deque after removals: " + deque);

        // Peeking at the front and end of the deque without removing elements
        String frontPeek = deque.peekFirst();
        String endPeek = deque.peekLast();

        System.out.println("Front of the deque (peek): " + frontPeek);
        System.out.println("End of the deque (peek): " + endPeek);
        System.out.println("Deque after peeks: " + deque);
    }
}


//output:Deque: [Charlie, Bob, Alice, David, Eva]
//Removed from the front: Charlie
//Removed from the end: Eva
//Deque after removals: [Bob, Alice, David]
//Front of the deque (peek): Bob
//End of the deque (peek): David
//Deque after peeks: [Bob, Alice, David]