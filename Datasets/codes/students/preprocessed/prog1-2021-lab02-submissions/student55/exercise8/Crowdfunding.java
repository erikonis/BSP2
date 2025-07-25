package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your donation: ");
		int donation = scanner.nextInt();
		
		switch(donation)
		{ default: System.out.println(donation+" eur donations are not allowed :(");
				break;
				
			case 500:System.out.println("- Autograph of your professors");
			System.out.println("- Five free lunchess at the Food House");
			case 200: System.out.println("- Uni.lu Smartphone cover");
			System.out.println("- Keychain 'I love programming' ");
			case 50: System.out.println("- Public display of your donation on Moodle");
			
			case 20: System.out.println("- Your name in ASCII art");
			case 10: System.out.println("- Beer with TAs");
			System.out.println("^^These all are your amazing rewards^^ :) ");
			
			



		}


		scanner.close();
	}
}