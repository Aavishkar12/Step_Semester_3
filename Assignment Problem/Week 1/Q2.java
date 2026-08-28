public class Q2 {

    // Method to check typing accuracy
    static void checkTypingAccuracy(String original, String typed) {

        // Variable to count matching characters
        int matched = 0;

        // Variable to store position of first mismatch
        int firstMismatch = -1;

        // Compare characters one by one
        for (int i = 0; i < original.length(); i++) {

            // Get character from original string
            char originalChar = original.charAt(i);

            // Get character from typed string
            char typedChar = typed.charAt(i);

            // Check whether both characters are same
            if (originalChar == typedChar) {

                matched++;

            } else {

                // Store position of first mismatch
                // only if this is the first mismatch
                if (firstMismatch == -1) {
                    firstMismatch = i;
                }
            }
        }

        // Calculate accuracy percentage
        double accuracy =
                (matched * 100.0) / original.length();

        // Print number of matching characters
        System.out.println(
                "Matched: " + matched + "/" + original.length()
        );

        // Print accuracy
        System.out.printf(
                "Accuracy: %.2f%%%n",
                accuracy
        );

        // Check whether there was a mismatch
        if (firstMismatch == -1) {

            System.out.println("No Mismatches");

        } else {

            // +1 because humans normally count positions from 1
            System.out.println(
                    "First Mismatch at position "
                    + (firstMismatch + 1)
                    + " ('"
                    + original.charAt(firstMismatch)
                    + "' vs '"
                    + typed.charAt(firstMismatch)
                    + "')"
            );
        }
    }

    public static void main(String[] args) {

        String original = "hello world";
        String typed = "hello worlt";

        // Call the method
        checkTypingAccuracy(original, typed);
    }
}