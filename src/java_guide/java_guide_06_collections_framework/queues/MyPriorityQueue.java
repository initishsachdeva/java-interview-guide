/**
 * 
 The Java Queue interface belongs to java.util package. It is a fundamental part of the Java Collections Framework designed to handle elements in a specific sequence, typically in a First-In-First-Out (FIFO) manner. As an ordered list of objects, a Queue ensures that elements are inserted at the end and removed from the beginning, making it an ideal data structure for scenarios such as task scheduling, order processing, and managing print jobs.

Being an interface, Queue cannot be instantiated directly. Instead, it requires a concrete implementation. The most common classes that implement the Queue interface in Java are LinkedList and PriorityQueue. The LinkedList class provides a doubly-linked list implementation, while the PriorityQueue class is based on a priority heap, ordering its elements according to their natural ordering or a specified comparator.

However, these standard implementations are not thread-safe, making them unsuitable for concurrent applications where multiple threads may access and modify the queue simultaneously. For such use cases, Java provides the PriorityBlockingQueue class in the java.util.concurrent package, which offers a thread-safe priority queue implementation.

The Queue interface itself extends the Collection interface, inheriting all its methods and adding several specific ones for insertion, removal, and inspection of elements. Key methods include add and offer for insertion, remove and poll for removal, and element and peek for inspection. These methods are designed to handle the unique needs of a queue, such as returning special values or throwing exceptions when operations fail due to capacity restrictions or an empty queue.

* Queue example using PriorityQueue in Java.
 * * PriorityQueue:
 *          - Implements a priority queue data structure.
 *          - Elements are ordered based on their natural ordering or by a Comparator provided at queue construction time.
 *          - Does not allow null elements.
 *          - Not synchronized.
 *          - Dynamic in size.
 *          - Offers O(log n) time for enqueuing and dequeuing operations.
 *          - Not thread-safe.
 *          - Common methods: add(), offer(), poll(), peek(), size(), contains().
 * Usage:
 *          - Use PriorityQueue when elements need to be processed based on priority rather than insertion order.
 *          - Suitable for scheduling tasks, managing resources, etc.       
 * Working:
 *          - Internally uses a binary heap data structure.
 *          - The head of the queue is the least element with respect to the specified ordering.
 *          - When elements are added, they are placed in the appropriate position to maintain the heap invariant.
 *          - Example: For a min-heap, the smallest element is always at the head.
 *          - Example: For a max-heap, the largest element is always at the head.
 * 
 */

package java_guide.java_guide_06_collections_framework.queues;

import java.util.*;

public class MyPriorityQueue {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Accessing the head element
        Integer head = pq.peek();
        System.out.println("Head Element: " + head);

        // traversing elements
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

         // Removing elements
        while (!pq.isEmpty()) {
            System.out.println("Removed Element: " + pq.poll());
        }

    }
    
}
