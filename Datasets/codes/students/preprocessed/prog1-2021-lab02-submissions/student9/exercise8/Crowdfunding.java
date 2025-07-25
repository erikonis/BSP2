package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 * Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here

		System.out.print("The available amounts are 10€, 20€, 50€, 100€, 200€, 500€:");
		int amount = scanner.nextInt();
		String rewards = "";
		switch (amount) {
			case 500:
				rewards += "\nAutograph of your professors– \nFive free lunches at the Food house";

			case 200:
				rewards += "\nUni.lu Smartphone cover– \nKeychain I love Programming 1";

			case 100:
				rewards += "\nUni.lu USB Stick of 128GB";

			case 50:
				rewards += "\nPublic display of your donation on Moodle";

			case 20:
				rewards += "\nYour name in ASCII art";

			case 10:
				rewards += "\nBeer with TAs";
				break;
			default:
				rewards += "\n10€, 20€, 50€, 100€, 200€, 500€ are allowed";
				break;
		}
		System.out.println(rewards);

		scanner.close();
	}
}