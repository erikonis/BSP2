package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amounts:");
		int amounts = scanner.nextInt();
		switch(amounts) {
			case 10:
				System.out.println("Beer with TAs");
				break;
			case 20:
				System.out.println("Beer with TAs");
				System.out.println("Your name in ASCII art");
				break;
			case 50:
				System.out.println("Beer with TAs");
				System.out.println("Your name in ASCII art");
				System.out.println("Public display f your donation on Moodle");
				break;
			case 100:
				System.out.println("Beer with TAs");
				System.out.println("Your name in ASCII art");
				System.out.println("Public display f your donation on Moodle");
				System.out.println("Uni.lu USB Stick of 128GB");
				break;
			case 200:
				System.out.println("Beer with TAs");
				System.out.println("Your name in ASCII art");
				System.out.println("Public display f your donation on Moodle");
				System.out.println("Uni.lu USB Stick of 128GB");
				System.out.println("Uni.lu Smartphone cover");
				System.out.println("Keychain I love Programming 1");
				break;
			case 500:
				System.out.println("Beer with TAs");
				System.out.println("Your name in ASCII art");
				System.out.println("Public display f your donation on Moodle");
				System.out.println("Uni.lu USB Stick of 128GB");
				System.out.println("Uni.lu Smartphone cover");
				System.out.println("Keychain I love Programming 1");
				System.out.println("Autograph of your professors");
				System.out.println("Five free lunches at the Food house");
				break;
			default:
				System.out.print("ERROR: Unknown amount");
		}

		scanner.close();
	}
}