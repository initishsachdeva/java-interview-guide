/**
 * Count the occurrences of characters in a string
 */

package java_guide.java_guide_04_strings;


public class Program013_CountOfCharacters {
    public static void main(String[] args) {
        int count = countOccurrences("aaanjd", 'a');
        System.out.println(count);
    }


    private static int countOccurrences(String word, char character) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}