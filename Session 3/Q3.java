import java.util.Scanner;

public class Q3 {

    static void Palindrome(int number) {
        int origNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        if (reversedNumber == origNumber) {
            System.out.println("Given number is a Palindrome");
        } else {
            System.out.println("Given number is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        Palindrome(number);
    }
}