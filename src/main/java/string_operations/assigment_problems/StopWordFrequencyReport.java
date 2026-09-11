package string_operations.assigment_problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Week 2 - S2 - Assignment Problem 5: Stop-Word-Filtered Word Frequency Report
 *
 * Lowercases the text, strips punctuation with replace(), splits on whitespace, skips stop
 * words, counts the rest in a LinkedHashMap and prints them sorted by count (descending).
 * The sort is stable, so ties keep the order in which the words first appeared.
 */
public class StopWordFrequencyReport {

    private static final String[] STOP_WORDS = {"the", "was", "and", "a", "is", "of", "in"};

    private static boolean isStopWord(String word) {
        for (String stop : STOP_WORDS) {
            if (stop.equals(word)) return true;
        }
        return false;
    }

    public static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase()
                .replace(".", "").replace(",", "").replace("!", "")
                .replace("?", "").replace(";", "").replace(":", "")
                .trim();
        if (cleaned.isEmpty()) {
            System.out.println("No words to report");
            return;
        }

        Map<String, Integer> frequency = new LinkedHashMap<>();
        for (String word : cleaned.split("\\s+")) {
            if (isStopWord(word)) continue;
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
