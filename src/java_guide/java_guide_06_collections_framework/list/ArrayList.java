/*
 * ===========================
 * Java Collections Framework: List
 * ===========================
 * 
 * 1. List Interface:
 *    - Part of java.util package.
 *    - Ordered collection (sequence) of elements.
 *    - Allows duplicate elements.
 *    - Elements can be accessed by their integer index (position in the list).
 *    - Common methods: add(), remove(), get(), set(), size(), contains(), indexOf().
 * 
 * 2. Implementations of List:
 *    a) ArrayList:
 *       - Backed by a dynamic array.
 *       - Fast random access (O(1) for get/set).
 *       - Slow insertions/removals in the middle (O(n)).
 *       - Not thread-safe.
 *       - Preferred for frequent access and iteration.
 *       - Automatically resizes when capacity is exceeded.
 *       - maintains insertion order. 
 * 
 *    b) LinkedList:
 *       - Doubly-linked list implementation.
 *       - Fast insertions/removals at both ends (O(1)).
 *       - Slow random access (O(n)).
 *       - Can be used as a queue or deque.
 *       - Not thread-safe.
 *       - maintains insertion order.
 * 
 *    c) Vector:
 *       - Similar to ArrayList but synchronized (thread-safe).
 *       - Legacy class, rarely used in new code.
 *       - Slower due to synchronization overhead.
 *      -  Automatically resizes when capacity is exceeded.But with more overhead compared to ArrayList.
 * 
 *    d) Stack (extends Vector):
 *       - Legacy class for LIFO stack operations.
 *       - Use Deque (ArrayDeque/LinkedList) for stack/queue implementations in modern code.
 * 
 * 3. Usage:
 *    - Use ArrayList for fast access and iteration.
 *    - Use LinkedList for frequent insertions/removals.
 *    - Avoid Vector unless thread-safety is required and legacy code is involved.
 * 
 * 4. Interview Tips:
 *    - Know time complexities: ArrayList (get/set O(1), add/remove O(n)), LinkedList (get/set O(n), add/remove O(1) at ends).
 *    - Understand differences between ArrayList and LinkedList.
 *    - Be aware of thread-safety issues.
 *    - Prefer List interface for variable declarations: List<String> list = new ArrayList<>();
 *    - Know how to iterate: for-each loop, iterator, ListIterator.
 *    - Understand fail-fast behavior (ConcurrentModificationException).
 * 
 * 5. Example:
 *    List<Integer> list = new ArrayList<>();
 *    list.add(10);
 *    list.add(20);
 *    int value = list.get(0); // 10
 * 
 * ===========================
 */

package java_guide.java_guide_06_collections_framework.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);

        // accessing elements
        int value = list.get(0); // 10
        System.out.println("First element: " + value);

        // checking size
        System.out.println("Size of the list: " + list.size());

        // traversing the list
        System.out.println("List elements:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // traversing using iterator
        System.out.println("Traversing using iterator:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // sort the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // remove the element at index 2
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);
    }

}
