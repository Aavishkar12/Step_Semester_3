package string_operations.class_problems;

/**
 * Week 2 - S2 - Practice Problem 2: CSV Student Record Parser (T&P Team)
 *
 * Splits "Name,RollNumber,Department" with split(","), validates there are exactly 3
 * non-empty fields and prints a formatted record.
 */
public class CsvStudentRecordParser {

    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);   // -1 keeps empty trailing fields
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        for (String field : fields) {
            if (field.trim().isEmpty()) {
                System.out.println("Invalid Record");
                return;
            }
        }
        System.out.println("Name: " + fields[0].trim() + " | Roll No: " + fields[1].trim()
                + " | Dept: " + fields[2].trim());
    }

    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parseStudentRecord("Ananya Verma,CSE");
    }
}
