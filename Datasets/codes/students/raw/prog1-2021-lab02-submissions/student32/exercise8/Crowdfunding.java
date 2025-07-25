package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		System.out.println("which amount of money do you want to pledge?\nYou could pledge 10€, 20€, 50€, 100€, 200€ or 500€.");
		int tier = scanner.nextInt();

		System.out.println("The rewards available at this tier are: ");

		switch (tier) {
			case 500:
				System.out.println("Autographs of your professors!\nFree lunches at the \"Food house\"!");
			case 200:
				System.out.println("A Uni.lu Smartphone cover!\nA Keychain \"I love Programming 1\"!");
			case 100:
				System.out.println("A Uni.lu USB Stick of 128GB!");
			case 50:
				System.out.println("Public display of your donation on Moodle!");
			case 20:
				System.out.println("Your name in ASCII art!");
			case 10:
				System.out.println("A Beer with TAs!");
				break;
			default:
				System.out.println("Pledging " + tier + "€ is not available");
				break;
		}


		scanner.close();
	}
}