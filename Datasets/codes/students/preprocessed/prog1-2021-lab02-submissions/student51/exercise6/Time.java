package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean amMode = false;
		int hours=0;
		int minutes=0;
		int seconds=0;

		System.out.println("enable AM mode? : ");
		amMode = scanner.nextBoolean();

		System.out.println("Please enter the hours : ");
		hours = scanner.nextInt();
		if(hours>24) hours = 24;
		else if (hours<0) hours = 0;

		System.out.println("Please enter the minutes : ");
		minutes = scanner.nextInt();
		if(minutes>59) minutes = 59;
		else if (minutes<0) minutes = 0;
		
		System.out.println("Please enter the seconds : ");
		seconds = scanner.nextInt();
		if(seconds>59) seconds = 59;
		else if (seconds<0) seconds = 0;

		if(amMode) 
		{
			if(hours > 12) System.out.println(hours-12+":"+String.format( "%02d" , minutes)+":"+String.format( "%02d" , seconds)+" PM");
			else System.out.println(String.format( "%02d" , hours)+":"+String.format( "%02d" , minutes)+":"+String.format( "%02d" , seconds)+" AM");
		}
		else System.out.println(String.format( "%02d" , hours)+":"+String.format( "%02d" , minutes)+":"+String.format( "%02d" , seconds));
		
		System.out.println("");
		System.out.println("Five seconds later....");
		System.out.println("");

		seconds +=5;

		if(seconds>59) {seconds-=60; minutes +=1;}
			if(minutes>59){minutes=0; hours +=1;}
				if(hours>23){hours=0;}

		if(amMode)
		{
			if(hours > 12) System.out.println(hours-12+":"+String.format( "%02d" , minutes)+":"+String.format( "%02d" , seconds)+" PM");
			else System.out.println(String.format( "%02d" , hours)+":"+String.format( "%02d" , minutes)+":"+String.format( "%02d" , seconds)+" AM");
		}
		else System.out.println(String.format( "%02d" , hours)+":"+String.format( "%02d" , minutes)+":"+String.format( "%02d" , seconds));

		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner

		scanner.close();
	}
}