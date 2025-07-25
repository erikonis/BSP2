import java.util.Random;
import java.util.Scanner;

public class GuessItBinary {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int low = 1, high = 100;

        do {
            guess = (low + high) / 2;
            attempts++;
            System.out.println("Guess: " + guess);
            if (guess < numberToGuess) {
                System.out.println("Too low!");
                low = guess + 1;
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
                high = guess - 1;
            }
        } while (guess != numberToGuess);

        System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
    }
}