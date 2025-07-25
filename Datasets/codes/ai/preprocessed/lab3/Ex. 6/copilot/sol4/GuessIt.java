import java.util.Scanner;
import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100:");

        while (!hasGuessedCorrectly) {
            int guess = input.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the right number.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

        input.close();
    }
}