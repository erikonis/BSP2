import java.util.Scanner;
import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Generate random number 1-100
        int secretNumber = rand.nextInt(100) + 1;
        int guess;
        int tries = 0;
        
        System.out.println("Guess the number between 1 and 100!");

        while (true) {
            System.out.print("Your guess: ");
            guess = input.nextInt();
            tries++;
            
            if (guess == secretNumber) {
                break;
            }
            
            System.out.println("Your guess is too " + 
                (guess < secretNumber ? "low" : "high") + "!");
        }
        
        System.out.printf("Correct! The number was %d. You needed %d tries.%n",
                         secretNumber, tries);
        
        input.close();
    }
}