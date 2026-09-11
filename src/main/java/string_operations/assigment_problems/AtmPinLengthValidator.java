package string_operations.assigment_problems;

/**
 * Week 2 - S2 - Assignment Problem 1: ATM PIN Length Validator
 *
 * Only length() and a single if / else - no loop needed.
 */
public class AtmPinLengthValidator {

    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN - must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        checkPinLength("482");
        checkPinLength("4820");
    }
}
