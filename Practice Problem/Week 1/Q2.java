import java.util.*;

public class Q2 {

    // Method to check whether a string is a palindrome
    static boolean isPalindromeIterative(String text) {

        // Start pointer from the beginning
        int left = 0;

        // Start pointer from the end
        int right = text.length() - 1;

        // Compare characters until the pointers meet
        while (left < right) {

            // If characters don't match, it is not a palindrome
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            // Move left pointer forward
            left++;

            // Move right pointer backward
            right--;
        }

        // If all characters matched, it is a palindrome
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the palindrome method
        boolean result = isPalindromeIterative(text);

        // Display result
        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}