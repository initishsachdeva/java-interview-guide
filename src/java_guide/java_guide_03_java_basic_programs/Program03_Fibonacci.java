package java_guide.java_guide_03_java_basic_programs;

public class Program03_Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        int count = 1;
        int number = 7;
        System.out.print(a + "\t" + b + "\t");
        while (count <= number) {
            c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
            count++;
        }
    }
}
