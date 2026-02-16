package java_guide.java_guide_04_strings;

public class Program09_SortStringArray {
    
    private static void sortStringArray(String[] arr) {
        java.util.Arrays.sort(arr);
        
         // Displaying the sorted array
        System.out.println("Sorted String Array:");
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"banana", "apple", "orange", "kiwi", "grape"};
        sortStringArray(stringArray);
    }
    
}
