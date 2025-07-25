import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("use 24h clock?");
		boolean clockType = scanner.nextBoolean();
		
		if (clockType == true){
			System.out.println("mode selected is 24h");
			System.out.println("please input an hour");
			Scanner scanHours = new Scanner(System.in);
			int hours;
			hours = scanHours.nextInt();
			System.out.println("please input a minute");
			Scanner scanMinutes = new Scanner(System.in);
			int minutes;
			minutes = scanMinutes.nextInt();
			System.out.println("please input a second");
			Scanner scanSeconds = new Scanner(System.in);
			int seconds;
			String minuteDisplay;
			String secondsDisplay;
			seconds = scanSeconds.nextInt();
			int newSeconds = seconds +5;
			
			if (((hours >= 0) && (hours < 24)) && ((minutes >= 0) && (minutes <60)) && ((seconds >=0) && (seconds < 60))){
				if ((minutes >= 0) && (minutes < 10)){
					minuteDisplay = String.format("%02d",minutes);
				}
				else {
					minuteDisplay = Integer.toString(minutes);
				}
				if ((seconds >= 0) && (seconds < 10)){
					secondsDisplay = String.format("%02d",seconds);
				}
				else {
					secondsDisplay = Integer.toString(seconds);
				}
				System.out.println("time is: " + hours + ":" + minuteDisplay + ":" + secondsDisplay);
			}	
			else {
					do {
						System.out.println("input invalid, try again: ");
						System.out.println("please input an hour");
						hours = scanHours.nextInt();
						System.out.println("please input a minute");
						minutes = scanMinutes.nextInt();
						System.out.println("please input a second");
						seconds = scanSeconds.nextInt();
					} while (((hours < 0) && (hours >= 24)) && ((minutes < 0) && (minutes >=60)) && ((seconds <0) && (seconds >=60)));
			}	
			seconds = seconds +5;
			if (seconds >= 60){
				minutes = minutes +1;
				seconds = seconds - 60;
				secondsDisplay = Integer.toString(seconds);
			}
			if (minutes >= 60){
				hours = hours +1;
				minutes = minutes - 60;
				minuteDisplay = Integer.toString(minutes);
			}
			if (hours >= 24) {
				hours = hours - 24;
			}
			if ((minutes >= 0) && (minutes < 10)){
				minuteDisplay = String.format("%02d",minutes);
			}
			else {
				minuteDisplay = Integer.toString(minutes);
			}
			if ((seconds >= 0) && (seconds < 10)){
				secondsDisplay = String.format("%02d",seconds);
			}
			else {
				secondsDisplay = Integer.toString(seconds);
			}
			System.out.println("time is: " + hours + ":" + minuteDisplay + ":" + secondsDisplay);
		}	
		else if (clockType == false){
			System.out.println("mode selected is 12h");
			System.out.println("please input an hour");
			Scanner scanHours = new Scanner(System.in);
			int hours;
			hours = scanHours.nextInt();
			System.out.println("please input a minute");
			Scanner scanMinutes = new Scanner(System.in);
			int minutes;
			minutes = scanMinutes.nextInt();
			System.out.println("please input a second");
			Scanner scanSeconds = new Scanner(System.in);
			int seconds;
			seconds = scanSeconds.nextInt();
			String minuteDisplay;
			String secondsDisplay;
			int hoursDisplay = hours;
			int newSeconds = seconds + 5;
			if (((hours >= 0) && (hours < 24)) && ((minutes >= 0) && (minutes <60)) && ((seconds >=0) && (seconds < 60))){
				minuteDisplay = ((minutes >= 0) && (minutes < 10))
					? String.format("%02d",minutes)
					: Integer.toString(minutes);
			
				secondsDisplay = ((seconds >= 0) && (seconds < 10))
					? String.format("%02d",seconds)
					: Integer.toString(seconds);
				
				if (hours >= 24){
					hoursDisplay = 0;
				}
				if (seconds >= 60){
					seconds = seconds -60;
				}
				if (minutes >= 60){
					minutes = minutes - 60;
				}
				String isAm = "";
				if (hours > 12 && hours < 24){
					hoursDisplay = hours -12;
					isAm = "pm";
					System.out.println("time is: " + hoursDisplay + ":" + minuteDisplay + ":" + secondsDisplay + isAm);
					seconds = seconds + 5;
					if (seconds >= 60){
						seconds = seconds - 60;
						minutes = ++minutes;
					}
					if (minutes >= 60){
						minutes = minutes -60;
						hours = ++hours;
					}
					if (hours >=24){
						hours = hours - 24;
						isAm = "am";
					}
						
					minuteDisplay = ((minutes >= 0) && (minutes < 10))
					? String.format("%02d",minutes)
					: Integer.toString(minutes);
			
					secondsDisplay = ((seconds >= 0) && (seconds < 10))
					? String.format("%02d",seconds)
					: Integer.toString(seconds);
					System.out.println("time is: " + hours + ":" + minuteDisplay + ":" + secondsDisplay + isAm);

				}
				else {
					isAm = "am";
					System.out.println("time is: " + hours + ":" + minuteDisplay + ":" + secondsDisplay + isAm);
					seconds += 5;
					
					if (seconds >= 60){
						seconds = seconds - 60;
						minutes = ++minutes;
					}
					if (minutes >= 60){
						minutes = minutes -60;
						hours = ++hours;
					}
					if (hours >=12){
						hours = hours - 12;
						isAm = "pm";
					}
						
					minuteDisplay = ((minutes >= 0) && (minutes < 10))
					? String.format("%02d",minutes)
					: Integer.toString(minutes);
			
					secondsDisplay = ((seconds >= 0) && (seconds < 10))
					? String.format("%02d",seconds)
					: Integer.toString(seconds);
					System.out.println("time is: " + hours + ":" + minuteDisplay + ":" + secondsDisplay + isAm);

				}
				
				
				
			}			
		}
	}
}
		
	
		
	
