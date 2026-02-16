// 2 4 5
// 1 3 6
// 7 8 9
package java_guide.java_guide_05_array;

public class Program02_MinNumberArray {
    public static void main(String[] args) {
        int[][] array = {{2, 4, 5}, {1, 3, 6}, {7, 8, 9}};
        int min = array[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Minimum value is " + min);
    }
}
