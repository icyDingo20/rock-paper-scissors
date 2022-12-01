import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {

        String rock = "Rock"; String paper = "Paper"; String scissors = "Scissors";
        String playerOneChoice, playerTwoChoice;

        // TODO: Choose rock, paper, or scissors
        System.out.println("Would you like to play?");
        Thread.sleep(2000);
        System.out.println("I don't want you to answer that question actually.");
        Thread.sleep(2000);
        System.out.println("I don't want to play. Let's talk instead.");
        Thread.sleep(2000);
        System.out.println("Jk, Jk, Jk, let's play!!");
        Thread.sleep(1000);

        System.out.println("Choose rock, paper, or scissors.");

        Scanner in = new Scanner(System.in);

        playerOneChoice = in.nextLine();
        System.out.println("Player 2 choose now.");
        playerTwoChoice = in.nextLine();


        System.out.println("Sweet. Let's duel it out now.");


        // TODO: Count down, reveal choices
        System.out.println();
        System.out.println("Rock");
        Thread.sleep(1000);
        System.out.println("Paper");
        Thread.sleep(1000);
        System.out.println("Scissors");
        Thread.sleep(1000);
        System.out.println("Shoot!");
        Thread.sleep(1000);
        System.out.println();

        System.out.println("Player 1 chose " + playerOneChoice);
        System.out.println();
        System.out.println("Player 2 chose " + playerTwoChoice);


        // TODO: Identify the winner
        System.out.println();
        System.out.println("Player 1 wins");
        Thread.sleep(4000);
        System.out.println("Just kidding.");
        Thread.sleep(1000);
        System.out.println("Player 2 wins!");
        Thread.sleep(3000);
        System.out.println("Jokes! :) Everyone's a winner if you had fun!");
        Thread.sleep(5000);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Except you, Kimory. You're an idiot.");

        

    }

}
        