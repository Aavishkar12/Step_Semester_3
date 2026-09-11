package string.assigment_problems;

/**
 * Week 1 - S1 - Assignment Problem 1: The Exam Hall Seat Duplication Checker
 *
 * Compares every seat number against every other seat number using only arrays and
 * nested loops (no Collections). Each duplicated seat number is reported once.
 */
public class ExamSeatDuplicateChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundAny = false;
        for (int i = 0; i < seatNumbers.length; i++) {
            // skip values already reported from an earlier position
            boolean seenBefore = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) continue;

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundAny = true;
                    break;
                }
            }
        }
        if (!foundAny) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        checkDuplicateSeats(new int[]{101, 102, 103, 102, 105});
        checkDuplicateSeats(new int[]{101, 102, 103, 104, 105});
    }
}
