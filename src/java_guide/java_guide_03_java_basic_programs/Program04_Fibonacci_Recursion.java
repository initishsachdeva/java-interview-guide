package java_guide.java_guide_03_java_basic_programs;

public class Program04_Fibonacci_Recursion {
    static int a = 0;
    static int b = 1;
    static int c = 0;

    public static void main(String[] args) {
        int number = 7;
        System.out.print(a + "\t" + b + "\t");
        printFib(number - 2);
    }

    private static void printFib(int i) {
        if (i > 1) {
            c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
            printFib(i - 1);
        }
    }
}
