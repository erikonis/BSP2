import java.util.Scanner;

public class TimeFormatString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("AM/PM ?");
		boolean ampm = scanner.nextBoolean();

		System.out.println("h = ");
		int hours = scanner.nextInt();

		if (ampm) {
			hours = Math.max(1, Math.min(12, hours));
		} else {
			hours = Math.max(0, Math.min(23, hours));
		}
		System.out.println("m = ");
		int minutes = Math.max(0, Math.min(59, scanner.nextInt()));
		System.out.println("s = ");
		int seconds = Math.max(0, Math.min(59, scanner.nextInt()));

		System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

		seconds += 5;
		if (seconds >= 60) {
			seconds = seconds - 60;
			minutes++;

			if (minutes == 60) {
				minutes = 0;
				hours++;

				if (ampm && (hours == 13)) {
					hours = 1;
				} else if (!ampm && (hours == 24)) {
					hours = 0;
				}
			}
		}
		System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
		scanner.close();
	}
}