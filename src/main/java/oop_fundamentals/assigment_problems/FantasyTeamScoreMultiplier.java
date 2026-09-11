package oop_fundamentals.assigment_problems;

import java.util.Arrays;

/**
 * Week 5 - S5 - Assignment Problem 1: Fantasy Team Score Multiplier
 *
 * Captain gets 2x, vice-captain 1.5x. The array is modified in place (arrays are passed
 * by reference to the same object), so nothing is returned. Only two direct assignments.
 */
public class FantasyTeamScoreMultiplier {

    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] *= 2;
        playerScores[viceCaptainIndex] *= 1.5;
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};
        applyMultipliers(scores, 1, 3);
        System.out.println(Arrays.toString(scores));
    }
}
