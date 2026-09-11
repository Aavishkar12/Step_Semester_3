package oop_fundamentals.assigment_problems;

import java.util.Arrays;

/**
 * Week 5 - S5 - Assignment Problem 5: Fantasy League Auto-Draft Ranking Engine
 *
 * Draft rules (thresholds chosen to match the sample):
 *   - Established players (experience only) : matchesPlayed >= 10 (fitness ignored)
 *   - Everyone else (combined rule)         : matchesPlayed >= 5 AND not injured
 * Draftable players are ranked with Arrays.sort(), which uses Player.compareTo().
 */
public class FantasyAutoDraftEngine {

    static final int EXPERIENCED_MATCHES = 10;
    static final int MIN_MATCHES_IF_FIT = 5;

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= EXPERIENCED_MATCHES;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= MIN_MATCHES_IF_FIT && !injured;
    }

    static String draftAndRank(Player[] players) {
        int count = 0;
        for (Player p : players) {
            if (isDraftable(p.getMatchesPlayed()) || isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                count++;
            }
        }
        Player[] draftable = new Player[count];
        int index = 0;
        for (Player p : players) {
            if (isDraftable(p.getMatchesPlayed()) || isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                draftable[index++] = p;
            }
        }

        Arrays.sort(draftable);   // ranking comes entirely from compareTo()

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) result.append(" | ");
            result.append(i + 1).append(". ").append(draftable[i]);
        }
        return result.length() == 0 ? "No draftable players" : result.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(players));
    }
}
