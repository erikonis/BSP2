package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 * Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Please choose an amount: [10,20,50,100,200,500]:");
		int amount = scanner.nextInt();
		switch (amount) {
			case 500:
				System.out.println("Autograph of your professors & Five free lunches at the Food house.");

			case 200:
				System.out.println("Uni.lu Smartphone cover & Keychain I love Programming 1.");

			case 100:
				System.out.println("Uni.lu USB Stick of 128GB.");

			case 50:
				System.out.println("Public display of your donation on Moodle.");

			case 20:
				System.out.println("Your name in ASCII art.");

			case 10:
				System.out.println("Beer with TAs.");
				break;
			default:
				System.out.println("Invalid input, please select another amount");
				break;
		}
		scanner.close();
	}
}