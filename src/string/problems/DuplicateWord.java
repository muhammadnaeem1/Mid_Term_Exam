package string.problems;
import java.util.HashMap;
import java.util.Map;
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.toLowerCase();


        String[] words = st.split("[\\s.,]+");


        Map<String, Integer> wordCounts = new HashMap<>();


        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }


        System.out.println("Duplicate words and their counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }


        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        double averageLength = (double) totalLength / words.length;


        System.out.println("Average length of the words: " + averageLength);
    }

}
