public class Q4 {

    // Method to analyze both sections
    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        // Variables to store total quantities
        int totalA = 0;
        int totalB = 0;

        // Calculate total of Section A
        for (int i = 0; i < sectionA.length; i++) {

            totalA = totalA + sectionA[i];
        }

        // Calculate total of Section B
        for (int i = 0; i < sectionB.length; i++) {

            totalB = totalB + sectionB[i];
        }

        // Check whether both sections have equal quantity
        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        // Variables for highest quantity
        int highest = sectionA[0];

        // Store section name
        String highestSection = "Section A";

        // Store item index
        int highestIndex = 0;

        // Find highest value in Section A
        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highest) {

                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }

        // Find highest value in Section B
        for (int i = 0; i < sectionB.length; i++) {

            if (sectionB[i] > highest) {

                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        // Display results
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);

        // +1 because array index starts from 0
        System.out.println(
                "Highest Quantity: " + highest
                + " (" + highestSection
                + ", Item " + (highestIndex + 1) + ")"
        );
    }

    public static void main(String[] args) {

        // Quantities in Section A
        int[] sectionA = {20, 15, 30};

        // Quantities in Section B
        int[] sectionB = {25, 10, 30};

        // Call the method
        analyzeInventory(sectionA, sectionB);
    }
}