package oop_fundamentals.class_problems;

import java.util.Arrays;

/**
 * Week 5 - S5 - Practice Problem 5: Placement Drive Shortlisting & Ranking Engine
 *
 * Eligibility rules (thresholds chosen to match the sample):
 *   - CGPA-only quick filter : cgpa >= 7.5
 *   - Borderline combined    : cgpa >= 6.5 AND codingScore >= 60
 * Shortlisted candidates are ranked with Arrays.sort(), which uses Candidate.compareTo().
 */
public class PlacementDriveShortlisting {

    static final double CGPA_CUTOFF = 7.5;
    static final double BORDERLINE_CGPA = 6.5;
    static final int CODING_CUTOFF = 60;

    static boolean isEligible(double cgpa) {
        return cgpa >= CGPA_CUTOFF;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= BORDERLINE_CGPA && codingScore >= CODING_CUTOFF;
    }

    static String shortlistAndRank(Candidate[] candidates) {
        int count = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa()) || isEligible(c.getCgpa(), c.getCodingScore())) {
                count++;
            }
        }
        Candidate[] shortlisted = new Candidate[count];
        int index = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa()) || isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted[index++] = c;
            }
        }

        Arrays.sort(shortlisted);   // ranking comes entirely from compareTo()

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            if (i > 0) result.append(" | ");
            result.append(i + 1).append(". ").append(shortlisted[i]);
        }
        return result.length() == 0 ? "No eligible candidates" : result.toString();
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(candidates));

        Object obj = candidates[0];
        if (obj instanceof Candidate) {        // instanceof type check before casting
            Candidate c = (Candidate) obj;
            System.out.println("Checked with instanceof: " + c.getName() + " is a Candidate");
        }
        System.out.println("Candidate objects created: " + Candidate.getCandidatesCreated());
    }
}
