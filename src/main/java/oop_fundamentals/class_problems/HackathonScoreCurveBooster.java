package oop_fundamentals.class_problems;

import java.util.Arrays;

/**
 * Week 5 - S5 - Practice Problem 1: Hackathon Score Curve Booster
 *
 * Arrays are passed as a reference to the same object, so changing the elements inside
 * curveScores() changes the caller's array - no return value needed.
 */
public class HackathonScoreCurveBooster {

    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores));
    }
}
