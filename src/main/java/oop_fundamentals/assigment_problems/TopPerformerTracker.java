package oop_fundamentals.assigment_problems;

/**
 * Week 5 - S5 - Assignment Problem 3: Top Performer Tracker
 *
 * No sorting: min and max are updated together in one pass. Time O(n), space O(1).
 */
public class TopPerformerTracker {

    static String findMinMaxSpread(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) min = scores[i];
            if (scores[i] > max) max = scores[i];
        }
        return "Min: " + min + " | Max: " + max + " | Spread: " + (max - min);
    }

    public static void main(String[] args) {
        System.out.println(findMinMaxSpread(new int[]{45, 82, 79, 90, 33, 90, 61}));
    }
}
