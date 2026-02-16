/**
 * Reverse a given string, also verify if it's a palindrome
 */
package java_guide.java_guide_04_strings;


public class Program03_PalindromeStringRecursion {
    public static void main(String[] args) {
        String a = "madam";
        recursiveCheckPalindrome(a);
        }
        
    private static boolean recursiveCheckPalindrome(String s){
        if(s.length() <= 1) {
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        return recursiveCheckPalindrome(s.substring(1, s.length()-1));
    }
}
