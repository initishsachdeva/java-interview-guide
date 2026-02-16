// extract hello from the given string

package java_guide.java_guide_04_strings;

public class Program05_ExtractFromString {
    public static void main(String[] args) {
        String s = "abcdhgfelggdlsso";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'h' || chars[i] == 'e' || chars[i] == 'l' || chars[i] == 'o') {
                System.out.print(chars[i]);
            }
        }
    }
}
