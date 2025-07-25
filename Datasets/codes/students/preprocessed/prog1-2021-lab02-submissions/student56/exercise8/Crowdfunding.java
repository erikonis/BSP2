package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 * Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much do you want to donate(10€,20€,50€,100€,200€ or 500€):");
		int donation = scanner.nextInt();

		switch (donation) {
			case 10:
			case 20:
			case 50:
			case 100:
			case 200:
			case 500:
				System.out.println("Beer with TAs");
				if (donation == 10) {
					break;
				}
				System.out.println("Your name in ASCII art");
				if (donation == 20) {
					break;
				}
				System.out.println("Public display of your donation on Moodle");
				if (donation == 50) {
					break;
				}
				System.out.println("Uni.lu USB Stick of 128GB");
				if (donation == 100) {
					break;
				}
				System.out.println("Uni.lu Smartphone cover");
				System.out.println("Keychain " + "I love Programming 1");
				if (donation == 200) {
					break;
				}
				System.out.println("Autograph of your professors");
				System.out.println("Five free lunches at the Food house");
				if (donation == 500) {
					break;
				}
			default:
				System.out.println(donation + "€ donations are not allowed!");
				break;
		}
		// TODO: put your code here

		scanner.close();
	}
}