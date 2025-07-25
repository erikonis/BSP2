import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Random rnd = new Random();
        int target = rnd.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int attempt;
        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("Number guessing game! Try to guess my number between 1 and 100.");

        while (!correctGuess) {
            System.out.print("Your guess: ");
            if (input.hasNextInt()) {
                attempt = input.nextInt();
                attempts++;

                if (attempt < target) {
                    System.out.println("Too small!");
                } else if (attempt > target) {
                    System.out.println("Too big!");
                } else {
                    System.out.println("You got it! The number was " + target + " and you guessed it in " + attempts + " tries.");
                    correctGuess = true;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Consume the invalid input
            }
        }
        input.close();
    }
}