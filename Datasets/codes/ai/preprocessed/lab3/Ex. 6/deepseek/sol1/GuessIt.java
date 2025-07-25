public package exercise6;

import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int tries = 0;

        System.out.println("Guess a number between 1 and 100:");

        do {
            guess = scanner.nextInt();
            tries++;
            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            }
        } while (guess != number);

        System.out.println("Correct! You needed " + tries + " tries.");
    }
} {

}