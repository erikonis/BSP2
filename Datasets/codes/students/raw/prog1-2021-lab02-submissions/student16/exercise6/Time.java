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
        
		System.out.print("Enter the hours : ");
        int hours = scanner.nextInt();
        System.out.print("Enter the minutes : ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the seconds : ");
        int seconds = scanner.nextInt();
		System.out.print("Select the clock format (12 or 24) : ");
		int clock_format = scanner.nextInt();
        
		if(clock_format==24){
			while (hours >= 24 || hours < 0)
			{
			  System.out.print("Enter the hours : ");
			  hours = scanner.nextInt();
			}  
		    while (minutes>=60 || minutes<0){
			  System.out.print("Enter the minutes : ");
			  minutes = scanner.nextInt();
			}
			while (seconds>=60 || seconds<0){
				System.out.print("Enter the seconds : ");
				seconds = scanner.nextInt();
			}
			minutes += seconds / 60;
			seconds %= 60;
			hours += minutes / 60;
			minutes %= 60;
			System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
			seconds+=5;
			minutes += seconds / 60;
			seconds %= 60;
			hours += minutes / 60;
			minutes %= 60;
			if(hours==24){
				hours=0;
			}
			System.out.print("\n");
			System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
	    }else if(clock_format==12){
			System.out.print("am or pm ? : ");
			String am_pm = scanner.next();
			          
			while (hours > 12 || hours < 0)
			{
			  System.out.print("Enter the hours : ");
			  hours = scanner.nextInt();
			}  
		    while (minutes>=60 || minutes<0){
			  System.out.print("Enter the minutes : ");
			  minutes = scanner.nextInt();
			}
			while (seconds>=60 || seconds<0){
				System.out.print("Enter the seconds : ");
				seconds = scanner.nextInt();
			}
			minutes += seconds / 60;
			seconds %= 60;
			hours += minutes / 60;
			minutes %= 60;
			System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
			System.out.println(am_pm);
			seconds+=5;
			minutes += seconds / 60;
			seconds %= 60;
			hours += minutes / 60;
			minutes %= 60;
			if(hours==12){
				hours=0;
			}
			System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
			System.out.println(am_pm); 
	    }

	
		
		
		 

		scanner.close();
	}
}