package lu.uni.programming1.lab2.ex3;

import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		// Ex3.1 - Put your speedlimit checking code here
		// Hint: We use a "Scanner" as seen in
		// Exercise3 of Lab01 "Reading User Input"
		// to read from standard input
		Scanner scanner = new Scanner(System.in);

		// Reading the road type id from standard input
		int roadTypeId = 0;
		String roadType = "";
		Double speedLimit = 0.0;
		while (roadTypeId != 1 && roadTypeId != 2 && roadTypeId != 3 && roadTypeId != 4) {
			System.out.println("\nPlease type 1 to 4");
			// Asking the user to enter the road type id
			System.out.print("\nPlease enter road type id: ");
			roadTypeId = scanner.nextInt();

			if (roadTypeId == 1) {
				roadType = "Motorway";
				speedLimit = 130.0;
			} else if (roadTypeId == 2) {
				roadType = "Ordinary";
				speedLimit = 90.0;
			} else if (roadTypeId == 3) {
				roadType = "Town";
				speedLimit = 50.0;
			} else if (roadTypeId == 4) {
				roadType = "Calmed";
				speedLimit = 30.0;
			} else {
				System.out.print("Unknown road type");
			}
		}
		// TO DO: Extend the code here to read the current speed etc.
		// Asking the user to enter the current speed
		if (speedLimit != 0.0) {

			System.out.print("Please enter current speed ");
			Double currentSpeed = scanner.nextDouble();
			if (currentSpeed > speedLimit) {
				Double excessSpeed = currentSpeed - speedLimit;
				System.out.print("Too fast for " + roadType + " road. " + excessSpeed + " over the limit! ");
				Double percentageExcess = (excessSpeed * 100.0) / speedLimit;
				/* System.out.println(percentageExcess); */
				int fine = 0;
				if (percentageExcess < 5) {
					fine = 0;
				} else if (percentageExcess < 30) {
					fine = 50;
				} else if (percentageExcess < 50) {
					fine = 150;
				} else {
					fine = 500;
				}
				System.out.println("You will have to pay €" + fine);
			} else {
				System.out.print("Speed OK for " + roadType + " road");
			}

		}
		// Hint: You can reuse the existing Scanner to
		// read the speed as well
		// Hint: Scanner has a method called nextDouble()
		// to read double valued if you wish to do so

		// TO DO: Ex3.2 - Extend your code to calculate and print the fine

		// Streams should be closed - More details in a later class
		scanner.close();
	}
}