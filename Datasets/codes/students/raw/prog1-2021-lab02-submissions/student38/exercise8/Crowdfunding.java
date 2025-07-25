package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);



		String g, h, i, j, k, l;

		g = "Beers with TAs";
		h = ", Your name in ASCII art";
		i = ", Public display of your donation on Moodle";
		j = ", Uni.lu USB Stick of 128GB";
		k = ", Uni.lu Smartphone cover, Keychain 'I love Programming 1'";
		l = ", Autograph of your professors, Five free lunches at the 'Food house'";


		System.out.print("Please enter your donation amount (Euros): ");
		int donation = scanner.nextInt();

		switch (donation ){
			case  10 :
				System.out.print("Your reward is: " + g); 
				break;
			case 20 :
				System.out.print("Your rewards are: " + g + h); 
				break;
			case 50 :
				System.out.print("Your rewards are: " + g + h + i);
				break;
			case 100 :
				System.out.print("Your rewards are: " + g + h + i + j);
				break;
			case 200 :
				System.out.print("Your rewards are: " + g + h + i + j + k);
				break;
			case 500 :
			 	System.out.print("Your rewards are: " + g + h + i + j + k + l);
				 break;
			default:
				System.out.println( donation +" Euros donations are not allowed!");
				break;
		}

		scanner.close();
	}
}