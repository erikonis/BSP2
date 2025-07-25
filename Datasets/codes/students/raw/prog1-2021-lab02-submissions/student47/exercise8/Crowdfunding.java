package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter : " );
		System.out.println("10€" + "\n" + "20€" + "\n" + "50€" + "\n" + "100€" + "\n" + "200€" + "\n" + "500€");

		int donation = scanner.nextInt();

		String reward1 = "Your rewards are:" + "\n" + "Beer with TAs";
		String reward2 = reward1 + "\n" + "Your name in ASCII art";
		String reward3 = reward2 + "\n" + "Public display of your donation on Moodle";
		String reward4 = reward3 + "\n" + "Uni.lu USB Stick of 128GB";
		String reward5 = reward4 + "\n" + "Uni.lu Smartphone cover" + "\n" + "Keychain 'I love Programming 1'";
		String reward6 = reward5 + "\n" + "Autograph of your professors" + "\n" + "Five free lunches at the 'Food house'";

		switch (donation) {
			case 10: System.out.println(reward1);
			break;
			case 20: System.out.println(reward2);
			break;
			case 50: System.out.println(reward3);
			break;
			case 100: System.out.println(reward4);
			break;
			case 200: System.out.println(reward5);
			break;
			case 500: System.out.println(reward6);
			break;
			default: System.out.println(donation + "€ donations not allowed!");
			
		}

		scanner.close();
	}
}