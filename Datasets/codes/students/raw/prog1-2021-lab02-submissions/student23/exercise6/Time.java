package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner
		int hour;
		int mins;
		int secs;
		String use24Format;
		boolean twentyFourHour = true;
		String meridian = "AM";

		System.out.println("Input Hours");
		hour = scanner.nextInt();
		System.out.println("Input Minutes");
		mins = scanner.nextInt();
		System.out.println("Input Seconds");
		secs = scanner.nextInt();

		System.out.println("Use 24h fomart ? (y/n default: y)");
		use24Format = scanner.next();
		if (use24Format.toLowerCase().equals("n")){
			twentyFourHour = false;

			System.out.println("AM / PM (default : AM)");
			meridian = scanner.next().toUpperCase();

			if (!meridian.equals("PM")) {meridian = "AM";}
		} else {twentyFourHour = true;}
		
		secs += 5;
		//Value check, checks if none of the value exceeds its limit then round it
		boolean changed = false; //If we modify the hour -> true

		if (secs < 0) {secs = 0; changed = true;}
		else if (secs > 59) {mins++; secs = secs-60; changed=true;}

		if (mins < 0) {mins = 0; changed=true;}
		else if (mins > 59) {hour++; mins = mins-60;changed=true;}
		
		if (hour < 0) {hour = 0;changed=true;}
		else if (twentyFourHour && hour > 24) {hour = 0;changed=true;}
		else if (!twentyFourHour && hour > 12) {hour = 0;changed=true;}

		if (changed) {System.out.println("The values were modified to prevent overflow (i.e : hours can't be higher than 24)");}

		//Building the string
		String msg = "";

		//Hour
		if (hour < 10) {msg += String.format("0%d", hour);}
		else {msg += String.format("%d", hour);}

		if (!twentyFourHour) {msg += meridian;}

		//add ":"
		msg += ':';

		//Minutes
		if (mins < 10) {msg += String.format("0%d", mins);}
		else {msg += String.format("%d", mins);}

		//add ":"
		msg += ':';

		//Seconds
		if (secs < 10) {msg += String.format("0%d", secs);}
		else {msg += String.format("%d", secs);}


		//Display
		System.out.println(msg);


		//scanner close
		scanner.close();
	}
}