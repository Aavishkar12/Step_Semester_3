package string_operations.class_problems;

/**
 * Week 2 - S2 - Practice Problem 4: Masked Phone Number Formatter (Student-Support Call Center)
 *
 * Validates a 10-digit number, then uses StringBuilder to build "XXXXXX" + last 4 digits
 * and insert() a "-" between the mask and the visible digits.
 */
public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }
        StringBuilder masked = new StringBuilder("XXXXXX");
        masked.append(phone.substring(6));      // last 4 digits
        masked.insert(6, "-");                  // XXXXXX-3210
        return masked.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskPhoneNumber("9876543210"));
        System.out.println(maskPhoneNumber("98765"));
        System.out.println(maskPhoneNumber("98765abcde"));
    }
}
