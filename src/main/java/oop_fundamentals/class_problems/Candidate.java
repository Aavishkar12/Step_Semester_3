package oop_fundamentals.class_problems;

/**
 * Week 5 - S5 - Practice Problem 5 (model class): Candidate
 *
 * Encapsulation: private fields with getters only.
 * Also shows constructor overloading, this() chaining, the final keyword and a static counter.
 * Implements Comparable so Arrays.sort() ranks candidates by composite score, descending.
 */
public class Candidate implements Comparable<Candidate> {

    private static int candidatesCreated = 0;   // shared by all objects (static)

    private final String name;                  // cannot change after construction (final)
    private final double cgpa;
    private final int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;                       // 'this' separates the field from the parameter
        this.cgpa = cgpa;
        this.codingScore = codingScore;
        candidatesCreated++;
    }

    /** Overloaded constructor: a candidate who has not taken the coding test yet. */
    public Candidate(String name, double cgpa) {
        this(name, cgpa, 0);                    // constructor chaining with this()
    }

    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
    public int getCodingScore() { return codingScore; }

    /** Composite score = CGPA x 10 + coding score x 0.5 (both parts are out of 100 -> max 150). */
    public double getCompositeScore() {
        return cgpa * 10 + codingScore * 0.5;
    }

    public static int getCandidatesCreated() { return candidatesCreated; }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());   // descending
    }

    @Override
    public String toString() {
        return name + " (" + String.format("%.1f", getCompositeScore()) + ")";
    }
}
