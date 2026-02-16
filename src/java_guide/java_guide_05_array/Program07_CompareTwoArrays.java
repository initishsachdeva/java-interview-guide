package java_guide.java_guide_05_array;

import java.util.ArrayList;

public class Program07_CompareTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] b = {1, 4, 6, 7};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.println("Values match in both array at index - > " + i);
                //create a new array of matching index values
                list.add(a[i]);
            }
        }
        System.out.println("array list items with same value " + list);
        // to convert list into array
        Object[] c = list.toArray();
        for (Object i : c)
            System.out.println(i);
    }
}
