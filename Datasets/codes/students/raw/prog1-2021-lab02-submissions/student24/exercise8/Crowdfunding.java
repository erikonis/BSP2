package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		boolean error = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the amount of money you would like to donate :");
		int donation = scanner.nextInt();
		switch (donation){
			case 500:
			error = false;
			System.out.println("You're rewarded with : Autograph of your professors !");
			System.out.println("You're rewarded with : Five free lunchesat the 'Food House' !");
			case 200:
			error = false;
			System.out.println("You're rewarded with : Uni.lu smartphone cover !");
			System.out.println("You're rewarded with : Keychain 'I love programming 1' !");
			case 100:
			error = false;
			System.out.println("You're rewarded with : Uni.lu USB Stick of 128GB !");
			case 50:
			error = false;
			System.out.println("You're rewarded with : Public display of your donation on Moodle !");
			case 20:
			error = false;
			System.out.println("You're rewarded with : Your name in ASCII art !");
			case 10:
			error = false;
			System.out.println("You're rewarded with : Beer with TAs !");
			default : 
			if(error){
				System.out.println("Invalid donation amount !!");
			}
		}
		scanner.close();
	}
}