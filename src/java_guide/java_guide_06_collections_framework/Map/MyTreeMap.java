/**
 * TreeMap implementation example.
 *      - Implements the SortedMap interface.
 *      - Maintain data in a sorted order based on the keys.
 *      - Stores key-value pairs in a sorted order based on the natural ordering of keys or a specified comparator.  
 *      - Does not allow null keys (throws NullPointerException) but allows null values.
 *      - Not synchronized (not thread-safe).
 *      - Dynamic in size.
 *      - Provides log(n) time complexity for basic operations (get, put, remove).
 *      - Common methods: put(), get(), remove(), containsKey(), containsValue(), size(), keySet(), values().
 * Usage:
 *      - Use TreeMap when you need sorted key-value pairs.
 *      - Suitable for applications requiring range views or ordered traversal of keys.
 *      - Avoid TreeMap when insertion order is important (use LinkedHashMap instead).
 * Working:
 *      - Internally uses a Red-Black tree structure to maintain order.
 *      - When a new key-value pair is added, it is placed in the correct position to maintain sorted order.
 *      - Traversal of the map is done in sorted order of keys.
 *      - Example:
 *          Key-Value Pairs:
 *             10 -> "Ten"
 *             20 -> "Twenty"
 *             15 -> "Fifteen"
 * Sorted Order:
 *       10 -> "Ten" 
 *       15 -> "Fifteen"
 *       20 -> "Twenty"
 * 
 */
package java_guide.java_guide_06_collections_framework.Map;

import java.util.*;

public class MyTreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(15, "Fifteen");

        // Displaying the TreeMap (sorted order)
        System.out.println("TreeMap: " + treeMap);

        // Accessing values
        String value = treeMap.get(15);
        System.out.println("Value for key 15: " + value);

        // Removing a key-value pair
        treeMap.remove(10);
        System.out.println("After removing key 10: " + treeMap);

        // Iterating through the TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
