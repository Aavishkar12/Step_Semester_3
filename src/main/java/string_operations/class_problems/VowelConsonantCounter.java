package string_operations.class_problems;

/**
 * Week 2 - S2 - Practice Problem 1: Vowel & Consonant Counter (Library Orientation Kiosk)
 *
 * Loops with charAt() and counts vowels / consonants case-insensitively; spaces are ignored.
 */
public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Java Programming");
    }
}
