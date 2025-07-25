package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		
		System.out.print("Enter amount of money (10,20,50,100,200,500): ");

		int amount = scanner.nextInt();

		switch (amount) {
			case 10:
				System.out.println("Beer with TAs");
				break;
			case 20:
				System.out.println("Beer with TAs \nYour name in ASCII art");
				break;
			case 50:
				System.out.println("Beer with TAs \nYour name in ASCII art \nPublic display of your donation on Moodle");
				break;
			case 100:
				System.out.println("Beer with TAs \nYour name in ASCII art \nPublic display of your donation on Moodle \nUni.lu USB Stick of 128GB");
				break;
			case 200:
				System.out.println("Beer with TAs \nYour name in ASCII art \nPublic display of your donation on Moodle \nUni.lu USB Stick of 128GB \nUni.lu Smartphone cover \nKeychain \"I love Programming 1\" \nAutograph of your professors \nFive free lunches at the \"Food house\"");
				break;
			case 500:
				System.out.println("Beer with TAs \nYour name in ASCII art \nPublic display of your donation on Moodle \nUni.lu USB Stick of 128GB \nUni.lu Smartphone cover \nKeychain \"I love Programming 1\"");
				break;
			default:
			System.err.println(amount +" € donations are not allowed!");
				break;
		}
		scanner.close();
	}
}