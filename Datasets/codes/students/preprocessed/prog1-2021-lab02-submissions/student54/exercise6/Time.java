package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		boolean clock = false;

		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner

		System.out.println("Please type 'TRUE' for AM/PM format, and 'FALSE' for 24-hour format.");
		clock = scanner.nextBoolean();
		
		System.out.println("Enter the hours here:");
		hours = scanner.nextInt();
		if(hours < 0 || hours > 24) hours = 0;

		System.out.println("Enter the minutes here:");
		minutes = scanner.nextInt();
		if(minutes < 0) minutes = 0;
		if(minutes > 59) minutes = 59;

		System.out.println("Enter the seconds here:");
		seconds = scanner.nextInt();
		if(seconds < 0) seconds = 0;
		if(seconds > 59) seconds = 59;

		if(clock){
			if(hours > 12) hours-=12;
			System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));
		}else System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));

		System.out.println("\nAfter 5 seconds:\n");

		seconds+=5;


		if(seconds > 59){
			minutes+=1; seconds-=60;
			if(minutes > 59){
				hours+=1; minutes = 0;
				if(hours > 23) hours = 0;
			}
		}
		

		if(clock){
			if(hours > 12) hours-=12;
			System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));
		}else System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));

		scanner.close();
	}
}