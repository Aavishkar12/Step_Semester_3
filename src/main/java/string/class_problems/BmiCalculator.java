package string.class_problems;

/**
 * Week 1 - S1 - Practice Problem 3: BMI Calculator for a Team (Corporate Wellness Program)
 *
 * Uses parallel arrays of heights (m) and weights (kg) for 10 employees,
 * computes BMI = weight / (height * height) and prints a wellness report table.
 */
public class BmiCalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25.0) return "Normal";
        else if (bmi < 30.0) return "Overweight";
        else return "Obese";
    }

    public static double calculateBmi(double height, double weight) {
        return weight / (height * height);
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%-8s| %-11s| %-12s| %-7s| %s%n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("--------+------------+-------------+--------+------------");
        for (int i = 0; i < heights.length; i++) {
            double bmi = calculateBmi(heights[i], weights[i]);
            System.out.printf("%-8d| %-11.2f| %-12.1f| %-7.2f| %s%n",
                    i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60, 1.82, 1.68, 1.55, 1.70, 1.90, 1.65, 1.78, 1.62};
        double[] weights = {70.0, 90.0, 60.0, 80.0, 42.0, 65.0, 95.0, 58.0, 110.0, 50.0};
        printWellnessReport(heights, weights);
    }
}
