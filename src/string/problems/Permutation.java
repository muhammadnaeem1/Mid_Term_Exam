package string.problems;
import java.util.HashSet;
import java.util.Set;
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *

         */
        String input = "ABC";
        Set<String> permutations = getPermutations(input);
        System.out.println(permutations);
    }

    public static Set<String> getPermutations(String input) {
        Set<String> set = new HashSet<>();
        if (input == null || input.length() == 0) {
            set.add("");
            return set;
        }
        char firstChar = input.charAt(0);
        String remaining = input.substring(1);
        Set<String> words = getPermutations(remaining);
        for (String str : words) {
            for (int i = 0; i <= str.length(); i++) {
                set.add(insertChar(str, firstChar, i));
            }
        }
        return set;
    }

    private static String insertChar(String str, char c, int i) {
        String begin = str.substring(0, i);
        String end = str.substring(i);
        return begin + c + end;



    }
}
