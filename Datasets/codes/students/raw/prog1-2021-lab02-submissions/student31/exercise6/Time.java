package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {
	static int seconds;
	static int minutes;
	static int hours;
	public static void Advancedhour(int hours,int minutes,int seconds){
	  seconds = seconds+5;
	  minutes += seconds / 60;
	  seconds %= 60;
	  hours += minutes / 60;
	  minutes %= 60;
  
	  System.out.format("\n New time is : %02d:%02d:%02d", hours, minutes, seconds);
  
	}
 
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
  
	  System.out.print("What format 12hr or 24hr? [12,24]");
	  int clockFormat = scanner.nextInt();
  
	  System.out.print("Enter seconds: ");
	   seconds = scanner.nextInt();
	   while (seconds <0 || seconds >59)
	  {
		System.out.println("seconds should be in range 0-59...");
		System.out.println("Enter seconds...");
		seconds = scanner.nextInt();
	  }
  
	  System.out.print("Enter minutes: ");
	   minutes = scanner.nextInt();
	  while (minutes <0 || minutes >59)
	  {
		System.out.println("minute should be in range 0-59...");
		System.out.println("Enter minutes...");
		minutes = scanner.nextInt();
	  }
  
	  System.out.print("Enter hours: ");
	   hours = scanner.nextInt();
	  if (clockFormat == 12)
	  {
  
		while (hours > 12 || hours < 0)
		{
  
		  System.out.print("Enter the hours: ");
		  hours = scanner.nextInt();
		}
	  }
	  else if (clockFormat == 24)
	  {
  
		while (hours > 24 || hours < 0)
		{
  
		  System.out.print("Enter the hours: ");
		  hours = scanner.nextInt();
		}
	  }
	  minutes += seconds / 60;
	  seconds %= 60;
	  hours += minutes / 60;
	  minutes %= 60;
  
	  System.out.format("Time is :%02d:%02d:%02d", hours, minutes, seconds);
	  Advancedhour(hours,minutes,seconds);
  
  
		scanner.close();
	}
}