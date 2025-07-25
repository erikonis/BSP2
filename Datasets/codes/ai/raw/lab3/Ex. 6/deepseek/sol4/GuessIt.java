import java.util.Scanner;
import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("I've picked a number between 1 and 100. Can you guess it?");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try a lower number.");
            }
        } while (guess != secretNumber);
        
        System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " tries.");
        
        scanner.close();
    }
}