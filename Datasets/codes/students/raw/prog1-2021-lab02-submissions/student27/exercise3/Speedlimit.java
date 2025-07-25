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

		System.out.print("Please enter your speed: ");

		double speed = scanner.nextDouble();

		double excess;

		double excessRange = 0;

		boolean fine = false;
		int fineAmount = 0;


		if (roadTypeId == 1) {
			if (speed > 130) {
				excess = speed-130;
				System.out.println("Too fast for motorway. " + excess + " over the limit!");
				excessRange = 100-(130/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for motorway");
			}
		} else if (roadTypeId == 2) {
			if (speed > 90) {
				excess = speed-90;
				System.out.println("Too fast for ordinary road. " + excess + " over the limit!");
				excessRange = 100-(90/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for ordinary road");
			}
		} else if (roadTypeId == 3){
			if (speed > 50) {
				excess = speed-50;
				System.out.println("Too fast for town. " + excess + " over the limit!");
				excessRange = 100-(50/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for town");
			}
		} else if (roadTypeId == 4) {
			if (speed > 30) {
				excess = speed-30;
				System.out.println("Too fast for calmed road. " + excess + " over the limit!");
				excessRange = 100-(30/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for calmed road");
			}
		} else {
			System.out.println("Unknown road type: " + roadTypeId);
		}

		if (fine) {
			if (excessRange <= 5) {
				fineAmount = 0;
			} else if (excessRange > 5 && excessRange <= 30) {
				fineAmount = 50;
			} else if (excessRange > 30 && excessRange <= 50) {
				fineAmount = 150;
			} else {
				fineAmount = 500;
			}
			System.out.println("Your fine is : " + fineAmount + " €");
		}


		// TODO: Ex3.2 - Extend your code to calculate and print the fine




		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}