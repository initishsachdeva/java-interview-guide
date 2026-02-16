/**
 * Sort the elements in a given java_guide.array
 */
package java_guide.java_guide_05_array;

public class Program06_DescendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            // Last i elements are already in place
            for (int j = i + 1; j < arr.length; j++) {
                // Swap if the element is found greater than the next element
                if (arr[i] < arr[j]) {
                    // Swap elements
                    temp = arr[i];
                    arr[i] = arr[j];
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
