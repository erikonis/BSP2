package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int hour, minutes, seconds, format, addHour, addMin, addSec;
		String newHour, newMin, newSec, addNewHour, addNewSeconds, addNewMinutes;

		System.out.print("Type '0' for 24h format or type '1' for 12 hour format: ");

		format = Math.min(1, Math.max(0, scanner.nextInt()));
		System.out.print("Please enter hour: ");
		if (format == 0) {
			hour = (scanner.nextInt()) % 24;
		} else {
			hour = (scanner.nextInt()) % 25;
		}
		

		System.out.print("Please enter minutes: ");
		minutes = (scanner.nextInt()) % 60;

		System.out.print("Please enter seconds: ");
		seconds = (scanner.nextInt()) % 60;

		addSec = seconds + 5;
		addMin = minutes;
		addHour = hour;

		if (addSec > 59) {
			++addMin;
			addSec = addSec % 60;
		}
		if (addMin > 59) {
			++addHour;
			addMin %= 60;
		}

		// leading zeroes
		if (hour < 10) {
			newHour = "0" + hour;
		} else {
			newHour = "" + hour;
		}

		if (minutes < 10) {
			newMin = "0" + minutes;
		} else {
			newMin = "" + minutes;
		}

		if (seconds < 10) {
			newSec = "0" + seconds;
		} else {
			newSec = "" + seconds;
		}
		// leading zeroes for advanced time
		if (addHour < 10) {
			addNewHour = "0" + addHour;
		} else {
			addNewHour = "" + addHour;
		}

		if (addMin < 10) {
			addNewMinutes = "0" + addMin;
		} else {
			addNewMinutes = "" + addMin;
		}

		if (addSec < 10) {
			addNewSeconds = "0" + addSec;
		} else {
			addNewSeconds = "" + addSec;
		}

		if (format == 0) {// 24 hour format
			System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec);

			System.out.println("Advanced time: " + addNewHour + ":" + addNewMinutes + ":" + addNewSeconds);
		}

		else {// 12 hour format

			if (hour > 0 && hour < 13) { // this is am
				System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec + "AM");
				if (addHour > 12) {
					addHour -= 12;
					// leading zeroes for advanced time
					if (addHour < 10) {
						addNewHour = "0" + addHour;
					} else {
						addNewHour = "" + addHour;
					}
					System.out
							.println("Advanced time: " + addNewHour + ":" + addNewMinutes + ":" + addNewSeconds + "PM");
				} else {
					System.out
							.println("Advanced time: " + addNewHour + ":" + addNewMinutes + ":" + addNewSeconds + "AM");
				}

			} else {// this is pm
				if (hour >= 13) {
					hour -= 12;
					addHour -= 12;
					// leading zeroes
					if (hour < 10) {
						newHour = "0" + hour;
					} else {
						newHour = "" + hour;
					}

					if (minutes < 10) {
						newMin = "0" + minutes;
					} else {
						newMin = "" + minutes;
					}

					if (seconds < 10) {
						newSec = "0" + seconds;
					} else {
						newSec = "" + seconds;
					}
					// leading zeroes for advanced time
					if (addHour < 10) {
						addNewHour = "0" + addHour;
					} else {
						addNewHour = "" + addHour;
					}

					if (addMin < 10) {
						addNewMinutes = "0" + addMin;
					} else {
						addNewMinutes = "" + addMin;
					}

					if (addSec < 10) {
						addNewSeconds = "0" + addSec;
					} else {
						addNewSeconds = "" + addSec;
					}
				}

				System.out.println("Time: " + newHour + ":" + newMin + ":" + newSec + " PM");

				if (addHour > 12) {
					addHour -= 12;
					// leading zeroes for advanced time
					if (addHour < 10) {
						addNewHour = "0" + addHour;
					} else {
						addNewHour = "" + addHour;
					}
					System.out.println("Advanced time: " + addNewHour + ":" + addNewMinutes + ":" + addNewSeconds + "AM");
				} else {
					System.out.println("Advanced time: " + addNewHour + ":" + addNewMinutes + ":" + addNewSeconds + "PM");
				}

			}
		}

		scanner.close();
	}
}