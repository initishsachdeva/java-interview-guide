/**
 * Reverse a given number, also verify if it's a palindrome or not
 * 121 -> 121 -> palindrome
 * 123 -> 321 -> not a palindrome
 * 
 * remainder = 121 % 10 -> 1
 * reverse = 0 * 10 + 1 -> 1
 * temp = 121 / 10 -> 12
 * 
 * remainder = 12 % 10 -> 2
 * reverse = 1 * 10 + 2 -> 12
 * temp = 12 / 10 -> 1
 * 
 * remainder = 1 % 10 -> 1
 * reverse = 12 * 10 + 1 -> 121
 * temp = 1 / 10 -> 0
 * 
 */
package java_guide.java_guide_03_java_basic_programs;

public class Program06_ReverseNumber {
    public static void main(String[] args) {
        int a = 121;
        int temp = a;
        int reverse = 0;
        int remainder;

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        System.out.println("Number reversal returned a number -> " + reverse);
        if (a == reverse) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
