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
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();

		// Extend the code here to read the current speed etc.
		// Hint: You can reuse the existing Scanner to
		// read the speed as well
		// Hint: Scanner has a method called nextDouble()
		// to read double valued if you wish to do so
		System.out.print("Please enter the speed you're driving: ");
		int currentSpeed = scanner.nextInt();

		switch (roadTypeId) {
			case 1:
				if (currentSpeed > 130) {
					System.out.println(
							"Too fast for " + roadTypeId + " road." + (currentSpeed - 130) + " over the limit!.");
					System.out.println(calculateFine(130, currentSpeed));
				} else {
					System.out.println("Speed OK for " + roadTypeId + " road.");
				}
				break;

			case 2:
				if (currentSpeed > 90) {
					System.out.println(
							"Too fast for " + roadTypeId + " road." + (currentSpeed - 90) + " over the limit!.");
					System.out.println(calculateFine(90, currentSpeed));
				} else {
					System.out.println("Speed OK for " + roadTypeId + " road.");
				}
				break;

			case 3:
				if (currentSpeed > 50) {
					System.out.println(
							"Too fast for " + roadTypeId + " road." + (currentSpeed - 50) + " over the limit!.");
					System.out.println(calculateFine(50, currentSpeed));
				} else {
					System.out.println("Speed OK for " + roadTypeId + " road.");
				}
				break;

			case 4:
				if (currentSpeed > 30) {
					System.out.println(
							"Too fast for " + roadTypeId + " road." + (currentSpeed - 30) + " over the limit!.");
					System.out.println(calculateFine(30, currentSpeed));
				} else {
					System.out.println("Speed OK for " + roadTypeId + " road.");
				}
				break;
			default:
				System.out.println("Unknown road type: " + roadTypeId);
				break;
		}
		// Ex3.2 - Extend your code to calculate and print the fine

		// Streams should be closed - More details in a later class
		scanner.close();
	}

	private static String calculateFine(int maxSpeed, int currentSpeed) {
		double checkSpeed = ((double) currentSpeed - maxSpeed) / maxSpeed * 100;
		if (checkSpeed <= 5) {
			return "Your fine is 0€.";
		} else if (checkSpeed <= 30) {
			return "Your fine is 50€.";
		} else if (checkSpeed <= 50) {
			return "Your fine is 150€.";
		} else {
			return "Your fine is 500€.";
		}
	}
}