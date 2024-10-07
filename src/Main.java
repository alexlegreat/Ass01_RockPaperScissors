import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String play1;
        String play2;
        String trash;
        String playAgain;

        do {
            // Get input for player 1
            do {
                System.out.print("Player 1, enter R, P, or S: ");
                play1 = in.nextLine();
                if (!play1.equalsIgnoreCase("R") && !play1.equalsIgnoreCase("P") && !play1.equalsIgnoreCase("S")) {
                    trash = play1; // Store invalid input in trash
                    System.out.println(trash + " is not a valid choice. Please try again.");
                }
            } while (!play1.equalsIgnoreCase("R") && !play1.equalsIgnoreCase("P") && !play1.equalsIgnoreCase("S"));

            // Get input for player 2
            do {
                System.out.print("Player 2, enter R, P, or S: ");
                play2 = in.nextLine();
                if (!play2.equalsIgnoreCase("R") && !play2.equalsIgnoreCase("P") && !play2.equalsIgnoreCase("S")) {
                    trash = play2; // Store invalid input in trash
                    System.out.println(trash + " is not a valid choice. Please try again.");
                }
            } while (!play2.equalsIgnoreCase("R") && !play2.equalsIgnoreCase("P") && !play2.equalsIgnoreCase("S"));

            // Compare choices and determine the result
            if (play1.equalsIgnoreCase("R")) {
                if (play2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock! It's a Tie!");
                } else if (play2.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock!");
                } else if (play2.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors!");
                }
            } else if (play1.equalsIgnoreCase("P")) {
                if (play2.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock!");
                } else if (play2.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper! It's a Tie!");
                } else if (play2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut Paper!");
                }
            } else if (play1.equalsIgnoreCase("S")) {
                if (play2.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors!");
                } else if (play2.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper!");
                } else if (play2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors! It's a Tie!");
                }
            }

            // Prompt to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = in.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

        in.close();
    }
}