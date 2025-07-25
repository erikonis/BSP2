import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		boolean valid = true;

		int hours = -1;

		System.out.print("Do you want to use the 24-hour format?\nPlease answer with 'true' or 'false': ");
		boolean format = scanner.nextBoolean();

		if (!format) {
			System.out.println("Enter the amount in hours.\nPlease enter a number in between 1 and 12: ");
			hours = scanner.nextInt();

			if (hours <= 0 || hours >=13) {
				valid = false;
			}
		}

		if (format) {
			System.out.println("Enter the amount of hours.\nPlease enter a number in between 0 and 23: ");
			hours = scanner.nextInt();

			if (hours < 0 || hours >= 24) {
				valid = false;
			}
		}

		System.out.println("Enter the amount of minutes.\nPlease enter a number in between 0 and 59: ");
		int minutes = scanner.nextInt();

		if (minutes < 0 || minutes >= 60) {
			valid = false;
		}

		System.out.println("Enter the amount of seconds.\nPlease enter a number in between 0 and 59: ");
		int seconds = scanner.nextInt();

		if (seconds < 0 || seconds >= 60) {
			valid = false;
		}


		if (valid) {
			System.out.printf("The time you entered is:\n%02d:%02d:%02d\n", hours, minutes, seconds);
		} else {
			System.out.println("The time you entered is not valid");
		}


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
			if (hours >= 24) {
				hours -= 24;
			}
		} else {
			if (hours >= 13) {
				hours -= 12;
			}
		}


		if (valid) {
			System.out.printf("The time 5 seconds afterwards is:\n%02d:%02d:%02d\n", hours, minutes, seconds);
		}

		scanner.close();
	}
}