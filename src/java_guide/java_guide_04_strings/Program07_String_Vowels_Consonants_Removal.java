/**
 * For a given java_guide.strings
 * s1 ="Abcdef" , remove the vowels with '*'
 * s2="Abcdef" , remove the consonants with '*'
 */
package java_guide.java_guide_04_strings;

public class Program07_String_Vowels_Consonants_Removal {

    private static void printConsonants() {
        //If you only wants to print consonants from a given string
        String s3 = "Given a statement";
        s3 = s3.toLowerCase();
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) != 'a' && s3.charAt(i) != 'e' && s3.charAt(i) != 'i' && s3.charAt(i) != 'o' && s3.charAt(i) != 'u') {
                System.out.print(s3.charAt(i));
            }
        }
        System.out.println();
    }

    private static void removeVowels(String s1) {
        char[] str1 = s1.toCharArray();
       
        //Remove vowels with '*'
        for (int i = 0; i < str1.length; i++) {
             char ch = Character.toLowerCase(str1[i]);   
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str1[i] = '*';
            }
        }
        System.out.println("String after vowels removal - > " + new String(str1));
    }

    private static void removeConsonants(String s2) {
       // remove consonants with '#'
        char[] str2 = s2.toCharArray();
        
        for (int i = 0; i < str2.length; i++) {
            char ch = Character.toLowerCase(str2[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else
                str2[i] = '#';
        }
        String A4 = new String(str2);
        System.out.println("Strings after consonants removal -> " + A4);
    }

    public static void main(String[] args) {
        String s1 = "Abcdef";
        String s2 = "Abcdef";

        String A1 = " ";
        String A2 = " ";

        A1 = s1.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("removed vowels using string literals method -> " + A1);

        A2 = s2.replaceAll("[bcdifghjklmnpqrstvwxyz]", "#");
        System.out.println("removed consonants using string literals method -> " + A2);

        System.out.println(" ---------------------------- ");
        printConsonants();

        System.out.println(" ---------------------------- ");
        removeVowels(s1);
        System.out.println(" ---------------------------- ");
        removeConsonants(s2);
      
    }
}
