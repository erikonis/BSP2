package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter time: ");

		System.out.println("Hours: ");
		int hours = scanner.nextInt();

			if (hours > 23 || hours < 0)
				{System.out.println("Must be between 0 and 23. Retry.");
				System.exit(0);}

		System.out.println("Minutes: ");
		int minutes = scanner.nextInt();

			if (minutes > 59 || minutes < 0)
				{System.out.println("Must be between 0 and 59. Retry.");
				System.exit(0);}

		System.out.println("Seconds: ");
		int seconds = scanner.nextInt();

			if (seconds > 59 || seconds < 0)
				{System.out.println("Must be between 0 and 59. Retry.");
					System.exit(0);}

		System.out.println("Would you like the 12-hour clock format? yes/no");
		String answer = scanner.next();
		Boolean format = answer.equalsIgnoreCase("y")?true:false;


		int hoursampm = hours;
		String ampm = "";
			if (format == true)
				{if (hoursampm > 12)
					{hoursampm = hoursampm - 12;
					ampm = " pm";}
				else {
					ampm = " am";
					if (hoursampm == 0)
						{hoursampm = 12;}
					}
				
		

				System.out.println("Time = " + 
				String.format("%02d", hoursampm) + ":" + 
				String.format("%02d", minutes) + ":" + 
				String.format("%02d", seconds) + ampm);
				}
				else 
				{
				System.out.println("Time = " + 
				String.format("%02d", hours) + ":" + 
				String.format("%02d", minutes) + ":" + 
				String.format("%02d", seconds));
				}
		seconds = seconds + 5;
		
				if (seconds > 59)
					{
						seconds = seconds - 60;
						minutes = minutes + 1;
							if (minutes > 59)
								{
									minutes = minutes - 60;
									hours = hours + 1;
										if (hours > 24)
											{
												hours = hours - 24;
											}
								}
					}
				
		hoursampm = hours;
		if (format == true)
			{if (hoursampm > 12)
				{hoursampm = hoursampm - 12;
					ampm = " pm";}
			else {
					ampm = " am";
					if (hoursampm == 0)
							{hoursampm = 12;}
				}
					
			
	
					System.out.println("Time after 5 seconds = " + 
					String.format("%02d", hoursampm) + ":" + 
					String.format("%02d", minutes) + ":" + 
					String.format("%02d", seconds) + ampm);
					}
		else 
					{
					System.out.println("Time after 5 seconds = " + 
					String.format("%02d", hours) + ":" + 
					String.format("%02d", minutes) + ":" + 
					String.format("%02d", seconds));
					}

		
		




		scanner.close();
	}
}