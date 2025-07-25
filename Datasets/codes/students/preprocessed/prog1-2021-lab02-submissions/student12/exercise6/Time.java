import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hours, minutes, seconds;
		String shours, sminutes, sseconds;

		System.out.println(" Please enter the hour :");
		hours = scanner.nextInt();
		if (hours < 0) {
			hours = 0;
		}
		if (hours > 24) {
			hours = 0;
		}
		System.out.println(" Please enter the minutes :");
		minutes = scanner.nextInt();
		if (minutes < 0 && minutes > 59) {
			minutes = 0;
		}
		System.out.println(" Please enter the seconds :");
		seconds = scanner.nextInt();
		if (seconds < 0 && seconds > 59) {
			seconds = 0;
		}

		shours = (hours < 10) ? "0" + hours : hours + "";
		sminutes = (minutes < 10) ? "0" + minutes : minutes + "";
		sseconds = (seconds < 10) ? "0" + seconds : seconds + "";
		System.out.println(shours + ":" + sminutes + ":" + sseconds);

		System.out.println("5 seconds added :");
		seconds = seconds + 5;
		if (seconds > 59) {
			seconds = seconds - 60;
			minutes = minutes + 1;

		}
		if (minutes > 59) {
			minutes = minutes - 60;
			hours = hours + 1;
		}
		if (hours > 23) {
			hours = 0;
		}
		shours = (hours < 10) ? "0" + hours : hours + "";
		sminutes = (minutes < 10) ? "0" + minutes : minutes + "";
		sseconds = (seconds < 10) ? "0" + seconds : seconds + "";
		System.out.println(shours + ":" + sminutes + ":" + sseconds);


		scanner.close();
	}
}