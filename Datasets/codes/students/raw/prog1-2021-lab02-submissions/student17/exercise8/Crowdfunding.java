package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		System.out.print("Enter amount in euro:");
		int amount= scanner.nextInt();

		switch(amount)
		{
			case 10:
				System.out.println("Beer with TAs");
				break;
			case 20:
				System.out.println("Beer with TAs\n" + "Your name in ASCII art");
				break;
			case 50:
				System.out.println("Beer with TAs\n" + "Your name in ASCII art\n" 
										+ "Public display of your donation on Moodle");
				break;
			case 100:
				System.out.println("Beer with TAs\n" + "Your name in ASCII art\n" 
										+ "Public display of your donation on Moodle\n" + "Uni.lu USB Stick of 128GB");
				break;
			case 200:
				System.out.println("Beer with TAs\n" + "Your name in ASCII art\n" 
										+ "Public display of your donation on Moodle\n" + "Uni.lu USB Stick of 128GB\n" 
										+ "Uni.lu Smartphone cover\n" + "Keychain 'I love Programming 1'");
				break;
			case 500:
				System.out.println("Beer with TAs\n" + "Your name in ASCII art\n" 
										+ "Public display of your donation on Moodle\n" + "Uni.lu USB Stick of 128GB\n" 
										+ "Uni.lu Smartphone cover\n" + "Keychain 'I love Programming 1'\n" 
										+ "Autograph of your professors\n" + "Five free lunches at the 'Food house'");
				break;
			default:
				System.out.println(amount + " € donations are not allowed!");
				break;
		}

		scanner.close();
	}
}