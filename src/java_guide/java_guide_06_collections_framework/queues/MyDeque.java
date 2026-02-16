/**
 * Deque (Double-Ended Queue) implementation example.
 * Deque:
 *       - Allows insertion and removal of elements from both ends.
 *       - Can function as both a stack (LIFO) and a queue (FIFO).
 *       - Can contain duplicate elements.
 *       - Maintains insertion order.
 *       - Allows null elements.
 *       - Not synchronized.
 *       - Dynamic in size.
 *       - Fast insertions/removals at both ends (O(1)).
 *       - Slow random access (O(n)).
 *       - Not thread-safe.
 *      - Common methods: addFirst(), addLast(), removeFirst(), removeLast(), peekFirst(), peekLast(), size(), contains().
 * Usage:
 *      - Use Deque when you need to add/remove elements from both ends.
 *      - Use as a stack (LIFO) or queue (FIFO).   
 * Working:
 *      - Each element (node) contains data and references to the next and previous nodes.
 *      - The first node is called the head, and the last node is called the tail.
 *      - Traversal requires following the links from one node to the next.
 *      - null <-10 -> 20 -> 30 -> null
 */
package java_guide.java_guide_06_collections_framework.queues;

import java.util.*;

public class MyDeque {
    public static void main(String[] args) {
        // Creating a Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front and back
        deque.add(30);
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(70);
        

        // Displaying the Deque
        System.out.println("Deque: " + deque);

        // Iterating through the Deque
        System.out.println("Elements in Deque: ");
        for (int element : deque) {
            System.out.print(element + " ");
        }

        // Accessing elements from both ends
        int firstElement = deque.peekFirst();
        int lastElement = deque.peekLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing elements from both ends
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing first and last: " + deque);
    }
    
}
