import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please give the wanted time format (for 12-hour clock: US and for 24-hour clock: EURO): ");
		String timeFormat = scanner.nextLine();

		String dayTime = "PM";

		if(timeFormat.equals("US")){
			System.out.print("State if it is morning (AM) or afternoon (PM): ");
			dayTime = scanner.nextLine();
		}

		System.out.print("Please give the hour: ");
		int hour = scanner.nextInt();

		System.out.print("Please give the minute: ");
		int minute = scanner.nextInt();

		System.out.print("Please give the second: ");
		int second = scanner.nextInt();

		scanner.close();

		if(dayTime.equals("PM")){
			hour = hour + 12;
		}

		if(second>59){
			second = 59;
		}else if(second<0){
			second = 0;
		}

		if(minute>59){
			minute = 59;
		}else if(minute<0){
			minute = 0;
		}
		
		if(hour>23){
			hour = 23;
		}else if(hour<0){
			hour = 0;
		}

		System.out.println(String.format("%02d" , hour) + ":" + String.format("%02d" , minute) + ":" + String.format("%02d" , second));

		second = second + 5;

		if(second>59){
			second = 59;
		}else if(second<0){
			second = 0;
		}

		System.out.print("The time advanced by five second: " + String.format("%02d" , hour) + ":" + String.format("%02d" , minute) + ":" + String.format("%02d" , second));
	}
}