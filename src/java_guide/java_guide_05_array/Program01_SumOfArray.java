package java_guide.java_guide_05_array;

public class Program01_SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = sumArray(arr);
        System.out.println(sum);
        int multiple = multiply(5, 10);
        System.out.println(multiple);
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int multiply(int a, int b) {
        // return a * b;
        //do it without using * operator
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + a;
        }
        return sum;
    }
}
