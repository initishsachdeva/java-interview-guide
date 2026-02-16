/*
Using HashMap you can easily run following operations on String:
1. Find unique characters in a string
2. Find duplicate characters in a string
3. Count the occurrence of each character in a string
4. Count the occurrence of a specific character in a string
5. Remove duplicate characters from a string
6. Sort characters in a string using TreeMap


*/

package java_guide.java_guide_04_strings;

import java.util.*;
import java.util.Map;

public class Program015_StringWithHashmap {

    private static void findUniqueCharacters(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new LinkedHashMap<>();
        // HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }

        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() <= 1 && entry.getKey() != ' ') {
                System.out.println("Unique character: " + entry.getKey() + " : " + entry.getValue());
            }
        }
    }


    private static void countDuplicateCharacters(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new LinkedHashMap<>();
        // HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }

        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1 && entry.getKey() != ' ') {
                System.out.println("Duplicate character: " + entry.getKey() + " : " + entry.getValue());
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() <= 1) {
                System.out.println("Unique character: " + entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private static void countOccurrenceOfEachCharacter(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new LinkedHashMap<>();
        // HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character count : " + entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void countOccurrenceOfSpecificCharacter(String str, char c) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new LinkedHashMap<>();
        // HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char ch : charArray) {

            if (map.containsKey(ch)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(ch, map.get(ch) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == c) {
                System.out.println("Character count : " + entry.getKey() + " : " + entry.getValue());
            }
        }
    }
   
    private static void removeDuplicateCharacters(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new LinkedHashMap<>();
        // HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
        }
        System.out.println("String after removing duplicate characters: " + sb.toString());
    }
    
    private static void sortCharactersInString(String str) {

        // Creating a TreeMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new TreeMap<>();
        // TreeMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
        }
        System.out.println("String after sorting characters: " + sb.toString());
    }
   
    public static void main(String[] args) {
        //using string literals to find unique characters in a string
        String s1 = "cro_co##dile";
        findUniqueCharacters(s1);
        System.out.println("-----------------------------");
        
        // Given String str to find duplicate characters in a string
        String str = "geeks for geeks";
        countDuplicateCharacters(str);
        
        // Given String str to count the occurrence of each character in a string
        System.out.println("-----------------------------");
        countOccurrenceOfEachCharacter(str);
        
        // Given String str and char c to count the occurrence of a specific character in a string
        System.out.println("-----------------------------");
        char c = 'e';
        countOccurrenceOfSpecificCharacter(str, c);

        // Given String str to remove duplicate characters from a string
        System.out.println("-----------------------------");
        String str2 = "geeks for geeks";
        removeDuplicateCharacters(str2);

        // Given String str to sort characters in a string using TreeMap
        System.out.println("-----------------------------");
        String str3 = "geeksforgeeksdevs";
        sortCharactersInString(str3);
   }
}
