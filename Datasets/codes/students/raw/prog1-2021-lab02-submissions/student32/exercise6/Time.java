package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner

		// 1°
		// gets set to false if a value is not valid
		boolean valid = true;

		int hours = -1;

		// choosing time format
		System.out.print("Do you want to use the 24-hour format?\nPlease answer with 'true' or 'false': ");
		boolean format = scanner.nextBoolean();

		// hours with AM or PM
		if (!format) {
			System.out.println("Enter the amount in hours.\nPlease enter a number in between 1 and 12: ");
			hours = scanner.nextInt();

			// controls if number entered is valid
			if (hours <= 0 || hours >=13) {
				valid = false;
			}
		}

		// hours without AM or PM
		if (format) {
			System.out.println("Enter the amount of hours.\nPlease enter a number in between 0 and 23: ");
			hours = scanner.nextInt();

			if (hours < 0 || hours >= 24) {
				valid = false;
			}
		}

		// minutes
		System.out.println("Enter the amount of minutes.\nPlease enter a number in between 0 and 59: ");
		int minutes = scanner.nextInt();

		if (minutes < 0 || minutes >= 60) {
			valid = false;
		}

		// seconds
		System.out.println("Enter the amount of seconds.\nPlease enter a number in between 0 and 59: ");
		int seconds = scanner.nextInt();

		if (seconds < 0 || seconds >= 60) {
			valid = false;
		}

		// 2°

		// vanity check
		if (valid) {
			System.out.printf("The time you entered is:\n%02d:%02d:%02d\n", hours, minutes, seconds);
		} else {
			System.out.println("The time you entered is not valid");
		}

		// 3°

		seconds += 5;

		if (seconds >= 60) {
			minutes += 1;
			seconds -= 60;
		}

		if (minutes >= 60) {
			hours += 1;
			minutes -= 60;
		}

		if (format) {
			// 24 hours format
			if (hours >= 24) {
				hours -= 24;
			}
		} else {
			// AM PM format
			if (hours >= 13) {
				hours -= 12;
			}
		}

		// 4°

		if (valid) {
			System.out.printf("The time 5 seconds afterwards is:\n%02d:%02d:%02d\n", hours, minutes, seconds);
		}

		scanner.close();
	}
}