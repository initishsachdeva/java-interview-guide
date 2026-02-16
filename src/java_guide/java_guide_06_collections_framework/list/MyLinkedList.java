/**
 * LinkedList In Java Collections Framework
 * 
 * LinkedList:
 *       - Doubly-linked list implementation.
 *       - contains duplicate elements.
 *       - maintains insertion order.
 *       - Allows null elements.
 *       - Not synchronized.
 *       - dynamic in size. 
 *       - Fast insertions/removals at both ends (O(1)).
 *       - Slow random access (O(n)).
 *       - Can be used as a queue or deque.
 *       - Not thread-safe.
 *      - Common methods: add(), remove(), get(), set(), size(), contains(), indexOf().
 * Usage:
 *   - Use LinkedList for frequent insertions/removals.
 *  - Use as a Queue (FIFO) or Deque (double-ended queue).
 *  - Avoid LinkedList for frequent random access.
 * 
 * Working:
 *      - Each element (node) contains data and references to the next and previous nodes.
 *      - The first node is called the head, and the last node is called the tail.
 *      - Traversal requires following the links from one node to the next.
 *      - null <-10 -> 20 -> 30 -> null
 *       
 *

*/

package java_guide.java_guide_06_collections_framework.list;

import java.util.*;

public class MyLinkedList {

    public static void main(String[] args) {
        // Creating a LinkedList
        List<String> list = new LinkedList<String>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("Start");
        list.addLast("End");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + list);

        // Accessing elements
        String firstElement = list.getFirst();
        String lastElement = list.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);

        // Iterating through the LinkedList
        System.out.print("Iterating: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
