package string.class_problems;

/**
 * Week 1 - S1 - Practice Problem 2: Palindrome Checker (3 Approaches)
 *
 * Checks the same text with an iterative, a recursive and an array-reversal approach.
 * The text is normalised first (lowercase, letters/digits only) so short phrases work too.
 */
public class PalindromeChecker {

    private static String normalize(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /** Approach 1: two pointers moving from both ends toward the middle. */
    public static boolean isPalindromeIterative(String text) {
        String s = normalize(text);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /** Approach 2: compare first and last character, then recurse on the inner substring. */
    public static boolean isPalindromeRecursive(String text) {
        return checkRecursive(normalize(text));
    }

    private static boolean checkRecursive(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return checkRecursive(s.substring(1, s.length() - 1));
    }

    /** Approach 3: reverse a char array copy and compare it with the original. */
    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = normalize(text).toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }

    private static String label(boolean isPalindrome) {
        return isPalindrome ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        String[] inputs = {"madam", "hello", "Nurses run"};
        for (String input : inputs) {
            System.out.println("\"" + input + "\" -> Iterative: " + label(isPalindromeIterative(input))
                    + " | Recursive: " + label(isPalindromeRecursive(input))
                    + " | Array Reversal: " + label(isPalindromeArrayReversal(input)));
        }
    }
}
