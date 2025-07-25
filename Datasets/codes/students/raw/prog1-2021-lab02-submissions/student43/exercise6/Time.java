package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
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
		//reads the inputs for the time values and what mode the clock is on
		second = Math.min(second, 59);
		second = Math.max(second, 00);
		minute = Math.min(minute, 59);
		minute = Math.max(minute, 00);
		hour = Math.min(hour, 23);
		hour = Math.max(hour, 0);
		//limits the time values to what they can be
		int hourdisplay = hour;
		String dayhalf = "";
		//sets the dispayed hour to the hour value
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
		//if the clock is set to 12 hour mode, sets the displayed hour to within 12 and displays AM/PM after, depending on the half of the day

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
		//increments the seconds by 5, then if the second counter goes to or over 60, makes sure the rest of the values adjust accordingly
		//prints the time correctly
		System.out.println("The time is: "+hourdisplay+":"+minute+":"+second+" "+dayhalf);
		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner

		scanner.close();
	}
}