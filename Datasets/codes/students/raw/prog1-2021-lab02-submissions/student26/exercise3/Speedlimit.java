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

		// TODO: Extend the code here to read the current speed etc.
		// Hint: You can reuse the existing Scanner to
		// read the speed as well
		// Hint: Scanner has a method called nextDouble()
		// to read double valued if you wish to do so
		System.out.print("Please enter your speed: ");

		double speed = scanner.nextDouble();
		double excess = 0;

		switch (roadTypeId) {
			case 1:
				if (speed <= 130) {
					System.out.println("Speed OK for motorway road.");
				} else {
					excess = speed - 130;
					System.out.println("Too fast for motorway road. " + excess + " over the limit!");
				}
				break;
			case 2:
				if (speed <= 90) {
					System.out.println("Speed OK for ordinary road.");
				} else {
					excess = speed - 90;
					System.out.println("Too fast for ordinary road. " + excess + " over the limit!");
				}
				break;
			case 3:
				if (speed <= 50) {
					System.out.println("Speed OK for town road.");
				} else {
					excess = speed - 50;
					System.out.println("Too fast for town road. " + excess + " over the limit!");
				}
				break;
			case 4:
				if (speed <= 30) {
					System.out.println("Speed OK for calmed road.");
				} else {
					excess = speed - 30;
					System.out.println("Too fast for calmed road. " + excess + " over the limit!");
				}
				break;
			default:
				System.out.println("Unknown road type: " + roadTypeId);
				break;
		}
		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		if (excess > 0) {
			switch (roadTypeId) {
				case 1:
					if (excess <= 130 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 130 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 130 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;
				case 2:
					if (excess <= 90 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 90 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 90 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;
				case 3:
					if (excess <= 50 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 50 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 50 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;
				case 4:
					if (excess <= 30 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 30 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 30 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;

				default:
					break;
			}
		}

		// Streams should be closed - More details in a later class
		scanner.close();
	}
}
