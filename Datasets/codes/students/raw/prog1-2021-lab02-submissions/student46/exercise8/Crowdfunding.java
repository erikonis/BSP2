package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String rewards;
		System.out.println("The available amounts are 10, 20, 50, 100, 200 and 500");
		System.out.println("enter the amount of your pledge");
		int pledge = scanner.nextInt();
		switch (pledge) {
			case 10:
			rewards = "beer and TAs";
				System.out.println("your rewards are a "+rewards);
				break;
			case 20:
				rewards = "beer and TAs, Your name in ASCII art";
				System.out.println("your rewards are a "+rewards);
				break;
			case 50:
				rewards = "beer and TAs, Your name in ASCII art, Public display of your donation on Moodle";
				System.out.println("your rewards are a "+rewards);
				break;
			case 100:
				rewards = "beer and TAs, Your name in ASCII art, Public display of your donation on Moodle, Uni.lu USB Stick of 128GB";
				System.out.println("your rewards are a "+rewards);
				break;
			case 200:
				rewards = "beer and TAs, Your name in ASCII art, Public display of your donation on Moodle, Uni.lu USB Stick of 128GB, Uni.lu Smartphone cover, a Keychain I love Programming 1";
				System.out.println("your rewards are a "+rewards);
				break;
			case 500:
				rewards = "beer and TAs, Your name in ASCII art, Public display of your donation on Moodle, Uni.lu USB Stick of 128GB, Uni.lu Smartphone cover, a Keychain I love Programming 1, an Autograph of your professors and Five free lunches at the Food house";
				System.out.println("your rewards are a "+rewards);
				break;
			default:
				System.out.println("this donation is not allowed");
				break;
		}
		scanner.close();
	}
}