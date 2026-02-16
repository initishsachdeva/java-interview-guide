/**
 * LinkedHashSet In Java Collections Framework
 * 
 * LinkedHashSet:
 *       - Implements Set interface, backed by a hash table (HashMap) and a linked list.
 *       - Maintains insertion order.
 *       - Does not allow duplicate elements.
 *       - Allows one null element.
 *       - Not synchronized.
 *       - Dynamic in size.
 *       - Provides constant time performance for basic operations (add, remove, contains).
 *       - Slightly slower than HashSet due to maintaining order.
 *       - Common methods: add(), remove(), contains(), size(), isEmpty(), iterator().
 * Usage:
 *   - Use LinkedHashSet when insertion order matters.
 *   - Use for caching to maintain order of access.
 *   - Avoid if memory overhead is a concern.
 */

package java_guide.java_guide_06_collections_framework.Set;

import java.util.*;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("Apple");
        linkSet.add("Banana");
        linkSet.add("Orange");
        linkSet.add("");    
        linkSet.add("Apple"); // Duplicate, will not be added

        System.out.println("LinkedHashSet: " + linkSet);
        System.out.println("Size of LinkedHashSet: " + linkSet.size());

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        Iterator<String> iterator = linkSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());   
        }
        
        linkSet.remove("Banana");
        System.out.println("After removing Banana: " + linkSet);
    }
    
}
