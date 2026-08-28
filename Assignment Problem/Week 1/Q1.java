public class Q1 {

    // Method to check whether duplicate seats exist
    static void checkDuplicateSeats(int[] seatNumbers) {

        // This variable keeps track of whether
        // we found any duplicate
        boolean duplicateFound = false;

        // First loop selects one seat
        for (int i = 0; i < seatNumbers.length; i++) {

            // Second loop compares that seat
            // with the remaining seats
            for (int j = i + 1; j < seatNumbers.length; j++) {

                // Check if both seat numbers are same
                if (seatNumbers[i] == seatNumbers[j]) {

                    // Duplicate found
                    System.out.println(
                            "Duplicate Seat Number Found: "
                            + seatNumbers[i]
                    );

                    duplicateFound = true;
                }
            }
        }

        // If no duplicate was found
        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        // Array containing seat numbers
        int[] seats = {101, 102, 103, 102, 105};

        // Call the method
        checkDuplicateSeats(seats);
    }
}