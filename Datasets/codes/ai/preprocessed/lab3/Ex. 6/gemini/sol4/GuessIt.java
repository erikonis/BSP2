import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Random generator = new Random();
        int theNumber = generator.nextInt(100) + 1;
        Scanner keyboard = new Scanner(System.in);
        int userGuess = 0;
        int guessCount = 0;

        System.out.println("I've picked a number from 1 to 100. Try to guess!");

        while (userGuess != theNumber) {
            System.out.print("Your guess: ");
            if (keyboard.hasNextInt()) {
                userGuess = keyboard.nextInt();
                guessCount++;

                if (userGuess < theNumber) {
                    System.out.println("Higher...");
                } else if (userGuess > theNumber) {
                    System.out.println("Lower...");
                }
            } else {
                System.out.println("That's not a number!");
                keyboard.next(); // Consume the invalid input
            }
        }

        System.out.println("You guessed it in " + guessCount + " attempts! The number was " + theNumber + ".");
        keyboard.close();
    }
}