package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] donations = {10, 20, 50, 100, 200, 500};
		String[] win = {"Beer with TAs ", "Your name in ASCII art ", "Public display of your donation on Moodle ", "Uni.lu USB Stick of 128GB ", "Uni.lu Smartphone cover and Keychain 'I love Programming 1' ", "Autograph of your professors and five free lunches at the 'Food House' "};

		int userdonation;
		boolean isintable = false;
		int userdonationindex = -1;

		System.out.println("How much would you like to pledge? Type 10, 20, 50, 100, 200, or 500: ");

		userdonation = scanner.nextInt();

		for (int i=0; i<=5; i++) {

			if (userdonation==donations[i])
			{isintable = true; userdonationindex = i;};

		};

		scanner.close();

		if (isintable) {

			System.out.println("You will receive: \n");

			switch (userdonationindex) { 

				case 0: System.out.println(win[0]); break; 
				case 1: System.out.println(win[0] + "\n" + win[1]); break; 
				case 2: System.out.println(win[0] + "\n" + win[1] + "\n" + win[2]); break; 
				case 3: System.out.println(win[0] + "\n" + win[1] + "\n" + win[2] + "\n" + win[3]); break; 
				case 4: System.out.println(win[0] + "\n" + win[1] + "\n" + win[2] + "\n" + win[3] + "\n" + win[4]); break; 
				case 5: System.out.println(win[0] + "\n" + win[1] + "\n" + win[2] + "\n" + win[3] + "\n" + win[4] + "\n" + win[5]); break; 

			};
				 
		}

		else {System.out.println("Option unavailable. Exiting... ");};
	}
}