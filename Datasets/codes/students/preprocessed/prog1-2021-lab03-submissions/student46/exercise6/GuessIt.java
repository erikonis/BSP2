import java.util.Random;
import java.util.Scanner;

public class GuessIt {

	public static void main(String[] args) {
		Random generator = new Random(System.currentTimeMillis());
		Scanner scanner = new Scanner(System.in);

		int secretNumber = generator.nextInt(100) + 1;
		int trials = 0;
		int guess;

		do {
			trials++;
			System.out.print("Guess the secret number: ");
			guess = scanner.nextInt();

			if (guess < 1 || guess > 100) {
				System.out.println("The secret number is comprised between 1 and 100.");
			} else if (guess < secretNumber) {
				System.out.println("The secret number is greater.");
			} else if (guess > secretNumber) {
				System.out.println("The secret number is less.");
			} else {
				System.out.println("You found it, the secret number is " + secretNumber + ".");
			}
		} while (guess != secretNumber);

		System.out.println("You needed " + trials + " trials.");

		scanner.close();
	}
}