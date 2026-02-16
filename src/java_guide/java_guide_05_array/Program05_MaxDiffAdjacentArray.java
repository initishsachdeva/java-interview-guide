package java_guide.java_guide_05_array;

public class Program05_MaxDiffAdjacentArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 15, 17};
        int maxDiff = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > maxDiff) {
                maxDiff = arr[i + 1] - arr[i];
            }
        }
        System.out.println(maxDiff);
    }
}
