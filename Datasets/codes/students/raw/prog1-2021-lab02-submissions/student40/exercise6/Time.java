package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		// Hint: you can read whether we want to
		// use AM mode as a boolean using the
		// nextBoolean() method of Scanner
		int morningOrAfternoon = -1;
		int hours = 0;
		int minutes = -1;
		int seconds = -1;
		int twelveOrTwentyfour = -1;
		while (twelveOrTwentyfour != 0 && twelveOrTwentyfour != 1) {
			System.out.print("12 hour clock = 0, 24 hour clock = 1 :");
			twelveOrTwentyfour = scanner.nextInt();
		}
		Boolean correctHourEntered = false;

		while (!correctHourEntered) {
			if (twelveOrTwentyfour == 0) {
				while (morningOrAfternoon != 0 && morningOrAfternoon != 1) {
					System.out.print("Morning = 0 afternoon = 1 :");
					morningOrAfternoon = scanner.nextInt();
				}
			}
			System.out.print("Enter the hour :");
			hours = scanner.nextInt();
			if (twelveOrTwentyfour == 0) {
				if (hours >= 0 && hours <= 11) {
					correctHourEntered = true;
				}
			} else {
				if (hours >= 0 && hours <= 23) {
					correctHourEntered = true;
				}
			}
		}
		while (minutes < 0 || minutes > 59) {
			System.out.print("Enter the minutes :");
			minutes = scanner.nextInt();
		}
		while (seconds < 0 || seconds > 59) {
			System.out.print("Enter the seconds :");
			seconds = scanner.nextInt();
		}
		// Display the time
		if (hours < 10) {
			System.out.print("0");
		}
		System.out.print(hours);
		System.out.print(":");
		if (minutes < 10) {
			System.out.print("0");
		}
		System.out.print(minutes);
		System.out.print(":");
		if (seconds < 10) {
			System.out.print("0");
		}
		System.out.print(seconds);
		if (twelveOrTwentyfour == 0) {
			if (morningOrAfternoon == 0) {
				System.out.println(" AM");
			} else {
				System.out.println(" PM");
			}
		}
		// Add 5 seconds
		seconds = seconds + 5;
		if (seconds >= 60) {
			minutes++;
			seconds = seconds - 60;
		}
		if (minutes >= 60) {
			hours++;
			minutes = minutes - 60;
		}
		if (twelveOrTwentyfour == 0) {
			if (hours == 12) {
				hours = 0;
				/* morningOrAfternoon = (morningOrAfternoon + 1) % 2; */
				if (morningOrAfternoon == 0) {
					morningOrAfternoon = 1;
				} else {
					morningOrAfternoon = 0;
				}
			}
		} else {
			if (hours == 24) {
				hours = 0;
			}
		}
		System.out.print("The new time with 5 seconds added is :");
		// Display the time after 5 seconds were added
		if (hours < 10) {
			System.out.print("0");
		}
		System.out.print(hours);
		System.out.print(":");
		if (minutes < 10) {
			System.out.print("0");
		}
		System.out.print(minutes);
		System.out.print(":");
		if (seconds < 10) {
			System.out.print("0");
		}
		System.out.print(seconds);
		if (twelveOrTwentyfour == 0) {
			if (morningOrAfternoon == 0) {
				System.out.println(" AM ");
			} else {
				System.out.println(" PM ");
			}
		}

		scanner.close();
	}
}