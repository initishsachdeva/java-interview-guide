/**
 * Sort the elements in a given java_guide.array
 */
package data_structures.algos.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        int temp;

        for (int i = 0; i < arr.length; i++) {
            // Last i elements are already in place
            for (int j = 1; j < (arr.length - i); j++) {
                // Swap if the element is found greater than the next element
                if (arr[j - 1] > arr[j]) {
                    // Swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted java_guide.array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
