import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String hour_nice = null;
		String minutes_nice = null;
		String seconds_nice = null;
		String next_hour_nice = null;
		String next_minutes_nice = null;
		String next_seconds_nice = null;
		int next_hour, next_min, next_sec;

		System.out.print("Please enter the HOUR: ");
		int hour = scanner.nextInt();
	

		System.out.print("Please, type A if the time is in 12-hour clock with AM/PM or type B if the time is in 24-hour clock ");
		String clock = scanner.next();


		switch (clock ){
			case  "a" , "A":
				System.out.print("Is the hour AM or PM? "); 
				String timeFormat = scanner.next();
				switch (timeFormat) {
					case "am" , "AM":
						hour = Math.min(Math.max(hour, 0), 12);
						if (hour == 12) {hour = 0;} //special case
						break; // without break: fall-through to next case:
					case "pm" , "PM":
						hour = (hour%12) + 12;
						hour = Math.min(Math.max(hour, 0), 24);
						break;
					default:
						System.out.println("handle invalid answer ...");
				}
			case "b" , "B":
				hour = Math.min(Math.max(hour, 0), 24);
		}

		System.out.print("Please enter the MINUTES: ");
		int min = scanner.nextInt();
		min = Math.min(Math.max(min, 0), 59);

		System.out.print("Please enter SECONDS: ");
		int sec = scanner.nextInt();
		sec = Math.min(Math.max(sec, 0), 59);

		next_sec = (sec + 5) % 60;
		next_min = min;
		next_hour = hour;
		if ((sec + 5) > 59){ // we need to add one minute accordingly
			next_min =  (min + 1) % 60;
			if ( (min + 1) > 59){
				next_hour = (hour + 1) % 24;
			}
		}

		hour_nice = String.valueOf(hour);  
		minutes_nice = String.valueOf(min);  
		seconds_nice = String.valueOf(sec);  

		if (hour < 10){hour_nice = String.format("%02d" , hour);}
		if (min < 10){minutes_nice = String.format("%02d" , min);}
		if (sec < 10){seconds_nice = String.format("%02d" , sec);}

		System.out.print("The time is " + hour_nice + ":" + minutes_nice + ":" + seconds_nice + "\n");		
		
		next_hour_nice = String.valueOf(next_hour);  
		next_minutes_nice = String.valueOf(next_min);  
		next_seconds_nice = String.valueOf(next_sec);  

		if (next_hour < 10){next_hour_nice = String.format("%02d" , next_hour);}
		if (next_min < 10){next_minutes_nice = String.format("%02d" , next_min);}
		if (next_sec < 10){next_seconds_nice = String.format("%02d" , next_sec);}

		System.out.print("The next time is " + next_hour_nice + ":" + next_minutes_nice + ":" + next_seconds_nice + "\n");	


		scanner.close();
	}
}