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
		int hours;
		int minutes;
		int seconds;

		String SHour;
		String SMin;
		String SSec;

		System.out.println("Please enter the hours here: ");
		hours = scanner.nextInt();

		System.out.println("Please enter the minutes here: ");
		minutes = scanner.nextInt();

		System.out.println("Please enter the seconds here: ");
		seconds = scanner.nextInt();

		if(seconds <10)
		{
			SSec = "0" + seconds;
		}
		else
		{
			SSec = "" + seconds;
		}

		if(minutes <10)
		{
			SMin = "0" + minutes;
		}
		else
		{
			SMin = "" + minutes;
		}
		
		if(hours <10)
		{
			SHour = "0" + hours;
		}
		else
		{
			SHour = "" + hours;
		}


		System.out.println("Your time is: " 
		+ SHour + ":" + SMin + ":" + SSec);

		seconds = seconds +5;

		if(seconds >= 60)
		{
			seconds = seconds -60;
			minutes++;
		}

		if(minutes >= 60)
		{
			minutes = minutes -60;
			hours++;
		}

		if(hours >= 24)
		{
			hours = hours -24;
		}
		
		String newSecond;
		String newMinute;
		String newHour;
		
		if(seconds <10)
		{
			newSecond = "0" + seconds;
		}
		else
		{
			newSecond = "" + seconds;
		}

		if(minutes <10)
		{
			newMinute = "0" + minutes;
		}
		else
		{
			newMinute = "" + minutes;
		}
		
		if(hours <10)
		{
			newHour = "0" + hours;
		}
		else
		{
			newHour = "" + hours;
		}

		System.out.println("Your new time is: " 
			+ newHour + ":" + newMinute + ":" + newSecond);

		scanner.close();
	}
}