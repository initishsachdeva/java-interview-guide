package java_guide.java_guide_04_strings;

public class Program04_SplitString {
    public static void main(String[] args) {
        String s = "This is a given statement";
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
