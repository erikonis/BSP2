package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		System.out.println("Please enter the pledge amount:");
		int sum = scanner.nextInt();


		System.out.println("The reward(s) for your pledge is/are:");
		switch(sum){
			case 10: System.out.println("Beer with TA's");
			break;
			case 20: System.out.println("Beer with TA's\n" + "Your name in ASCII art");
			break;
			case 50: System.out.println("Beer with TA's\n" + "Your name in ASCII art\n" + "Public display of your donation on Moodle");
			break;
			case 100: System.out.println("Beer with TA's\n" + "Your name in ASCII art\n" + "Public display of your donation on Moodle\n"
			+ "Uni.lu USB Stick of 128GB");
			break;
			case 200: System.out.println("Beer with TA's\n" + "Your name in ASCII art\n" + "Public display of your donation on Moodle\n"
			+ "Uni.lu USB Stick of 128GB\n" + "Uni.lu Smartphone cover\n" + "Keychain 'I love programming'");
			break;
			case 500: System.out.println("Beer with TA's\n" + "Your name in ASCII art\n" + "Public display of your donation on Moodle\n"
			+ "Uni.lu USB Stick of 128GB\n" + "Uni.lu Smartphone cover\n" + "Keychain 'I love programming'\n" + "Autograph of your professors\n" + "Five free lunches at the 'Food house'");
			break;
			default: System.out.println("Nothing. You entered a wrong number");
			
		}

		scanner.close();
	}
}