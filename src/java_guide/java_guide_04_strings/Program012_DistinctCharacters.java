/**
 * Print all distinct characters of a string in order
 */

package java_guide.java_guide_04_strings;

public class Program012_DistinctCharacters {
    
    /**
     * Utility method to print all distinct characters in a string
     * A distinct character appears only once in the string
     */
    public static void printDistinctCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        
        str = str.toLowerCase();
        System.out.print("Distinct characters: ");
        
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // Count occurrences of current character in entire string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // Print only if character appears once and not already printed
            if (count == 1) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
    
    /**
     * Utility method to print the first unique character in a string
     * First unique character is the first character that appears only once
     */
    public static void printFirstUniqueChar(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("First unique character: None");
            return;
        }
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // Count occurrences of current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // Print first character with count 1
            if (count == 1) {
                System.out.println("First unique character: " + str.charAt(i));
                return;
            }
        }
        
        System.out.println("First unique character: None");
    }
    
    public static void main(String[] args) {
        String str = "Geeks for geeks";
        
        printDistinctCharacters(str);
        printFirstUniqueChar(str);
    }
}