package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;


public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the donation amount. You may choose between 10, 20, 50, 100, 200 or 500:");
		int donationAmount = scanner.nextInt();

		String rewards ="";

		switch (donationAmount) 

		{case 500:
			rewards += "Autograph of your professors \nFive free lunches at the food house";
			
		case 200:
			rewards +="\nUni.lu smartphone cover \nKeychain I love Programming 1";
			
		case 100:
			rewards += "\nUni.lu USB stick of 128 GB.";
			
		case 50 :
			rewards += "\nPublic display of your donation on Moodle.";
			
		case 20:
			rewards +="\nYour name in ASCII art.";
			
		case 10 : 
			rewards += "\nBeer with TAs."; 	
			break;
			
			

		default : 
			System.out.println("Amount not found.");
			
		
		
		
	};
	System.out.println( " These are the rewards for " +donationAmount+ ": " +rewards);
	

		scanner.close();
	}
}