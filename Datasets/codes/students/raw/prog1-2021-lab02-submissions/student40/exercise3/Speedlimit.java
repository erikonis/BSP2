package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 * Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {

		// Ex3.1 - Put your speedlimit checking code here
		// Hint: We use a "Scanner" as seen in
		// Exercise3 of Lab01 "Reading User Input"
		// to read from standard input
		Scanner scanner = new Scanner(System.in);
		// Asking the user to enter the road type id
		System.out.print("Please enter your road type id: 1.Motorway 2.Oridinary 3.Town 4.Calmed: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();

		String roadType = "";
		Double speedLimit = 0.0;

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
			System.out.print("This is Unknown road type");
		}
		// Asking the user to enter the current speed
		if (speedLimit != 0.0) {

			System.out.print("Please enter your current speed ");
			Double currentSpeed = scanner.nextDouble();
			if (currentSpeed > speedLimit) {
				Double excessSpeed = currentSpeed - speedLimit;
				System.out.print("It is too fast for " + roadType + " road. " + excessSpeed
						+ " You were drove over the limit! ");
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
				System.out.println("You will have to pay a fine of  €" + fine);
			} else {
				System.out.print("Your speed is OK for " + roadType + " road");
			}

		}

		// TODO: Extend the code here to read the current speed etc.
		// Hint: You can reuse the existing Scanner to
		// read the speed as well
		// Hint: Scanner has a method called nextDouble()
		// to read double valued if you wish to do so

		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		// Streams should be closed - More details in a later class
		scanner.close();
	}
}