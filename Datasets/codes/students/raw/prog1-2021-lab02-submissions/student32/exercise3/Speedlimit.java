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

		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so

		//defining Road Type and Speedlimit variables
		String RoadType = "";
		int speedlimit = 0;
		boolean speeding = false;


		// Assigning Road Type and Speedlimit to Type id
		if (roadTypeId == 1) {
			RoadType = "motorway";
			speedlimit = 130;
		}

		if (roadTypeId == 2) {
			RoadType = "ordinary";
			speedlimit = 90;
		}

		if (roadTypeId == 3) {
			RoadType = "town";
			speedlimit = 50;
		}

		if (roadTypeId == 4) {
			RoadType = "calmed";
			speedlimit = 30;
		}

		// Asking the user to enter the current speed
		System.out.print("Please enter the current speed: ");

		// Reading the current speed
		double currentspeed = scanner.nextDouble();

		// Checking if the driver is over the speedlimit

		if (1 <= roadTypeId && roadTypeId <= 4) {

			if (currentspeed <= speedlimit) {
				System.out.println("Speed OK for " + RoadType + " road.");
			} else {
				System.out.println("Too fast for " + RoadType + " road. " + (currentspeed - speedlimit) + " over the limit!");
				speeding = true;
			}

		} else {
			System.out.println("Unknown road type: " + roadTypeId);
		}

		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		
		int fine;

		// Checking the range of the speed excess if there is any
		
		if (speeding == true) {
			// choosing which fine gets applied
			if (currentspeed <= speedlimit + speedlimit * 0.05) {
				fine = 0;
			}
			else if (currentspeed <= speedlimit + speedlimit * 0.3) {
				fine = 50;
			}
			else if (currentspeed <= speedlimit + speedlimit * 0.5) {
				fine = 150;
			}
			else {
				fine = 500;
			}
			// Outputting the fine
			System.out.println("The fine you could receive would be a fine of " + fine + "€.");
		}
		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}