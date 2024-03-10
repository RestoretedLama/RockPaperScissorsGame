import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {


            String[] rps = {"r", "p", "s"};
            String ComputerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter yoru move (r,p or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + "is not valid move.");
            }
            System.out.println("Computer played: " + ComputerMove);

            if (playerMove.equals(ComputerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("r")) {
                if (ComputerMove.equals("p")) {
                    System.out.println("you lose :(");
                } else if (ComputerMove.equals("s")) {
                    System.out.println("you win :)");
                }
            } else if (playerMove.equals("p")) {
                if (ComputerMove.equals("s")) {
                    System.out.println("you lose :(");
                } else if (ComputerMove.equals("r")) {
                    System.out.println("You win :) ");

                }
            } else if (playerMove.equals("s")) {
                if (ComputerMove.equals("r")) {
                    System.out.println("you lose :(");
                } else if (ComputerMove.equals("p")) {
                    System.out.println("You win :)");
                }

            }
            System.out.println("play again <;...;> (y/n)");
            String playAgain = scanner.nextLine();
            if(!playAgain.equals("y"))
            {
                break;
            }
        }
    }

}
