import java.util.Scanner;
import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int number = random.nextInt(100) + 1;
        int tries = 0;
        int guess = -1;

        do {
            System.out.print("Guess the number that was choosen: ");
            guess = scanner.nextInt();
            tries += 1;

            //tells if the guess is higher , equals or lower than the value given by the user
            if (guess == number) {
                System.out.println("You guessed the right number!");
            } else if (number < guess) {
                System.out.println("The right number is lower than the one you chose, try again!");
            } else {
                System.out.println("The right number is higher than the one you chose, try again!");
            }

        } while (guess != number);

        System.out.print("You succeeded after " + tries + " tries!");

        scanner.close();
    }
}
