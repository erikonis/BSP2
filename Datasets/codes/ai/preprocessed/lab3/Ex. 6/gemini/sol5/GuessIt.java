import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Random numGenerator = new Random();
        int targetNumber = numGenerator.nextInt(100) + 1;
        Scanner userInput = new Scanner(System.in);
        int playerGuess = -1; // Initialize to a value outside the range
        int attemptsMade = 0;

        System.out.println("I've chosen a secret number between 1 and 100. Can you guess it?");

        while (playerGuess != targetNumber) {
            System.out.print("Your guess: ");
            if (userInput.hasNextInt()) {
                playerGuess = userInput.nextInt();
                attemptsMade++;

                if (playerGuess < targetNumber) {
                    System.out.println("The secret number is greater than your guess.");
                } else if (playerGuess > targetNumber) {
                    System.out.println("The secret number is smaller than your guess.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                userInput.next(); // Consume the non-integer input
            }
        }

        System.out.println("You've guessed the secret number, " + targetNumber + ", in " + attemptsMade + " attempts!");
        userInput.close();
    }
}