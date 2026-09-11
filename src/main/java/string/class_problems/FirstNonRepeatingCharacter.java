package string.class_problems;

/**
 * Week 1 - S1 - Practice Problem 4: First Non-Repeating Character (Unique Letter Hunt)
 *
 * Pass 1 counts the frequency of every character; pass 2 scans left to right and
 * returns the first character whose count is exactly 1.
 */
public class FirstNonRepeatingCharacter {

    /** Returns the first non-repeating character, or '\0' if there is none. */
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);      // early exit
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc", "programming"};
        for (String input : inputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result == '\0') {
                System.out.println("\"" + input + "\" -> No Non-Repeating Character Found");
            } else {
                System.out.println("\"" + input + "\" -> First Non-Repeating Character: '" + result + "'");
            }
        }
    }
}
