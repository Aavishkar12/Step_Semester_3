package string_operations.class_problems;

/**
 * Week 2 - S2 - Practice Problem 3: File Extension Validator (Assignment-Upload Portal)
 *
 * Finds the last '.' with lastIndexOf(), extracts the extension with substring() and
 * compares it case-insensitively against the accepted list.
 */
public class FileExtensionValidator {

    private static final String[] ACCEPTED_EXTENSIONS = {"pdf", "docx", "zip"};

    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected - invalid file type";
        }
        String extension = filename.substring(dotIndex + 1);
        for (String accepted : ACCEPTED_EXTENSIONS) {
            if (extension.equalsIgnoreCase(accepted)) {
                return "Accepted";
            }
        }
        return "Rejected - invalid file type";
    }

    public static void main(String[] args) {
        String[] files = {"Assignment1.PDF", "notes.txt", "project.final.Zip", "README"};
        for (String file : files) {
            System.out.println("\"" + file + "\" -> " + validateFileExtension(file));
        }
    }
}
