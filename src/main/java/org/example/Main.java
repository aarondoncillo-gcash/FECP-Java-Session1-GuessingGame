package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generate random number
        int secretNumber = (int) (Math.random() * 5) + 1;

        int guess;
        //Get user input
        System.out.println("I'm thinking of a number between 1 and 5.");
        int i = 1;
        boolean isCorrect = false;

        // Check if user input matches secret number
        do {
            System.out.print("Guess " + i + ": ");
            guess = sc.nextInt();
            if (guess == secretNumber) {
                isCorrect = true;
                System.out.println("You guessed it!");
                break;
            }
            System.out.println("Wrong guess.");
            ++i;

        } while(guess != secretNumber && i <= 3);

        if (isCorrect)
            System.out.println("You win!");
        else
            System.out.println("You lose. The correct number was " + secretNumber);


    }
}