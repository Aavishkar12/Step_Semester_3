package string_operations.assigment_problems;

/**
 * Week 2 - S2 - Assignment Problem 4: Library ISBN Normalizer & Validator
 *
 * Valid code = 13 chars: 3 letters (publisher) + 4 digits (year) + 6 digits (catalog number).
 * normalizeCode() trims and upper-cases only the publisher code; validateAndFormat() checks
 * each rule with Character.isLetter()/isDigit() (no regex) and formats with StringBuilder.
 */
public class LibraryIsbnValidator {

    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: year and catalog number must contain only digits";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(code, 0, 3).append("] YEAR: ").append(code, 3, 7)
          .append(" | CATALOG: ").append(code, 7, 13);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] inputs = {" pen2026004251 ", "12N2026004251", "PEN202600425", "PEN20X6004251"};
        for (String raw : inputs) {
            System.out.println("\"" + raw + "\" -> " + validateAndFormat(normalizeCode(raw)));
        }
    }
}
