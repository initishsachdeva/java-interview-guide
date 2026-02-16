/**
 * Search for a String in a given java_guide.array
 */


package java_guide.java_guide_04_strings;

public class Program06_LinearSearchString {
    public static void main(String[] args) {
        String[] arr = {"abc", "nit", "xyz", "def", "klm"};

        String key = "abc";
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                System.out.println("Element found at index " + i);
                temp = temp + 1;
            }
        }

        if (temp == 0)
            System.out.println("Element not found");
    }
}
