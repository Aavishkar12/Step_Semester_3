public class Q5 {

    // Method to classify word lengths
    static void classifyWordLengths(String review) {

        // Split the sentence into individual words
        String[] words = review.split(" ");

        // Counters for each category
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        // Go through every word
        for (int i = 0; i < words.length; i++) {

            // Find length of current word
            int length = words[i].length();

            // Short = 1 to 4 letters
            if (length >= 1 && length <= 4) {

                shortWords++;

            }

            // Medium = 5 to 8 letters
            else if (length >= 5 && length <= 8) {

                mediumWords++;

            }

            // Long = 9 or more letters
            else {

                longWords++;
            }
        }

        // Print final counts
        System.out.println("Short: " + shortWords);
        System.out.println("Medium: " + mediumWords);
        System.out.println("Long: " + longWords);
    }

    public static void main(String[] args) {

        String review =
                "This movie was absolutely fantastic and thrilling";

        // Call the method
        classifyWordLengths(review);
    }
}