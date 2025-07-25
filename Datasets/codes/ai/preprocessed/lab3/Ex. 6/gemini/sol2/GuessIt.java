import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int tries = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
            guess = scanner.nextInt();
            tries++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + tries + " tries!");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}