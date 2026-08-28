import java.util.*;

public class Q4 {

    static char findFirstNonRepeatingChar(String text) {

        // Array to store frequency
        // ASCII has 256 possible characters
        int[] frequency = new int[256];

        // Count each character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            frequency[ch]++;
        }

        // Check characters from left to right
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Character occurring only once
            if (frequency[ch] == 1)
                return ch;
        }

        // Return special character if none found
        return '\0';
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0')
            System.out.println(
                    "No Non-Repeating Character Found"
            );

        else
            System.out.println(
                    "First Non-Repeating Character: "
                    + result
            );
    }
}