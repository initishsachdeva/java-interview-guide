package java_guide.java_guide_03_java_basic_programs;

public class Program07_SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
//        int temp;
//
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        //replace without using temp variable
        a = a + b; //15
        b = a - b;//5
        a = a - b;//10
        System.out.println(a);
        System.out.println(b);

    }
}
