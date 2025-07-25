import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Random object to generate a number between 1 and 100
        Random random = new Random();

        // The randomly generated number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Variable to store the user's guess
        int userGuess = 0;

        // Counter for the number of attempts
        int attempts = 0;

        // Welcome message
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        // Loop until the user guesses the correct number
        while (userGuess != targetNumber) {
            // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Increment the attempts counter
            attempts++;

            // Provide feedback to the user based on their guess
            if (userGuess < targetNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
            }
        }

        // Print the total number of attempts
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}