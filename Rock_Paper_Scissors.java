import java.util.*;

//Custom Exception for invalid input
class Invalid_Input extends Exception{
    public String toString(){
        return "Invalid input. \nPlease enter a number less than 3 (0 for Rock, 1 for Paper, 2 for Scissors).";
    }
}
class SPS{
    Random rc = new Random();
    void game(int player) throws Invalid_Input{
        if(player>=3){
            throw new Invalid_Input();
        }
        String HumanInput;
        switch (player) {
            case 0:
                HumanInput = "Rock";
                break;
            case 1:
                HumanInput = "Paper";
                break;
            case 2:
                HumanInput = "Scissors";
                break;
            default:
                HumanInput = "Invalid no";
                break;
        }
        System.out.println("You have chosen " + HumanInput);

        int computer = rc.nextInt(3);
        String CompInput;
        switch (computer) {
            case 0:
                CompInput = "Rock";
                break;
            case 1:
                CompInput = "Paper";
                break;
            case 2:
                CompInput = "Scissors";
                break;
            default:
                CompInput = "Invalid no";
                break;
        }
        System.out.println("The computer has chosen " + CompInput);

        if (player == computer) {
            System.out.println("It's a draw!");
        } else if
        (player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1) {
            System.out.println("You win! The computer loses.");
        } else {
            System.out.println("The computer wins. You lose.");
        }
    }
}


public class Project1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SPS gameLogic =new SPS();
        System.out.println("Welcome to Stone-Paper-Scissors!");
        System.out.println("Enter a number for human player: 0 for Rock, 1 for Paper, 2 for Scissors");
        while (true) {
            try {
                int player = sc.nextInt();
                gameLogic.game(player);
                break;                                                     //to terminate while loop
            } catch (Invalid_Input e) {
                System.out.println(e);
            }
        }
    }
}
