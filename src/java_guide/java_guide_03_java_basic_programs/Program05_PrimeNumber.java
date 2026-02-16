package java_guide.java_guide_03_java_basic_programs;

public class Program05_PrimeNumber {

    public static void main(String[] args) {
        int number = 7;
        int temp = 0;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0){
            System.out.println(number + " is prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }

    }
}
