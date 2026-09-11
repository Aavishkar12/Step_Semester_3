package oop_fundamentals.class_problems;

/**
 * Week 5 - S5 - Practice Problem 2: Duplicate Team Name Finder
 *
 * Plain nested loops (no Collections). Each name is only compared with the names after it,
 * so no pair is checked twice. Comparison is case-sensitive.
 */
public class DuplicateTeamNameFinder {

    static String findDuplicateTeam(String[] teamNames) {
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateTeam(new String[]{"ByteForce", "CodeCrafters", "ByteForce"}));
        System.out.println(findDuplicateTeam(new String[]{"ByteForce", "CodeCrafters", "NullPointers"}));
    }
}
