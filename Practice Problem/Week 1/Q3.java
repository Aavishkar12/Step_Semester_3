import java.util.*;

public class Q3 {

    // Method to find BMI category
    static String getBmiStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";

        else if (bmi < 25)
            return "Normal";

        else if (bmi < 30)
            return "Overweight";

        else
            return "Obese";
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        // Arrays to store height and weight
        double[] heights = new double[n];
        double[] weights = new double[n];

        // Take input
        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height in metres: ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weights[i] = sc.nextDouble();
        }

        System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < n; i++) {

            // BMI formula
            double bmi =
                    weights[i] /
                    (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf(
                    "%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    status
            );
        }
    }
}