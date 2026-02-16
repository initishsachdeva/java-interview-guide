/**
 * HashSet In Java Collections Framework
 * 
 * HashSet:
    *       - Implements the Set interface.
    *       - stores elements in a hash table by using mechanism called hashing. 
    *       - Does not allow duplicate elements.As it contains only unique elements.
    *       - Does not maintain insertion order.
    *       - Allows null elements.
    *       - Not synchronized.
    *       - Dynamic in size.
    *       - The initial default capacity of HashSet is 16, and the load factor is 0.75.
    *       - Fast access (O(1) average time complexity).
    *       - Common methods: add(), remove(), contains(), size(), isEmpty().
    * Usage:
    *   - Use HashSet when you need a collection of unique elements.
    *   - Use for fast lookups and deletions.
    *   - Avoid when order matters.
 
 */


package java_guide.java_guide_06_collections_framework.Set;

import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<String>();

        // Adding elements
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // Duplicate element

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking for an element
        boolean containsB = set.contains("B");
        System.out.println("Contains B: " + containsB);

        // Removing an element
        set.remove("B");
        System.out.println("After removing B: " + set);

        // Size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Iterating through the HashSet
        System.out.print("Elements in HashSet: ");
         Iterator<String> i=set.iterator();    
           while(i.hasNext())    
           {    
           System.out.println(i.next());    
           }    
    }
    
}
