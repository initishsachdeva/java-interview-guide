/**
 * HashMap in Java Collections Framework
 *
 * HashMap:
 *       - Implements Map interface.
 *       - Stores key-value pairs.
 *       - Does not maintain any order of elements.
 *       - Allows one null key and multiple null values.
 *       - Not synchronized.
 *       - Dynamic in size.
 *       - Provides constant time performance for basic operations (get, put).
 *       - Common methods: put(), get(), remove(), containsKey(), containsValue(), size(), isEmpty().
 *
 * Usage:
 *   - Use HashMap when you need to store key-value pairs and don't care about the order.
 *   - Use for fast lookups and insertions of key-value pairs.
 * 
 * 
In Java, HashMap is a part of Java’s collection since Java 1.2. This class is found in java.util package. It provides the
 basic implementation of the Map
interface of Java. HashMap in Java stores the data in (Key, Value) pairs, and you can access them by an index of another 
type (e.g. an Integer). 
One object is used as a key (index) to another object (value). If you try to insert the duplicate key in HashMap, 
it will replace the element of the corresponding key.


What is HashMap?

Java HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should
be only one null key object and there
can be any number of null values. This class makes no guarantees as to the order of the map. To use this class and its 
methods, you need to import java.util.HashMap
package or its superclass.


Characteristics of HashMap:

A HashMap is a data structure that is used to store and retrieve values based on keys. Some of the key characteristics of a
 hashmap include:

Fast access time: HashMaps provide constant time access to elements, which means that retrieval and insertion of elements 
are very fast, usually O(1) time complexity.

Uses hashing function: HashMaps uses a hash function to map keys to indices in an java_guide.java_guide_05_array. This 
allows for a quick lookup of values based on keys.

Stores key-value pairs: Each element in a HashMap consists of a key-value pair. The key is used to look up the associated 
value.

Supports null keys and values: HashMaps allow for null values and keys. This means that a null key can be used to store a
 value, and a null value can be associated with a key.

Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.
 However, LinkedHashMap is a variation of HashMap that preserves the insertion order.

Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys. If a duplicate key is added, the previous 
value associated with the key is overwritten.

Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously,
 it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.

Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, 
which is the measure of how full the hashmap can be before it is resized.




What happen when hashmap is  created

When you create an object of hashmap, it is initialized with default initial capacity of 16 and default load factor of 
0.75f.
The load factor is a measure of how full the hashmap is allowed to get before its capacity is automatically increased.
 When the number of entries in the
hashmap exceeds the product of the load factor and the current capacity, the hashmap is rehashed (internal data structures
 are rebuilt),
so that the hashmap has approximately twice the number of buckets.


for eg:
HashMap<String, Integer> map = new HashMap<String, Integer>();
map.put("a", 1);

While debugging ,in variables pane you will able to see a hashmap is created with name map and with the following details

entrySet    entrySet is a set of key-value pairs in hashmap
keySet      keySet is a set of keys in hashmap
loadFactor  loadFactor is the measure of how full the hashmap is allowed to get before its capacity is automatically increased.By default it is 0.75f
modCount    modCount depicts how many times hashmap is modified
size        size depicts how many entries are there in hashmap
table       table is an java_guide.java_guide_05_array of Entry class. By default it is of size 16
threshold   threshold is the capacity of hashmap. By default it is 12
values      values is a collection of values in hashmap


Here, the initial capacity of the hashmap is 16 and the load factor is 0.75f. When hashmap reaches it's size to 12, it will be rehashed and the capacity will be
doubled.Such that the new table size will be 32 and the threshold will be 24.

 */

package java_guide.java_guide_06_collections_framework.Map;

import java.util.*;   

public class MyHasMap {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put(null, 0); // Adding a null key
        map.put("Four", null); // Adding a null value

        // Displaying the HashMap
        System.out.println("HashMap: " + map);

        //Traversing the HashMap
        System.out.println("Traversing the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }   

        //Traversing Map using Set  
        System.out.println("Traversing the HashMap using Set:"); 
        Set set=map.entrySet();//Converting to Set so that we can traverse  
        Iterator itr=set.iterator();  
        while(itr.hasNext()){  
            //Converting to Map.Entry so that we can get key and value separately  
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey()+" "+entry.getValue());  
        }  

        // Accessing values by keys
        int value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Checking for a key
        boolean hasKey = map.containsKey("Three");
        System.out.println("Contains key 'Three': " + hasKey);

        // Checking for a value
        boolean hasValue = map.containsValue(4);
        System.out.println("Contains value 4: " + hasValue);

        // Removing a key-value pair
        map.remove("One");
        System.out.println("After removing key 'One': " + map);

        // Size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        }
    }