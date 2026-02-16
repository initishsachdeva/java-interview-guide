/**
 * Print all distinct characters of a string in order
 */

package java_guide.java_guide_04_strings;

public class Program012_DistinctCharacters {
    public static void main(String[] args) {
        String str = "Geeks for geeks";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int flag = 0;
            for (int j = 0; j < str.length(); j++) {
                // checking if two characters are equal
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(str.charAt(i));
                //print the first character from the unique string
                break;
            }
        }
    }
}