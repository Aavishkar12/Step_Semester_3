package string_operations.assigment_problems;

/**
 * Week 2 - S2 - Assignment Problem 3: Product Inventory CSV Parser
 *
 * Splits "ProductName,SKU,Quantity" with split(","), validates exactly 3 non-empty fields
 * and prints a formatted record.
 */
public class ProductInventoryCsvParser {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);
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
        System.out.println("Product: " + fields[0].trim() + " | SKU: " + fields[1].trim()
                + " | Qty: " + fields[2].trim());
    }

    public static void main(String[] args) {
        parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parseInventoryRecord("Wireless Mouse,150");
    }
}
