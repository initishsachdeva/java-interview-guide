/**
 * TreeSet In Java Collections Framework
 * 
 * TreeSet:
 *       - Implements SortedSet interface, backed by a Red-Black tree.
 *       - Maintains elements in sorted order (natural ordering or custom comparator).
 *       - Does not allow duplicate elements.
 *       - Does not allow null elements (throws NullPointerException).
 *       - Not synchronized.
 *       - Dynamic in size.
 *       - Provides logarithmic time performance for basic operations (add, remove, contains).
 *       - Common methods: add(), remove(), contains(), size(), isEmpty(), iterator(), first(), last().
 * Usage:
 *   - Use TreeSet when you need elements in sorted order.
 *   - Use for maintaining a sorted collection of unique elements.
 */

package java_guide.java_guide_06_collections_framework.Set;

import java.util.*;

public class MyTreeSet {

    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        // Displaying the TreeSet (will be in sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Accessing first and last elements
        Integer firstElement = treeSet.first();
        Integer lastElement = treeSet.last();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing an element
        treeSet.remove(20);
        System.out.println("After removing 20: " + treeSet);

        // Checking if an element exists
        boolean contains30 = treeSet.contains(30);
        System.out.println("Contains 30: " + contains30);

        //Iterating through the TreeSet
        System.out.print("Elements in TreeSet: ");
        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }

        // Iterator example
        System.out.print("\nIterating using Iterator: ");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");   
        } 
    }
}
