import java.util.*;

public class Q5 {

    // Method to reverse customer name
    static String reverseCustomerName(String customerName) {

        String reversed = "";

        // Start from last character
        // and move towards first character
        for (int i = customerName.length() - 1;
             i >= 0;
             i--) {

            reversed =
                    reversed + customerName.charAt(i);
        }

        return reversed;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        String reversedName =
                reverseCustomerName(name);

        // Original string remains unchanged
        System.out.println(
                "Original Name: " + name
        );

        System.out.println(
                "Reversed Name: " + reversedName
        );
    }
}