/*
Using HashMap you can easily run following operations on String:
1. Find unique characters in a string
2. Find duplicate characters in a string
3. Count the occurrence of each character in a string
4. Count the occurrence of a specific character in a string
5. Remove duplicate characters from a string
6. Sort characters in a string using TreeMap
7. Find the first non-repeating character in a string
8. Find the first repeating character in a string
9. Find the most frequent character in a string
10. Find the least frequent character in a string
11. Find the second most frequent character in a string
12. Find the second least frequent character in a string
13. Find if the given string is an anagram of another string
14. Find the longest substring without repeating characters in a string



*/

package java_guide.java_guide_04_strings;

import java.util.*;

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
            map.put(c, map.getOrDefault(c, 0) + 1);
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

            if (entry.getValue() == 1) {
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

              map.put(c, map.getOrDefault(c, 0) + 1);
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

            map.put(ch, map.getOrDefault(ch, 0) + 1);
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
          map.put(c, map.getOrDefault(c, 0) + 1);
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
          map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
        }
        System.out.println("String after sorting characters: " + sb.toString());
    }
   
     private static void findFirstNonRepeatingChar(String str) {

        // Creating a TreeMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: charArray) {
            if(map.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                break;
            }
        }
    }
   
    private static void findFirstRepeatingChar(String str) {

        Set<Character> set = new HashSet<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (set.contains(c)) {
                System.out.println("First repeating character: " + c);
                break;
            } else {
                set.add(c);
            }
        }
    }

    private static void findMostFrequentCharacter(String str) {
        // Implementation to find the most frequent character in a string
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();   
            }
        }
        System.out.println("Most frequent character: " + maxChar + ", Count: " + maxCount);

        //find second most frequent character
        char secondMaxChar = ' ';
        int secondMaxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > secondMaxCount && entry.getValue() < maxCount) {
                secondMaxCount = entry.getValue();
                secondMaxChar = entry.getKey();
            }
        }
        System.out.println("Second most frequent character: " + secondMaxChar + ", Count: " + secondMaxCount);
    }

    private static void findLeastFrequentCharacter(String str) {
        // Implementation to find the most frequent character in a string
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }
        char leastChar = ' ';
        int leastCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < leastCount) {
                leastCount = entry.getValue();
                leastChar = entry.getKey();   
            }
        }
        System.out.println("Least frequent character: " + leastChar + ", Count: " + leastCount);
        //find second least frequent character
        char secondLeastChar = ' ';
        int secondLeastCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < secondLeastCount && entry.getValue() > leastCount) {
                secondLeastCount = entry.getValue();
                secondLeastChar = entry.getKey();
            }
        }
        System.out.println("Second least frequent character: " + secondLeastChar + ", Count: " + secondLeastCount);
    }

    private static void anagramCheck(String str1, String str2) {
        // Implementation to check if two strings are anagrams
        if (str1.length()!=str2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        for (char c : charArray1) {
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }
        for (char c : charArray2) {
            if (!map.containsKey(c)) {
                System.out.println("Strings are not anagrams");
                return;
            }
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
    }
    
    private static void findLongestSubstringWithoutRepeatingCharacters(String str) {
        // Implementation to find the longest substring without repeating characters
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        String longestSubstring = "";
        char[] charArray = str.toCharArray();

        for (int right = 0; right < charArray.length; right++) {
            char c = charArray[right];
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longestSubstring = str.substring(left, right + 1);
            }
        }
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
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

        // Given String str to find the first non-repeating character in a string
        System.out.println("-----------------------------");
        String str4 = "abcadeb";
        findFirstNonRepeatingChar(str4);

        // Given String str to find the first repeating character in a string
        System.out.println("-----------------------------");
        String str5 = "abcdeb";
        findFirstRepeatingChar(str5);

        // Given String str to find the most frequent character in a string
        System.out.println("-----------------------------");
        String str6 = "abcdeabbbc";
        findMostFrequentCharacter(str6);

        // Given String str to find the least frequent character in a string
        System.out.println("-----------------------------");
        String str7 = "abcdeabbbc";
        findLeastFrequentCharacter(str7);

        // Given String str1 and str2 to check if they are anagrams
        System.out.println("-----------------------------");
        String str8 = "listen";
        String str9 = "silent";
        anagramCheck(str8, str9);

        // Given String str to find the longest substring without repeating characters in a string
        System.out.println("-----------------------------");
        String str10 = "abcabcbb";
        findLongestSubstringWithoutRepeatingCharacters(str10);
   }
}
