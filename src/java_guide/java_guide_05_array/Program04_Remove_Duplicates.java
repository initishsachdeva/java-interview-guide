package java_guide.java_guide_05_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program04_Remove_Duplicates {


    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8};

        //print unique numbers in a given array
        //also print occurrences of number repeated in a given array

        ArrayList<Integer> uniqueList = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (!uniqueList.contains(a[i])) {
                uniqueList.add(a[i]);
            }
        }
        System.out.println(uniqueList);
        countOccurences(a);
    }

    public static void countOccurences(int[] a) {
         int k = 0;
        //  count the occurences
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length-1; j++) {
                if (a[i] == a[j]) {
                    k++;
                }

            }
            if(k != 0)
                System.out.print(a[i] + " repeated \t " + k + " \n");
        }

    }
}