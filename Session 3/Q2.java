import java.util.Scanner;
public class Q2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input for rows : ");
        int rows = sc.nextInt();
        if (rows<=0){
            System.out.println("Please enter a valid input");
        }
        else{
            System.out.println("The pattern is : ");
        }

        for ( int i = 1; i<=rows;i++){
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}