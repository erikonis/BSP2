package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	static Scanner scanner = new Scanner(System.in);
	
	// Checks for valid input
	public static int getValid(int max, int foo){		
		int check = foo;

		int res = 0;
		while(check>max || check<0){
			System.out.println("Please enter valid input");
			res = scanner.nextInt();
		}
		return res;
	}

	// Prints clock
	public static void getClock(String mode, int hours, int min, int sec){
		
		if(sec>=60){
			sec = sec-60;
			min++;
		}
		if(min>=60){
			min = min-60;
			hours++;
		}
		if(hours==24){
			hours = 0;
		}

		String format = "AM";
		if(hours>=12 && hours<24){
			format = "PM";
			if(hours>12){
				hours -= 12;
			}
		}else if(hours==24){
			hours = 12;
		}
			
		if(mode.equalsIgnoreCase("yes")){
			System.out.printf("%02d:%02d:%02d %s",hours,min,sec,format + "\n");
		}else{
			System.out.printf("%02d:%02d:%02d",hours,min,sec + "\n");

		}
	}

	public static void main(String[] args) {
		
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		String mode = "";
		
		// Asks clock mode and checks if valid
		System.out.println("Do you want the clock with AM/PM? (yes/no):");
		mode = scanner.next();
		while(!(mode.equalsIgnoreCase("no") || mode.equalsIgnoreCase("yes"))){
			System.out.println("Please enter valid input");
			mode = scanner.next();
		}

		// Asks hours and checks if valid
		System.out.println("Hours:");
		hours = scanner.nextInt();
		hours = getValid(24, hours);

		// Asks minutes and checks if valid
		System.out.println("Minutes:");
		minutes = scanner.nextInt();
		minutes = getValid(60, minutes);

		// Asks seconds and checks if valid
		System.out.println("Seconds:");
		seconds = scanner.nextInt();
		seconds = getValid(60, seconds);
		
		getClock(mode,hours,minutes,seconds);
		getClock(mode,hours,minutes,seconds+5);

		scanner.close();
	}	
}
