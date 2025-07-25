import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int second, minute, hour;
		boolean european;
		System.out.println("Type 'true' to use the 24 hour format. Type 'false' to use the AM/PM format");
		european = scanner.nextBoolean();
		String timeOfDay="";

		System.out.println("Please enter an hour");
		hour = Math.min(Math.max(scanner.nextInt(), 0), 24);
		if(!european){
			if(hour>12){
				hour -= 12;
				timeOfDay="PM";
			}
			else{
				timeOfDay="AM";
			}
		}
		hour = hour>9 ? hour : Integer.valueOf("0"+hour);
		System.out.println("Please enter a minute");
		minute = Math.min(Math.max(scanner.nextInt(), 0), 60);
		minute = minute>9 ? minute : Integer.valueOf("0"+minute);
		System.out.println("Please enter a second");
		second = Math.min(Math.max(scanner.nextInt(), 0), 60);
		second = second>9 ? second : Integer.valueOf("0"+second);
		
		if(european){
			System.out.println("Your time is : "+hour+":"+minute+":"+second);
		}
		else{
			System.out.println("Your time is : "+hour+":"+minute+":"+second+" "+timeOfDay);
		}

		if((second += 5) > 59){
			second = second - 60;
			minute++; 
		}
		if(minute>59){
			minute = minute-60;
			hour++;
		}	
		if(european){
			if(hour>23){
				hour=hour-24;
			}
		}
		else{
			if(hour>11){
				hour = hour-11;
			}
		}

		hour = hour>9 ? hour : Integer.valueOf("0"+hour);
		System.out.println("Please enter a minute");
		minute = Math.min(Math.max(scanner.nextInt(), 0), 60);
		minute = minute>9 ? minute : Integer.valueOf("0"+minute);
		System.out.println("Please enter a second");
		second = Math.min(Math.max(scanner.nextInt(), 0), 60);
		second = second>9 ? second : Integer.valueOf("0"+second);
		if(european){
			System.out.println("Your time is : "+hour+":"+minute+":"+second);
		}
		else{
			System.out.println("Your time is : "+hour+":"+minute+":"+second+" "+timeOfDay);
		}
		scanner.close();
	}
}