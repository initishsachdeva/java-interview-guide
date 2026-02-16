package java_guide.java_guide_04_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program010_UniqueList {
    public static void main(String[] args) {

        String s = "dabcdefaaaa";
        char[] chars = s.trim().toCharArray();

        ArrayList<String> uniqueList = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            if (!uniqueList.contains(String.valueOf(chars[i]))) {
                uniqueList.add(String.valueOf(chars[i]));
            }
        }
        System.out.println(uniqueList);

        HashMap<Integer, Character> hmap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!hmap.containsValue(chars[i])) {
                hmap.put(i, chars[i]);
            }
        }
        for (Map.Entry<Integer, Character> m : hmap.entrySet())
            System.out.println(" unique value in hashmap " + m.getValue());

    }
}
