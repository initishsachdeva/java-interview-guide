/**
 * Search for an element in a given java_guide.array
 * Linear search is a simple search algorithm that checks each element of the array sequentially until the desired
 *  element is found or the end of the array is reached.
 * Time complexity: O(n)
 * Space complexity: O(1)
 * 
 * Example:
 * Input: arr = [1, 2, 3, 4, 5], key = 5
 * Output: Element found at index 4
 * 
 * Elements can be in any order, and the search will still work. If the key is not present in the array, it will return 
 * "Element not found".
 * If there are duplicate elements in the array, it will return the index of the first occurrence of the key.
 */

package data_structures.algos.search;

public class LinearSearch {

    private static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3,2,5, 3, 4, 6 };

        linearSearch(arr, 5);
        linearSearch(arr, 6);
        linearSearch(arr, 3);
    }
}
