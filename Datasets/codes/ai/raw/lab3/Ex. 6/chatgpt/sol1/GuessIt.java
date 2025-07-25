
// Exercise 6: GuessIt.java
import java.util.Random;
import java.util.Scanner;
public class GuessIt {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1, guess, tries = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Guess: ");
            guess = scanner.nextInt();
            tries++;
            System.out.println(guess > target ? "Too high!" : guess < target ? "Too low!" : "Correct!");
        } while (guess != target);
        
        scanner.close();
        System.out.println("Tries: " + tries);
    }
}
