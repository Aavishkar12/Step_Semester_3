package string.assigment_problems;

/**
 * Week 1 - S1 - Assignment Problem 4: The Warehouse Inventory Balancer
 *
 * Totals both sections, checks whether they are balanced, and finds the single highest
 * quantity together with the section and (1-based) item number where it was found.
 */
public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        int highest = Integer.MIN_VALUE;
        String highestSection = "";
        int highestItem = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestItem = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestItem = i + 1;
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB
                + " | Status: " + status + " | Highest Quantity: " + highest
                + " (" + highestSection + ", Item " + highestItem + ")");
    }

    public static void main(String[] args) {
        analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
        analyzeInventory(new int[]{12, 40, 8}, new int[]{50, 5, 9});
    }
}
