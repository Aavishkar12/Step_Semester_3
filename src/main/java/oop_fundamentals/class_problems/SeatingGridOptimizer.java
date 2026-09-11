package oop_fundamentals.class_problems;

/**
 * Week 5 - S5 - Practice Problem 4: Hackathon Seating Grid Optimizer
 *
 * rowAverage() only computes one row's average; classifyRows() is the only place that
 * decides "Quiet Zone" vs "Buzzing Zone". Works on jagged grids (rows of different length).
 */
public class SeatingGridOptimizer {

    private static double rowAverage(int[] row) {
        if (row.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder result = new StringBuilder();
        for (int r = 0; r < seatingScores.length; r++) {
            double average = rowAverage(seatingScores[r]);     // called once per row
            String zone = average < threshold ? "Quiet Zone" : "Buzzing Zone";
            if (r > 0) result.append(" | ");
            result.append("Row ").append(r).append(": ").append(zone);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[][] seatingScores = {
                {40, 50, 45},
                {85, 90, 95},
                {30, 20, 25}
        };
        System.out.println(classifyRows(seatingScores, 60));

        int[][] jagged = {{70, 80}, {10, 20, 30, 40}, {60}};
        System.out.println(classifyRows(jagged, 60));
    }
}
