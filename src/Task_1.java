//NUMBER GAME

import java.util.*;
class Invalid_Input extends Exception {
    public String toString() {
        return "        --Invalid Input--\n           PLAY AGAIN";
    }
}

class Game {
    public void Guess_The_Number() throws Invalid_Input {
        Scanner sc=new Scanner(System.in);
        Random r = new Random();

        int Random_Number = r.nextInt(100) + 1; // Generates number between 1-100
        int Attempt = 0;
        int TotatAttempt=0;
        boolean match = false;

        for (int i = 1;; i++) {
            int Rround = i;
            System.out.println("\n         <== ROUND " +Rround+" ==>");
            System.out.println("You have 10 attempts to guess the number.");

            for (int j = 1; j <= 10; j++) {               //Maximum Attempt
                Attempt++;
                TotatAttempt+=1;
                System.out.print("Attempt : "+Attempt+" Enter your guess (1-100) ");
                int User_Input;

                try {
                    User_Input = sc.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    continue;
                }

                if (User_Input < 1 || User_Input > 100) {
                    throw new Invalid_Input();
                }
                if (Random_Number == User_Input) {
                    System.out.println("      YOU GUESSED IT CORRECT!");
                    match = true;
                    System.out.println("         <== GAME OVER ==>\n              !SCORE!\nWon in Round: "+Rround+"\nTotal Attempts taken to guess: "+TotatAttempt);
                    break;
                }
                else if (Random_Number > User_Input) {
                    System.out.println("Too Low! Try a higher number");
                }
                else {
                    System.out.println("Too High! Try a lower number.");
                }
                if (j == 10) {
                    System.out.println("Maximum attempts reached! Moving to the next round...");
                    Attempt = 0;
                }
            }
            if (match) {
                break;
            }
        }
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Game g = new Game();

        try {
            g.Guess_The_Number();
        } catch (Invalid_Input e) {
            System.out.println(e);
        }

    }
}
