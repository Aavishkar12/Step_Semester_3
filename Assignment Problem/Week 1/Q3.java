public class Q3 {

    // Method to find the longest continuous streak
    static void findLongestStreak(String signalLog) {

        // Stores the length of the current streak
        int currentStreak = 1;

        // Stores the longest streak found so far
        int longestStreak = 1;

        // Stores the character having the longest streak
        char longestChar = signalLog.charAt(0);

        // Start from the second character
        for (int i = 1; i < signalLog.length(); i++) {

            // Check if current character is same
            // as the previous character
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {

                // Increase current streak
                currentStreak++;

            } else {

                // Streak has ended
                currentStreak = 1;
            }

            // Check if current streak is the longest
            if (currentStreak > longestStreak) {

                longestStreak = currentStreak;

                // Store the character
                longestChar = signalLog.charAt(i);
            }
        }

        // Print result
        System.out.println(
                "Longest Streak: '"
                + longestChar
                + "' repeated "
                + longestStreak
                + " times"
        );
    }

    public static void main(String[] args) {

        String signalLog = "RRRGGGR";

        // Call the method
        findLongestStreak(signalLog);
    }
}