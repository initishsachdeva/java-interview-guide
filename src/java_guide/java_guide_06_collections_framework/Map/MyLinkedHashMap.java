/**
 * LinkedHashMap implementation example.
 *      - Maintains insertion order or access order.
 *      - Allows null keys and values.
 *      - Not synchronized.
 *      - Combines hash table and linked list.
 *      - Fast access, insertion, and deletion (O(1)).
 *      - Common methods: put(), get(), remove(), containsKey(), containsValue(), size(), keySet(), values().
 * Usage:   
 *      - Use LinkedHashMap when order of elements matters.
 *      - Use for caching mechanisms (access order).
 *      - Avoid LinkedHashMap when memory overhead is a concern.
 * Working:
 *      - Internally uses a hash table for storage and a doubly-linked list to maintain
 *      insertion/access order.
 *      - Each entry contains a key, value, hash code, and pointers to the next and previous entries.
 *      - On insertion, the entry is added to the hash table and linked list.
 *      - On access (if access order is enabled), the entry is moved to the end of the linked list.
 *      - null <- K1 -> K2 -> K3 -> null
 * 
 * 
 */
package java_guide.java_guide_06_collections_framework.Map;

import java.util.*;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding elements
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing elements
        String value = linkedHashMap.get(2);
        System.out.println("Value for key 2: " + value);

        // Removing an element
        linkedHashMap.remove(1);
        System.out.println("After removing key 1: " + linkedHashMap);

        // Iterating through the LinkedHashMap
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
