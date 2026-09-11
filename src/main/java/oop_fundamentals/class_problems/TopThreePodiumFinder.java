package oop_fundamentals.class_problems;

import java.util.Arrays;

/**
 * Week 5 - S5 - Practice Problem 3: Top-3 Podium Finder
 *
 * Single pass, no sorting. Keep first >= second >= third and shift them down whenever
 * a new score beats one of them. Ties are kept (e.g. two 90s -> [90, 90, 82]).
 */
public class TopThreePodiumFinder {

    static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > first) {
                third = second;
                second = first;
                first = score;
            } else if (score > second) {
                third = second;
                second = score;
            } else if (score > third) {
                third = score;
            }
        }
        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})));
    }
}
