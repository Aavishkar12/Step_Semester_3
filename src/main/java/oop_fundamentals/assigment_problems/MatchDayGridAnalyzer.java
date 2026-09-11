package oop_fundamentals.assigment_problems;

/**
 * Week 5 - S5 - Assignment Problem 4: Match Day Grid Analyzer
 *
 * rowAverage() only computes one match's average; classifyMatches() alone decides
 * "Power Surge" (average >= threshold) vs "Normal". Rows may have different lengths.
 */
public class MatchDayGridAnalyzer {

    private static double rowAverage(int[] row) {
        if (row.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int runs : row) {
            sum += runs;
        }
        return (double) sum / row.length;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();
        for (int m = 0; m < runsPerOver.length; m++) {
            double average = rowAverage(runsPerOver[m]);     // called once per match
            String label = average >= threshold ? "Power Surge" : "Normal";
            if (m > 0) result.append(" | ");
            result.append("Match ").append(m).append(": ").append(label);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[][] runsPerOver = {
                {4, 6, 8},
                {10, 12, 14},
                {2, 3, 1}
        };
        System.out.println(classifyMatches(runsPerOver, 8));

        int[][] jagged = {{8, 9}, {1, 2, 3, 4, 5}, {12}};
        System.out.println(classifyMatches(jagged, 8));
    }
}
