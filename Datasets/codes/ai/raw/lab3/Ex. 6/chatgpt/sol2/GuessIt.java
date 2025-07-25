import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess, tries = 0;

        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            tries++;
            if (guess < target) System.out.println("Too low!");
            else if (guess > target) System.out.println("Too high!");
        } while (guess != target);

        scanner.close();
        System.out.println("Correct! Attempts: " + tries);
    }
}
