package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		int amount = 0;
		String reward = "";

		System.out.println("Thank you for pledging one of the next amounts in €: 10, 20, 50, 100, 200 or 500.");
		amount = scanner.nextInt();

		switch(amount){
			case 10 : 
				reward = "You won: Beer with TAs";
				break;
			case 20 :
				reward = "You won: Beer with TAs and Your name in ASCII art.";	
				break;
			case 50 :
				reward = "You won: Beer with TAs, Your name in ASCII art and Public display of your donation on Moodle";
				break;
			case 100 :
				reward = "You won: Beer with TAs, Your name in ASCII art, Public display of your donation on Moodle \n and Uni.lu USB Stick of 128GB.";	
				break;
			case 200 :
				reward ="You won: Beer with TAs, Your name in ASCII art, Public display of your donation on Moodle, \n Uni.lu USB Stick of 128GB, Uni.lu Smartphone cover and Keychain 'I love Programming1'.";	
				break;
			case 500 :
				reward = "You won: Beer with TAs, Your name in ASCII art, Public display of your donation on Moodle, \n Uni.lu USB Stick of 128GB, Uni.lu Smartphone cover, Keychain 'I love Programming1', \n Autograph of your Professors and Five free lunches at the 'Food House'.";
				break;
			default :
				reward = +amount+" donations are not allowed.";	
				break;	
		} System.out.println(reward);


		scanner.close();
	}
}