package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("your donation amount: ");
		float amount = scanner.nextFloat();

		int reward = 0;

		if (amount >= 10 && amount < 20){
			reward = 1;
		} else if (amount >= 20 && amount < 50){
			reward = 2;
		} else if (amount >= 50 && amount < 100){
			reward = 3;
		} else if (amount >= 100 && amount < 200){
			reward = 4;
		} else if (amount >= 200 && amount < 500){
			reward = 5;
		} else if (amount >= 500){
			reward = 6;
		}

		if (reward < 0){
			System.out.println("your thank you reward");
		}

		switch (reward){
			case 6:
			System.out.print("\nAutograph of your professors\nFive free lunches at the \"Food house\"");
			case 5:
			System.out.print("\nUni.lu Smartphone cover\nKeychain \"I love Programming 1\"");
			case 4:
			System.out.println("Uni.lu USB Stick of 128GB");
			case 3:
			System.out.println("Public display of your donation on Moodle");
			case 2:
			System.out.println("Your name in ASCII art");
			case 1:
			System.out.println("Beer with TAs");
			break;
		}

		scanner.close();
	}
}