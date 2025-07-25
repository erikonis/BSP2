package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int hours, minutes, seconds, format;

		System.out.print("Please choose a format 12hour or 24hour: ");
		format = scanner.nextInt();

		System.out.print("Enter the hours: ");
		hours = scanner.nextInt();

		System.out.print("Enter the minutes: ");
		minutes = scanner.nextInt();

		System.out.print("Enter the seconds: ");
		seconds = scanner.nextInt();

		seconds = seconds + 5;
		if (format == 12) {

			if (seconds > 59) {
				minutes++;
				seconds -= 60;
			}

			if (minutes > 59 || minutes < 0) {
				hours++;
				minutes -= 60;
			}
			if (hours > 12) {
				hours -= 12;
			}

			System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
		}

		else if (format == 24) {

			if (seconds > 59) {
				minutes++;
				seconds -= 60;
			}
			if (minutes > 59 || minutes < 0) {
				hours++;
				minutes -= 60;
			}
			if (hours > 23) {
				hours -= 24;
			}

			System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
		}

		scanner.close();
	}
}