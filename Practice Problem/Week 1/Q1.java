import java.util.*;

public class Q1 {

    // Method to decide winner of one round
    static String playRound(String player, String computer) {

        // If both choices are same, it is a draw
        if (player.equals(computer))
            return "Draw";

        // Conditions where player wins
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper"))) {

            return "Player Wins";
        }

        // Otherwise computer wins
        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Possible choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        int rounds = 5;

        for (int i = 1; i <= rounds; i++) {

            System.out.print("Enter Rock, Paper or Scissors: ");
            String player = sc.next();

            // Generate random computer move
            String computer = choices[random.nextInt(3)];

            String result = playRound(player, computer);

            System.out.println("Round " + i);
            System.out.println("Player: " + player);
            System.out.println("Computer: " + computer);
            System.out.println("Result: " + result);
            System.out.println();

            // Update score
            if (result.equals("Player Wins"))
                wins++;

            else if (result.equals("Computer Wins"))
                losses++;

            else
                draws++;
        }

        // Calculate win percentage
        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("Final Result:");
        System.out.println("Wins = " + wins);
        System.out.println("Losses = " + losses);
        System.out.println("Draws = " + draws);
        System.out.println("Win Percentage = " + winPercentage + "%");

        sc.close();
    }
}