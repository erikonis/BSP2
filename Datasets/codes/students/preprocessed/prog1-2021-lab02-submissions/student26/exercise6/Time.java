import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("24-hour clock format? ");
		boolean format = scanner.nextBoolean();

		System.out.print("Enter hours: ");
		int hours = scanner.nextInt();
		String code = "";

		if (format) {
			while (hours > 23 || hours < 0) {
				System.out.print("Enter a valid hour value: ");
				hours = scanner.nextInt();
				if (hours <= 23 && hours >= 0) {
					break;
				}
			}
		} else {
			while (hours > 12 || hours < 1) {
				System.out.print("Enter a valid hour value: ");
				hours = scanner.nextInt();
				if (hours <= 12 && hours >= 1) {
					break;
				}
			}
			System.out.print("Enter a time code (AM/PM):");
			code = scanner.next();
		}

		System.out.print("Enter minutes: ");
		int min = scanner.nextInt();
		while (min > 59 || min < 0) {
			System.out.print("Enter a valid minute value: ");
			min = scanner.nextInt();
			if (min <= 59 && min >= 0) {
				break;
			}
		}
		System.out.print("Enter seconds: ");
		int sec = scanner.nextInt();
		while (sec > 59 || sec < 0) {
			System.out.print("Enter a valid second value: ");
			sec = scanner.nextInt();
			if (sec <= 59 && sec >= 0) {
				break;
			}
		}

		sec = sec + 5;
		if (sec > 59) {
			sec = sec % 60;
			min = min + 1;
		}
		if (min > 59) {
			min = min % 60;
			hours = hours + 1;
		}
		if(format){
			if(hours > 23){
				hours = hours%24;
			}
		}else{
			if(hours > 12){
				hours = hours%12;
			}
			if(code.equals("AM")){
				code = "PM";
			}else{
				code = "AM";
			}
		}

		if (hours < 10) {
			System.out.print("0" + hours);
		} else {
			System.out.print(hours);
		}
		if (min < 10) {
			System.out.print(":0" + min);
		} else {
			System.out.print(":" + min);
		}
		if (sec < 10) {
			System.out.print(":0" + sec);
		} else {
			System.out.print(":" + sec);
		}
		if (!format) {
			System.out.print(" " + code);
		}

		
		scanner.close();
	}
}