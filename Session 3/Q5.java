import java.util.Scanner;
public class Q5 {
    static void checkifArmStrong(int number) {
        int origNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }

        if (sum == origNumber) {
            System.out.println("Given number is an Armstrong number");
        } else {
            System.out.println("Given number is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        checkifArmStrong(number);
    }
}