package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		

		// Ex3.1 - Put your speedlimit checking code here
		//         	Hint: We use a "Scanner" as seen in
		//			Exercise3 of Lab01 "Reading User Input"
		// 	        to read from standard input
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");


		// Reading the road type id from standard input
		 int roadTypeId = scanner.nextInt();

		System.out.print("Please enter your travelling speed (in km/h): ");

		double speed = scanner.nextDouble();
		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		
		 int maxspeed = 0;
		
		if (roadTypeId == 1) {
			maxspeed = 130;
		} else if (roadTypeId == 2) {
			maxspeed = 90;
		} else if (roadTypeId == 3) {
			maxspeed = 50;
		} else if (roadTypeId == 4) {
			maxspeed = 30;
		}

		if (speed > maxspeed) {
			System.out.print("You are going too fast! Slow down!");
		}
		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}