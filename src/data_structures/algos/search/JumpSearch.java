/** 
 * Jump Search is a searching algorithm for sorted arrays. It works by dividing the array into blocks of a fixed size a
 * nd then performing a linear search within the block where the target element is likely to be found. 
 * The block size is typically chosen to be the square root of the array length, which allows for efficient 
 * searching while minimizing the number of comparisons.
 * 
 * * The algorithm can be broken down into the following steps:
 * 1. Determine the block size (usually the square root of the array length).
 * 2. Jump through the array in increments of the block size until you find a block
 *  that contains the target element or until you reach the end of the array.
 * 3. Once you find the block that may contain the target element, perform a linear search within that block to
 *  find the target element.
 * * The time complexity of Jump Search is O(√n) in the worst case, making it more efficient than linear search for 
 * large sorted arrays. However, it is not as efficient as binary search, which has a time complexity of O(log n), 
 * but it can be useful in certain scenarios where the array is large and the target element is likely to be found 
 * near the beginning of the array.
 * 
 * 
 */
package data_structures.algos.search;

public class JumpSearch {

    private static int jumpSearch(int[] arr, int target) {
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
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int target = 9;
        int result = jumpSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
