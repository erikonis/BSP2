import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What type of clock? (12 or 24 hour clock) ");
		int clockmode = scanner.nextInt();
		System.out.print("What is the second hand at? (00-59) " );
		int second = scanner.nextInt();
		System.out.print("What's the minute hand at? (00-59) ");
		int minute = scanner.nextInt();
		System.out.print("What is the hour hand at? (0-23) ");
		int hour = scanner.nextInt();
		second = Math.min(second, 59);
		second = Math.max(second, 00);
		minute = Math.min(minute, 59);
		minute = Math.max(minute, 00);
		hour = Math.min(hour, 23);
		hour = Math.max(hour, 0);
		int hourdisplay = hour;
		String dayhalf = "";
		if ((clockmode == 12) && (hour > 12)){
			hourdisplay = hour - 12;
			dayhalf = "pm";}
		if ((clockmode == 12) && (hour <= 12)){
			dayhalf = "am";}
		if ((clockmode == 12) && (hour == 12)){
			dayhalf = "pm";}
		if ((clockmode == 12) && (hour == 24)){
			hourdisplay = 00;
			dayhalf = "am";}

		System.out.println("The time is: "+hourdisplay+":"+minute+":"+second+" "+dayhalf);
		System.out.println("Five seconds later");
		second = second + 5;
		if (second >= 60){
			second = second - 60;
			minute = minute + 1;}
		if (minute >= 60){
			minute = 0;
			hour = hour + 1;}
		if ((clockmode == 12) && (hour > 12)){
			hourdisplay = hour - 12;
			dayhalf = "pm";}
		if ((clockmode == 12) && (hour <= 12)){
			dayhalf = "am";}
		if ((clockmode == 12) && (hour == 12)){
			dayhalf = "pm";}
		if ((clockmode == 12) && (hour == 24)){
			hourdisplay = 00;
			hour = 00;
			dayhalf = "am";}
		System.out.println("The time is: "+hourdisplay+":"+minute+":"+second+" "+dayhalf);

		scanner.close();
	}
}