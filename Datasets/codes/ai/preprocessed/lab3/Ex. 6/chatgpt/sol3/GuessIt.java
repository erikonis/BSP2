import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Variable to store the user's guess
        int userGuess = 0;

        // Counter to track the number of attempts
        int attempts = 0;

        // Welcome message
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != targetNumber) {
            // Prompt the user for a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Increment the attempt counter
            attempts++;

            // Provide feedback on the guess
            if (userGuess < targetNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
            }
        }

        // Output the number of attempts
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");

        // Close the scanner
        scanner.close();
    }
}