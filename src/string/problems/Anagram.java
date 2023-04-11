package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is

        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String s1 = "CAT";
        String s2 = "ACT";

        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);





    }


}
