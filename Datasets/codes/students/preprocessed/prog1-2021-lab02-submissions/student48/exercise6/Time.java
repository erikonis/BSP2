import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Can you please enter an hour (from 0h to 24h) : ");
		byte hour = scanner.nextByte();

		System.out.println("Can you please enter minutes : ");
		byte min = scanner.nextByte();

		System.out.println("Can you please enter an seconds : ");
		byte sec = scanner.nextByte();

		System.out.println("Can you precise the type of clock you want : 12 o'clock (1) or 24 (2) ? Write 1 or 2");
		byte typeClock = scanner.nextByte();

		if ((hour < 1) || (hour > 24)) {
			System.out.println("Hour input is not correct.");
			System.exit(1);
		}
		if ((min < 0) || (min > 59)) {
			System.out.println("Minutes input is not correct.");
			System.exit(1);
		}
		if ((sec < 0) || (sec > 59)) {
			System.out.println("Seconds input is not correct.");
			System.exit(1);
		}
		if ((typeClock < 1) || (typeClock > 2)) {
			System.out.println("Type of the Clock input is not correct.");
			System.exit(1);
		}


		if ((typeClock == 1) && (hour < 12)) {
			System.out.println(hour + ":" + min + ":" + sec + " AM ");
		} else if ((typeClock == 1) && (hour >= 12) && (hour < 13)) {
			System.out.println("12:" + min + ":" + sec + " PM ");
		} else if ((typeClock == 1) && (hour > 13)) {
			System.out.println(hour - 12 + ":" + min + ":" + sec + " PM ");
		} else if ((typeClock == 2)) {
			System.out.println(hour + ":" + min + ":" + sec);
		}


		System.out.println("New time with 5 seconds more :");

		if (typeClock == 1) {
			sec += 5;
			if (sec > 59) {
				min += 1;
				sec -= 60;
			}
			if (min > 59) {
				hour += 1;
				min -= 60;
			}
			if (hour > 23) {
				hour -= 24;

			}
			if (hour < 12) {
				System.out.printf("%02d:%02d:%02d AM \n", hour, min, sec);
			} else if (hour >= 12) {
				System.out.printf("%02d:%02d:%02d PM \n", hour, min, sec);
			}
		}

		if (typeClock == 2) {
			sec += 5;

			if (sec > 59) {
				min += 1;
				sec -= 60;
			}
			if (min > 59) {
				hour += 1;
				min -= 60;
			}
			if (hour > 23) {
				hour -= 24;
			}
			System.out.printf("%02d:%02d:%02d \n", hour, min, sec);
		}

		scanner.close();
	}
}
