// 2 4 5
// 1 3 6
// 7 8 9
package java_guide.java_guide_05_array;

public class Program03_MaxNumberArray {
    public static void main(String[] args) {
        int[][] array = {{2, 4, 5}, {1, 3, 6}, {7, 8, 9}};
        int max = array[0][0];

        int[] arr = {2, 4, 5, 11};
        int max1D = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1D) {
                max1D = arr[i];
            }
        }
        System.out.println("Max  value in 1d array is  " + max1D);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max value in 2d array" + max);
    }
}
