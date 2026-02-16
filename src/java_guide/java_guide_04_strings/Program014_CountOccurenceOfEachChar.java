/** 
 * Count the occurrence of each character in a string
 * for eg: "aaanjd" -> a:3, n:1, j:1, d:1
 */ 

package java_guide.java_guide_04_strings;
import java.util.Map;
import java.util.HashMap;

public class Program014_CountOccurenceOfEachChar {
    public static void main(String[] args) {
        String str = "taaan j d";
        countOccurrencesOfEachChar(str);
    }

    private static void countOccurrencesOfEachChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
