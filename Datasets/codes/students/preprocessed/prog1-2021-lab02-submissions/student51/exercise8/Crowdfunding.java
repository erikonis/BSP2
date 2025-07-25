package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int donation = 0;

		System.out.println("Please enter your donation amount : ");
		donation = scanner.nextInt();

		
			switch(donation)
		{
			case 10: System.out.println("Beer with TAs");
					 break;
			case 20: System.out.println("Beer with TAs, \n Your name in ASCII art");
					 break;
			case 50: System.out.println("Beer with TAs, \n Your name in ASCII art, \n Public display of your donation on Moodle");
					 break;
			case 100:System.out.println("Beer with TAs, \n Your name in ASCII art, \n Public display of your donation on Moodle, \n Uni.lu USB Stick of 128GB");
					 break;
			case 200:System.out.println("Beer with TAs, \n Your name in ASCII art, \n Public display of your donation on Moodle, \n Uni.lu USB Stick of 128GB, \n - Uni.lu Smartphone cover, \n Keychain 'I Love Programming 1");
					 break;
			case 500:System.out.println("Beer with TAs, \n Your name in ASCII art, \n Public display of your donation on Moodle, \n Uni.lu USB Stick of 128GB, \n - Uni.lu Smartphone cover, \n Keychain 'I Love Programming 1, \n - Autograph of your professors, \n - Five free lunches at the 'Food house'");
					 break;
			default :System.out.println(donation + " € donations are not allowed!");
		}

		scanner.close();
	}
}