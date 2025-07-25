package lab03.Others.deepseek;

public package exercise6;

import java.util.Random;
import java.util.Scanner;

public class GuessItWithMethod {
    public static void main(String[] args) {
        int number = generateRandomNumber();
        int tries = guessNumber(number);
        System.out.println("Correct! You needed " + tries + " tries.");
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static int guessNumber(int number) {
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

        return tries;
    }
} {
    
}
