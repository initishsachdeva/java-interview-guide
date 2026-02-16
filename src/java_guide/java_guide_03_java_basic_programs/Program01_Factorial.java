// Factorial of a number: 5! = 5 * 4 * 3 * 2 * 1 = 120

package java_guide.java_guide_03_java_basic_programs;

public class Program01_Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
