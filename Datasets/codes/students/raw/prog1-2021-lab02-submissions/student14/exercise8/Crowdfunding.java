package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TO DO: put your code here
		System.out.print("How much 'Valid options are 10€, 20€, 50€, 100€, 200€, 500€':");
		int money = scanner.nextInt();
		String rewards = "";
		switch (money) {
			case 500:
				rewards += "\nAutograph of your professors– \nFive free lunches at the Food house";
				/* break; */
			case 200:
				rewards += "\nUni.lu Smartphone cover– \nKeychain I love Programming 1";
				/* break; */
			case 100:
				rewards += "\nUni.lu USB Stick of 128GB";
				/* break; */
			case 50:
				rewards += "\nPublic display of your donation on Moodle";
				/* break; */
			case 20:
				rewards += "\nYour name in ASCII art";
				/* break; */
			case 10:
				rewards += "\nBeer with TAs";
				break;
			default:
				rewards += "\nInvalid amount";
				break;
		}
		System.out.println(rewards);

		scanner.close();
	}
}