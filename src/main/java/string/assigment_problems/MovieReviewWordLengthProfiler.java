package string.assigment_problems;

/**
 * Week 1 - S1 - Assignment Problem 5: The Movie Review Word Length Profiler
 *
 * Splits the review into words and classifies each one by its number of letters:
 * Short (1-4), Medium (5-8), Long (9+). Punctuation is not counted as a letter.
 */
public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {
        int shortCount = 0, mediumCount = 0, longCount = 0;
        String trimmed = review.trim();
        if (!trimmed.isEmpty()) {
            String[] words = trimmed.split("\\s+");
            for (String word : words) {
                int letters = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isLetter(word.charAt(i))) letters++;
                }
                if (letters == 0) continue;          // e.g. a lone "-" or "!!"
                if (letters <= 4) shortCount++;
                else if (letters <= 8) mediumCount++;
                else longCount++;
            }
        }
        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
