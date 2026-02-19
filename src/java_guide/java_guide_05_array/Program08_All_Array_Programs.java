/*  
All Arrays Programs

1. Sum of all elements in an array
2. Average of all elements in an array
3. Minimum number in an array
4. Maximum number in an array
5. Find the second largest number in an array
6. Find the second smallest number in an array
7. Find kthlargest and smallest number in an array
8. Find duplicate elements in an array
9. Remove duplicates from an array 
10. Find first duplicate element in an array
11. Count occurrences of each element in an array 
12. Frequency of each element in an array
13. Find missing number in an array
14. Check if an array is sorted
15. Merge two arrays
16. Intersection of two arrays
17. Union of two arrays
18. Longest consecutive sequence in an array
19. Insert an element at a specific position in an array
20. Delete an element from an array
21. Reverse an array
22. Rotate array (left & right)
23. Move all zeros to end
24. Two Sum problem
25. Find majority element (Boyer-Moore)
26. Subarray with given sum
27. Maximum subarray sum (Kadane’s Algorithm)

*/

package java_guide.java_guide_05_array;

import java.util.ArrayList;
import java.util.List;

public class Program08_All_Array_Programs {

    private static void calSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum is : " + sum);

    }

    private static void calAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("average is is : " + sum / arr.length);
    }

    private static void findMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number in the array is : " + min);
    }

    private static void findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in the array is : " + max);
    }

    private static void findSecondLargest(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Second largest number in the array is : " + arr[1]);
    }

    private static void findSecondSmallest(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second smallest number in the array is : " + arr[1]);
    }

    private static void findkthLargest(int[] arr) {
        int temp;
        int k = 4;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println("kth largest number in the array is : " + arr[i]);
            }
        }
    }

    private static void findkthSmallest(int[] arr) {
        int temp;
        int k = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println("kth largest number in the array is : " + arr[i]);
            }
        }
    }

    private static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j)) {
                    System.out.println("Duplicate elements are : " + arr[j]);
                }
            }
        }
    }

    private static void removeDuplicates(int[] arr) {
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mylist.contains(arr[i])) {
                mylist.add(arr[i]);
            }
        }
        System.out.println("Removed duplicate elements from the list : " + mylist);
    }

    private static void findFirstDuplicate(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("first duplicate element is : " + arr[j]);
                    temp = temp + 1;
                    break;
                }
            }
            if (temp > 0) {
                break;
            }
        }
    }

    private static void findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int allSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Missing number is : " + (allSum - sum));
    }

    private static void insertElement(int[] arr, int pos) {

        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("new array after insertion is :" + arr[i]);
        }
    }

    private static void deleteElement(int[] arr, int delete) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (delete == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("new array after deletion is :" + arr[i]);
        }
    }

    private static void moveZerosToEnd(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("moving zeros to end :" + arr[i]);
        }
    }

   private static void moveZerosToFront(int[] arr){
    int[] temp =new int[arr.length];
    int index = 0; // pointer for placing zero elements
    
    // Move all zeros to the front
    for (int num: arr){
        if (num == 0) {
            index++;
        }
    }
    
    // Fill remaining positions with non-zero elements
    for (int num : arr){
        if (num != 0) {
            temp[index] = num;
            index++;
        }
    }
    
    // Print the result
    for (int i = 0; i < temp.length; i++){
        System.out.println("moving zeros to front :" + temp[i]);
    }
}

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 2, 6, 7 };
        calSum(arr);
        calAvg(arr);
        findMinNumber(arr);
        findMaxNumber(arr);
        findSecondLargest(arr);
        findSecondSmallest(arr);
        findkthLargest(arr);
        findkthSmallest(arr);
        int[] arr1 = { 2, 4, 6, 8, 1, 4, 5, 6 };
        findDuplicates(arr1);
        removeDuplicates(arr1);
        findFirstDuplicate(arr1);
        int[] arr2 = { 1, 2, 4, 5 };
        findMissingNumber(arr2);
        int[] arr3 = { 1, 2, 4, 5 };
        insertElement(arr3, 2);
        int[] arr4 = { 1, 2, 4, 5 };
        deleteElement(arr4, 2);
        int[] arr5 = { 1, 0, 2, 0, 3, 0, 4, 5 };
        moveZerosToEnd(arr5);
        int[] arr6 = { 1, 0, 2, 0, 3, 0, 4, 5 };
        moveZerosToFront(arr6);
    }
}
