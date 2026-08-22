import java.util.Scanner;

public class Q1 {

    static void primeNumber(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number " + number + " is a Prime number.");
        } else {
            System.out.println("The number " + number + " is not a Prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        primeNumber(number);
        sc.close();
    }
}