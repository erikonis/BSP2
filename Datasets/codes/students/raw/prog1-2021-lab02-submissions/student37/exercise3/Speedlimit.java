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
		System.out.println("Please enter the drivers traveling speed: ");
		int driversSpeed = scanner.nextInt();
		int excess = 0;
		if(roadTypeId == 1) {
			if(driversSpeed > 130) {
				excess = driversSpeed - 130;
				System.out.println("Too fast for motorway road. " + excess + " over the limit!");
			}else { 
				System.out.println("Speed OK for motorway road.");
			}
		}else if (roadTypeId == 2) {
			if(driversSpeed > 90) {
				excess = driversSpeed - 90;
				System.out.println("Too fast for ordinary road. " + excess + " over the limit!");
			}else {
				System.out.println("Speed OK for ordinary road.");
			}
		}else if (roadTypeId == 3) {
			if(driversSpeed > 50) {
				excess = driversSpeed - 50;
				System.out.println("Too fast for town road. " + excess + " over the limit!");
			}else {
				System.out.println("Speed OK for town road.");
			}
		}else if (roadTypeId == 4) {
			if (driversSpeed > 30) {
				excess = driversSpeed - 30;
				System.out.println("Too fast for calmed road. " + excess + " over the limit!");
			}else {
				System.out.println("Speed OK for calmed road.");
			}
		}else {
			System.out.println("Unknown road type: " + roadTypeId);
		}

		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		if(excess <= 5) 
			System.out.println("Excess range between 0-5 your fine is 0€.");
		if (excess >= 6 && excess <= 30) 
				System.out.println("Excess range between 5-30 your fine is 50€.");
		if (excess >= 31 && excess <= 50) 
				System.out.println("Excess range between 30-50 your fine is 150€.");
		if (excess >= 51) 
				System.out.println("Excess range > 50 your fine is 500€.");
		
	
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}