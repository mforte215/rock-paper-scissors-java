import java.util.*;

public class App {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";
    public static final String QUIT = "QUIT";
    public static void main(String[] args) throws Exception {
        Boolean keepPlaying = true;
        int playerScore = 0;
        int computerScore = 0;
        while (keepPlaying) {
        System.out.println("#####-------SCORE-------#####");
        System.out.println("Player Score: " + playerScore);
        System.out.println("Computer Score: " + computerScore);
        
        System.out.println("\nEnter Rock, Paper, or Scissors (Enter QUIT to END GAME)");
        System.out.println();

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();

        if (playerMove.equals(App.QUIT)) {
            keepPlaying = false;
        }
        
        else if (playerMove.equals(computerMove)) {
            System.out.println("Player Move is: " + playerMove);
            System.out.println("Computer Move is: " + computerMove);
            System.out.println("TIE");
        }
        else if (playerMove.equals(App.ROCK)) {
            System.out.println("Player Move is: " + playerMove);
            System.out.println("Computer Move is: " + computerMove);
            if (computerMove.equals(App.PAPER)) {
                computerScore++;
            }
            else {
                playerScore++;
            }
            System.out.println(computerMove.equals(App.PAPER) ? "Computer Wins" : "Player Wins");
        }
        else if (playerMove.equals(App.PAPER)) {
            System.out.println("Player Move is: " + playerMove);
            System.out.println("Computer Move is: " + computerMove);
            if (computerMove.equals(App.SCISSORS)) {
                computerScore++;
            }
            else {
                playerScore++;
            }
            System.out.println(computerMove.equals(App.SCISSORS) ? "Computer Wins" : "Player Wins");
        }
        else {
            System.out.println("Player Move is: " + playerMove);
            System.out.println("Computer Move is: " + computerMove);
            if (computerMove.equals(App.ROCK)) {
                computerScore++;
            }
            else {
                playerScore++;
            }
            System.out.println(computerMove.equals(App.ROCK) ? "Computer Wins" : "Player Wins");
        }
    }

    }

    public static String getComputerMove() {
        String computerMove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1) {
            computerMove = App.ROCK;
        }
        else if (input == 2) {
            computerMove = App.PAPER;
        }
        else {
            computerMove = App.SCISSORS;
        }
        
        System.out.println();
        return computerMove;
    }

    public static String getPlayerMove() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        
        return playermove;
    }

}

