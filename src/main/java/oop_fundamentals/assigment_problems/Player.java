package oop_fundamentals.assigment_problems;

/**
 * Week 5 - S5 - Assignment Problem 5 (model class): Player
 *
 * Encapsulated player record (private final fields + getters) with an overloaded constructor
 * that chains to the main one using this(). Implements Comparable so Arrays.sort() ranks
 * players by fantasy points, descending.
 */
public class Player implements Comparable<Player> {

    private final String name;
    private final int matchesPlayed;
    private final double battingAverage;
    private final boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    /** Overloaded constructor for a fit player. */
    public Player(String name, int matchesPlayed, double battingAverage) {
        this(name, matchesPlayed, battingAverage, false);
    }

    public String getName() { return name; }
    public int getMatchesPlayed() { return matchesPlayed; }
    public double getBattingAverage() { return battingAverage; }
    public boolean isInjured() { return injured; }

    /** Fantasy points are based on the player's batting average. */
    public double getFantasyPoints() {
        return battingAverage;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.getFantasyPoints(), this.getFantasyPoints());   // descending
    }

    @Override
    public String toString() {
        return name;
    }
}
