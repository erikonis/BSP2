import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate the random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Initialize the user's guess variable
        int userGuess = 0;

        // Initialize a counter to track the number of attempts
        int attempts = 0;

        // Start the game and prompt the user for guesses
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        // Continue until the user guesses the number correctly
        while (userGuess != targetNumber) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Increment the attempt counter
            attempts++;

            // Provide feedback based on the guess
            if (userGuess < targetNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
            }
        }

        // Print the number of attempts after the correct guess
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
