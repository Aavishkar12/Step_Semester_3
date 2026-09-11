package string.class_problems;

import java.util.Random;

/**
 * Week 1 - S1 - Practice Problem 1: Rock-Paper-Scissors Game (The College Coding Arcade)
 *
 * Plays N rounds between a player (predefined moves for a live demo) and the computer
 * (random moves), prints a round-by-round table and a final scoreboard.
 */
public class RockPaperScissors {

    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    /** Returns "Player Wins", "Computer Wins" or "Draw" for one round. */
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        boolean playerWins =
                (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors"))
                || (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
                || (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));
        return playerWins ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        int rounds = playerMoves.length;          // N = 5
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        Random random = new Random();

        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < rounds; i++) {
            computerMoves[i] = MOVES[random.nextInt(MOVES.length)];
            results[i] = playRound(playerMoves[i], computerMoves[i]);
            System.out.println("Round " + (i + 1) + " - Player: " + playerMoves[i]
                    + ", Computer: " + computerMoves[i] + " -> " + results[i]);
            if (results[i].equals("Player Wins")) wins++;
            else if (results[i].equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println();
        System.out.printf("%-7s| %-12s| %-14s| %s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("-------+-------------+---------------+--------------");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-7d| %-12s| %-14s| %s%n", i + 1, playerMoves[i], computerMoves[i], results[i]);
        }

        double winPercentage = (wins * 100.0) / rounds;
        System.out.println();
        System.out.println("Final Summary (after " + rounds + " rounds) Wins: " + wins + " | Losses: " + losses
                + " | Draws: " + draws + " | Win % = " + winPercentage + "%");
    }
}
