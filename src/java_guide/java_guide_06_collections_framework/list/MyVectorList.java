/**
 * Vector In Java Collections Framework
 * 
 * Vector:
 *       - Similar to ArrayList but synchronized (thread-safe).
 *       - Legacy class, rarely used in new code.
 *       - Slower due to synchronization overhead.
 *       - Automatically resizes when capacity is exceeded.
 *       - maintains insertion order.
 *       - Contains duplicate elements.
 * Differences from ArrayList:
 *      - Synchronized (thread-safe) vs. not synchronized.
 *      - Slower performance due to synchronization overhead.
 *      - Dynamic in size.But with more overhead compared to ArrayList.When exceeding the capacity the vector doubles its size by default.
 *  Common methods: add(), remove(), get(), set(), size(), contains(), indexOf(). 
 */

package java_guide.java_guide_06_collections_framework.list;
import java.util.*;

public class MyVectorList {
    public static void main(String[] args) {
        // Creating a Vector
       Vector<String> vector = new Vector<String>();

        // Adding elements
        vector.add("A");
        vector.add("B");
        vector.add("C");

        // Displaying the Vector
        System.out.println("Vector: " + vector);

        // Accessing elements
        String firstElement = vector.get(0);
        String secondElement = vector.get(1);
        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + secondElement);

        // Removing an element
        vector.remove(1); // Removes element at index 1 ("B")
        System.out.println("After removing element at index 1: " + vector);
    }
    
}
