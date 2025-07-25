package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int AmOrPm = -1;
		int hour = 0;

		int min = -1;
		int sec = -1;
		int twelveOrTwentyfour = -1;
		while (twelveOrTwentyfour != 0 && twelveOrTwentyfour != 1) {
			System.out.print("12 hour  clock = 0, 24 hour clock = 1 :");
			twelveOrTwentyfour = scanner.nextInt();
		}
		Boolean correctHourEntered = false;

		while (!correctHourEntered) {
			if (twelveOrTwentyfour == 0) {
				while (AmOrPm != 0 && AmOrPm != 1) {
					System.out.print("Morning =  0 afternoon = 1 :");
					AmOrPm = scanner.nextInt();
				}
			}
			System.out.print("Enter the hour :");
			hour = scanner.nextInt();
			if (twelveOrTwentyfour == 0) {
				if (hour >= 0 && hour <= 11) {
					correctHourEntered = true;
				}
			} else {
				if (hour >= 0 && hour <= 23) {
					correctHourEntered = true;
				}
			}
		}
		while (min < 0 || min > 59) {
			System.out.print("Enter the  min :");
			min = scanner.nextInt();
		}
		while (sec < 0 || sec > 59) {
			System.out.print("Enter the  sec :");
			sec = scanner.nextInt();
		}
		// Display the time
		if (hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour);
		System.out.print(":");
		if (min < 10) {
			System.out.print("0");
		}
		System.out.print(min);
		System.out.print(":");
		if (sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec);
		if (twelveOrTwentyfour == 0) {
			if (AmOrPm == 0) {
				System.out.println(" AM");
			} else {
				System.out.println(" PM");
			}
		}
		// Add 5 sec
		sec = sec + 5;
		if (sec >= 60) {
			min++;  
			sec = sec - 60;
		}
		if (min >= 60) {
			hour++;
			min = min - 60;
		}
		if (twelveOrTwentyfour == 0) {
			if (hour == 12) {
				hour = 0;
				if (AmOrPm == 0) {
					AmOrPm = 1;
				} else {
					AmOrPm = 0;
				}
			}
		} else {
			if (hour == 24) {
				hour = 0;
			}
		}
		System.out.print("\n The new time with 5 sec added is  :");
		// Display the time after 5 sec were added
		if (hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour);
		System.out.print(":");
		if (min < 10) {
			System.out.print("0");
		}
		System.out.print(min);
		System.out.print(":");
		if (sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec);
		if (twelveOrTwentyfour == 0) {
			if (AmOrPm == 0) {
				System.out.println(" AM");
			} else {
				System.out.println(" PM");
			}
		}

		scanner.close();
	}
}