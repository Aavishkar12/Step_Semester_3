import java.util.Scanner;

public class Q4 {
    public Q4() {
    }

    static void GCD(int number1, int number2) {

        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        System.out.println("The GCD is : " + number1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();

        GCD(number1, number2);

        sc.close();
    }
}