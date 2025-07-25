package ex6;

import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(Stringargs) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int guess;
        int tries = 0;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            tries++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            }
        } while (guess != number);

        System.out.println("Correct! You guessed it in " + tries + " tries.");
    }
}