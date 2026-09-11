package string_operations.assigment_problems;

/**
 * Week 2 - S2 - Assignment Problem 2: Word Reversal Encoder ("mirror text" mini-game)
 *
 * Splits the sentence on spaces, reverses each word with a loop + StringBuilder and joins
 * the words back in the same order.
 */
public class WordReversalEncoder {

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int w = 0; w < words.length; w++) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = words[w].length() - 1; i >= 0; i--) {
                reversedWord.append(words[w].charAt(i));
            }
            if (w > 0) {
                result.append(" ");
            }
            result.append(reversedWord);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
        System.out.println(reverseEachWord("Java is fun"));
    }
}
