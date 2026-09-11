package string_operations.class_problems;

/**
 * Week 2 - S2 - Practice Problem 5: Bank Transaction Reference Generator & Validator
 *
 * Valid reference = 14 chars: 3 letters (bank code) + 6 digits (ddMMyy) + 5 digits (sequence).
 * normalizeReference() trims and upper-cases only the bank code; validateAndFormat() checks
 * each rule with Character.isLetter()/isDigit() (no regex) and formats with StringBuilder.
 */
public class BankTransactionReferenceValidator {

    public static String normalizeReference(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: reference must be exactly 14 characters";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: date and sequence must contain only digits";
            }
        }
        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);       // ddMMyy
        String sequence = reference.substring(9);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] DATE: ")
          .append(date, 0, 2).append("/").append(date, 2, 4).append("/").append(date, 4, 6)
          .append(" | SEQ: ").append(sequence);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] inputs = {" hdf03022600042 ", "12F03022600042", "HDF0302260004", "HDF0302A600042"};
        for (String raw : inputs) {
            String normalized = normalizeReference(raw);
            System.out.println("\"" + raw + "\" -> " + validateAndFormat(normalized));
        }
    }
}
