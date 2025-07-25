package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {
	
	int donation;

	public void reward() {
		System.out.printf("For having donated €%d, you are rewarded the following:\n", donation);
		switch(donation) {
		case 500:
			System.out.println("- Autograph of your professors\n- Five free lunches at the \"Food House\"");
		case 200:
			System.out.println("- Uni.lu Smartphone cover\n- Keychain \"I love Programming 1\"");
		case 100:
			System.out.println("- Uni.lu USB Stick of 128GB");
		case 50:
			System.out.println("- Public display of your donation on Moodle");
		case 20:
			System.out.println("- Your name in ASCII art");
		case 10:
			System.out.println("- Beer with TAs");
			break;
		default:
			System.err.println("Donation amount not valid.");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Crowdfunding cf = new Crowdfunding();
		System.out.print("Enter donation amount: ");
		cf.donation = scanner.nextInt();
		cf.reward();

		scanner.close();
	}
}