import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hours =  scanner.nextInt();
		int minute =  scanner.nextInt();
		int seconds =  scanner.nextInt();
		System.out.println("Is your time format 24 (Answer with true or false)");
		boolean clock = scanner.nextBoolean();
		System.out.println("Are you in PM (Answer with true or false)");
		boolean AMPM = scanner.nextBoolean();
		
		if (clock == true){
			if (hours >= 0 && hours <= 23 && minute >= 0 && minute <= 59 && seconds >= 0 && seconds <= 59){
				if (hours < 10 && minute < 10 && seconds < 10){
					System.out.println("0" + hours + ":0" + minute + ":0" + seconds);
				}
				else if (hours < 10){
					if (hours < 10 && minute < 10){
						System.out.println("0" + hours + ":0" + minute + ":" + seconds);
					}
					else if (hours < 10 && seconds < 10){
						System.out.println("0" + hours + ":" + minute + ":0" + seconds);   
					}
					else {
						System.out.println("0" + hours + ":" + minute + ":" + seconds);
					}
				}
				else if (minute < 10){
					System.out.println(hours + ":0" + minute + ":" + seconds);
				}
				else if (seconds < 10){
					System.out.println(hours + ":" + minute + ":0" + seconds);
				}
				else{
					System.out.println(hours + ":" + minute + ":" + seconds);
				}

			}
			else{
				System.out.println("One of your input is false");	
			}
		}
		else{

			if (AMPM == true){
			if (hours >= 0 && hours <= 12 && minute >= 0 && minute <= 59 && seconds >= 0 && seconds <= 59){
				if (hours < 10 && minute < 10 && seconds < 10){
					System.out.println("0" + hours + ":0" + minute + ":0" + seconds+ "PM");
				}
				else if (hours < 10){
					if (hours < 10 && minute < 10){
						System.out.println("0" + hours + ":0" + minute + ":" + seconds + "PM");
					}
					else if (hours < 10 && seconds < 10){
						System.out.println("0" + hours + ":" + minute + ":0" + seconds + "PM");   
					}
					else {
						System.out.println("0" + hours + ":" + minute + ":" + seconds + "PM");
					}
				}
				else if (minute < 10){
					System.out.println(hours + ":0" + minute + ":" + seconds + "PM");
				}
				else if (seconds < 10){
					System.out.println(hours + ":" + minute + ":0" + seconds + "PM");
				}
				else{
					System.out.println(hours + ":" + minute + ":" + seconds + "PM");
				}
		}
		else{
			System.out.println("One of your input is false");		
		}

	}
	else{
		if (hours >= 0 && hours <= 12 && minute >= 0 && minute <= 59 && seconds >= 0 && seconds <= 59){
			if (hours < 10 && minute < 10 && seconds < 10){
				System.out.println("0" + hours + ":0" + minute + ":0" + seconds + "AM");
			}
			else if (hours < 10){
				if (hours < 10 && minute < 10){
					System.out.println("0" + hours + ":0" + minute + ":" + seconds + "AM");
				}
				else if (hours < 10 && seconds < 10){
					System.out.println("0" + hours + ":" + minute + ":0" + seconds + "AM");   
				}
				else {
					System.out.println("0" + hours + ":" + minute + ":" + seconds + "AM");
				}
			}
			else if (minute < 10){
				System.out.println(hours + ":0" + minute + ":" + seconds + "AM");
			}
			else if (seconds < 10){
				System.out.println(hours + ":" + minute + ":0" + seconds + "AM");
			}
			else{
				System.out.println(hours + ":" + minute + ":" + seconds + "AM");
			}
	}
	else{
		System.out.println("One of your input is false");		
	}
	}
	}
	System.out.println("New time");
	seconds = 5 + seconds;
		if(clock == true){
		if(seconds > 59){
			minute += 1;
			seconds = seconds - 60;
			if(minute > 59){
				minute = 0;
				hours += 1;
				if (hours > 23){
					hours = 0;
				}
			}
		}
		if (hours >= 0 && hours <= 23 && minute >= 0 && minute <= 59 && seconds >= 0 && seconds <= 59){
			if (hours < 10 && minute < 10 && seconds < 10){
				System.out.println("0" + hours + ":0" + minute + ":0" + seconds);
			}
			else if (hours < 10){
				if (hours < 10 && minute < 10){
					System.out.println("0" + hours + ":0" + minute + ":" + seconds);
				}
				else if (hours < 10 && seconds < 10){
					System.out.println("0" + hours + ":" + minute + ":0" + seconds);   
				}
				else {
					System.out.println("0" + hours + ":" + minute + ":" + seconds);
				}
			}
			else if (minute < 10){
				System.out.println(hours + ":0" + minute + ":" + seconds);
			}
			else if (seconds < 10){
				System.out.println(hours + ":" + minute + ":0" + seconds);
			}
			else{
				System.out.println(hours + ":" + minute + ":" + seconds);
			}
	}
}
	else{
		if (AMPM == true){
			if(seconds > 59){
				minute += 1;
				seconds = seconds - 60;
				if(minute > 59){
					minute = 0;
					hours += 1;
					if (hours > 12){
						hours = 0;
					}
				}
			}
			if (hours >= 0 && hours <= 12 && minute >= 0 && minute <= 59 && seconds >= 0 && seconds <= 59){
				if (hours < 10 && minute < 10 && seconds < 10){
				System.out.println("0" + hours + ":0" + minute + ":0" + seconds + "PM");
			}
			else if (hours < 10){
				if (hours < 10 && minute < 10){
					System.out.println("0" + hours + ":0" + minute + ":" + seconds + "PM");
				}
				else if (hours < 10 && seconds < 10){
					System.out.println("0" + hours + ":" + minute + ":0" + seconds + "PM");   
				}
				else {
					System.out.println("0" + hours + ":" + minute + ":" + seconds + "PM");
				}
			}
			else if (minute < 10){
				System.out.println(hours + ":0" + minute + ":" + seconds + "PM");
			}
			else if (seconds < 10){
				System.out.println(hours + ":" + minute + ":0" + seconds + "PM");
			}
			else{
				System.out.println(hours + ":" + minute + ":" + seconds + "PM");
			}	
	}
	
		}
		else{
			if(seconds > 59){
				minute += 1;
				seconds = seconds - 60;
				if(minute > 59){
					minute = 0;
					hours += 1;
					if (hours > 12){
						hours = 0;
					}
				}
			}
			if (hours >= 0 && hours <= 12 && minute >= 0 && minute <= 59 && seconds >= 0 && seconds <= 59){
				if (hours < 10 && minute < 10 && seconds < 10){
					System.out.println("0" + hours + ":0" + minute + ":0" + seconds + "AM");
				}
				else if (hours < 10){
					if (hours < 10 && minute < 10){
						System.out.println("0" + hours + ":0" + minute + ":" + seconds + "AM");
					}
					else if (hours < 10 && seconds < 10){
						System.out.println("0" + hours + ":" + minute + ":0" + seconds + "AM");   
					}
					else {
						System.out.println("0" + hours + ":" + minute + ":" + seconds + "AM");
					}
				}
				else if (minute < 10){
					System.out.println(hours + ":0" + minute + ":" + seconds + "AM");
				}
				else if (seconds < 10){
					System.out.println(hours + ":" + minute + ":0" + seconds + "AM");
				}
				else{
					System.out.println(hours + ":" + minute + ":" + seconds + "AM");
				}
	}
	scanner.close();	
}	
}
		}
	}

