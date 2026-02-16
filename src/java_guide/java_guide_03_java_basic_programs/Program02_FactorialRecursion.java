package java_guide.java_guide_03_java_basic_programs;

public class Program02_FactorialRecursion {
    static int factorial = 1;

    public static void main(String[] args) {
        int n = 5;
        int result = calFact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    private static int calFact(int n) {
        if (n > 1) {
            factorial = factorial * n;
            calFact(n - 1);
        }
        return factorial;
    }
}
