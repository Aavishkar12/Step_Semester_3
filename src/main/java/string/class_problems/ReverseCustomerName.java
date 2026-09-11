package string.class_problems;

/**
 * Week 1 - S1 - Practice Problem 5: Reverse Customer Name (Customer Identity Verification)
 *
 * Builds a reversed copy of the name from a char array; the original String is never modified
 * (Strings in Java are immutable).
 */
public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return new String(reversed);
    }

    public static void main(String[] args) {
        String customerName = "Sunil";
        String reversedName = reverseCustomerName(customerName);
        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);
    }
}
