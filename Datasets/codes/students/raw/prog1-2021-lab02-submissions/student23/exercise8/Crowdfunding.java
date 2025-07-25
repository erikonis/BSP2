package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		// TODO: put your code here
		System.out.println("Enter how much you would like to donate (10, 20, 50, 100, 200 or 500)");
		int amount = scanner.nextInt();

		String msg;
		String header = "With a %d€ donation, you will get the followig rewards :\n";

		switch (amount){
			case 10: {msg = header + "- Beer with TAs"; break;}

			case 20 : {msg = header + "- Your name in ASCII art"; break;}

			case 50: {msg = header + "- Public display of your donation on Moodle"; break;}

			case 100: {msg = header + "- Uni.lu USB Stick of 128GB"; break;}

			case 200: {msg = header + "- Uni.lu Smartphone cover\n- Keychain \"I love Programming 1\""; break;}

			case 500: {msg = header + "- Autograph of your professors\n- Five free lunches at the \"Food house\""; break;}

			default : {msg = "%d€ donations are not allowed !"; break;}
		}

		System.out.format(msg, amount);

		scanner.close();
	}
}