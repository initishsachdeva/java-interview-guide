/**
 * what is binary search? 
 * It is an optimized way of searching for an element but this only works in a sorted array.
 * It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in 
 * the middle of the interval, the search continues in the left half; otherwise, it continues in the right half.
 * If java_guide.array is not sorted then we have to sort it first and then apply binary search.
 * It is better than the linear search as it has a time complexity of O(logn) whereas linear search has O(n) time 
 * complexity.
 * 
 * Time complexity: O(logn)
 * Space complexity: O(1) for iterative approach and O(logn) for recursive approach
 * 
 * Example:
 * Input: arr = [1, 2, 3, 4, 5, 6], key = 5
 * Output: Element found at index 4
 */

package data_structures.algos.search;


public class BinarySearch_BFS {

    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle;
        //if left exceeds right then the element is not present in the java_guide.array and return -1
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

    public static int binarySearchRecursion(int[] arr, int target, int left, int right) {
        if (right < left)
            return -1;
        int middle = (left + right) / 2;
        if (arr[middle] == target)
            return middle;
        if (arr[middle] > target) {
            right = middle - 1;
            return binarySearchRecursion(arr, target, left, right);
        } else {
            left = middle + 1;
            return binarySearchRecursion(arr, target, left, right);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        binarySearch(arr, target);

        int ans2 = binarySearchRecursion(arr, target, 0, arr.length - 1);
        System.out.println(ans2);
    }
}
