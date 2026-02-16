/*  
Linear search - array can be any order and time complexity is O(n)
Binary search - array should be sorted and time complexity is O(logn)
Jump search - array should be sorted and time complexity is O(√n)

Interpolation search - array should be sorted and time complexity is O(log log n) in best case and O(n) in worst case
*/

package data_structures.algos.search;

import java.util.Arrays;

public class AllSearch {

    private static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    private static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle;
        // if left exceeds right then the element is not present in the java_guide.array
        // and return -1
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == target)
                System.out.println("Element found at index " + middle);
            if (arr[middle] > target)
                right = middle - 1;
            else
                left = middle + 1;
        }
    }

    private static void jumpSearch(int[] arr, int target) {
        int blocksize = (int) Math.sqrt(arr.length);
        int start = 0;
        int last = blocksize - 1;
        while (arr[last] < target && start < arr.length) {
            start = last + 1;
            last = last + blocksize;
            if (last > arr.length - 1) {
                last = arr.length - 1;
            }
            for (int i = start; i <= last; i++) {
                if (arr[i] == target) {
                    System.out.println("Element found at index " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 8, 9, 10 };
        int target = 5;

        // linear search
        linearSearch(arr, target);

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Binary search
        binarySearch(arr, 10);

        // Jump search
        jumpSearch(arr, 6);
    }
}
