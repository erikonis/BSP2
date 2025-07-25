package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of seconds: ");
		int sec = 70;
		while(sec < 0 || sec > 60){
			sec = scanner.nextInt();
		}
		

		System.out.print("Please enter the number of minutes: ");
		int min = 70;
		while(min < 0 || min > 60){
			min = scanner.nextInt();
		}
		
		System.out.print("Please specify the clock format (for 24h type 0 and for 12h type, 1): ");
		int format = scanner.nextInt();

		System.out.print("Please enter the number of hours: ");
		int hour = 70;
		if(format == 0){
			while(hour < 0 || hour > 24){
				hour = scanner.nextInt();
				}
		}else{
			while(hour < 0 || hour > 12){
				hour = scanner.nextInt();
			}
		}



		if(format == 0){
			if(hour < 10 && min < 10 && sec < 10){
				System.out.print("0" + hour + ":0" + min + ":0" +sec);
			}else if(hour < 10 && min < 10){
				System.out.print("0" + hour + ":0" + min + ":" +sec);
			}else if(hour < 10){
				System.out.print("0" + hour + ":" + min + ":" +sec);
			}else if(min < 10 && sec < 10){
				System.out.print("" + hour + ":0" + min + ":0" +sec);
			}else if(sec < 10){
				System.out.print("" + hour + ":" + min + ":0" +sec);
			}else if(min < 10){
				System.out.print("" + hour + ":0" + min + ":" +sec);
			}else if(hour < 10 && sec < 10){
				System.out.print("0" + hour + ":" + min + ":0" +sec);
			System.out.print("\n");
			}else{
				System.out.print(+ hour + ":" + min + ":" +sec);
				System.out.print("\n");
			}
			
		}else{
			System.out.print("Please specify if it's AM or PM : ");
			String form = scanner.next();
			if(hour < 10 && min < 10 && sec < 10){
				System.out.print("0" + hour + ":0" + min + ":0" +sec +" "+ form);
			}else if(hour < 10 && min < 10){
				System.out.print("0" + hour + ":0" + min + ":" +sec +" "+ form);
			}else if(hour < 10){
				System.out.print("0" + hour + ":" + min + ":" +sec +" "+ form);
			}else if(min < 10 && sec < 10){
				System.out.print("" + hour + ":0" + min + ":0" +sec +" "+ form);
			}else if(sec < 10){
				System.out.print("" + hour + ":" + min + ":0" +sec +" "+ form);
			}else if(min < 10){
				System.out.print("" + hour + ":0" + min + ":" +sec +" "+ form);
			}else if(hour < 10 && sec < 10){
				System.out.print("0" + hour + ":" + min + ":0" +sec +" "+ form);
			}else{
				System.out.print(+ hour + ":" + min + ":" +sec +" "+ form);
				System.out.print("\n");
			}
			
		}

		sec = sec + 5;
		if(sec / 59 >= 1){
			sec = sec-60;
			min = min + 1;

			if(min / 59 >= 1){
				min = min- 60;
				hour = hour + 1;
				
				if(format == 0 && hour / 23 >= 1 || format == 1 && hour / 12 >= 1){
					hour = 0;
			}
			}
		}
		if(format == 0){
			System.out.print("Time plus 5 seconds :\n");
			if(hour < 10 && min < 10 && sec < 10){
				System.out.print("0" + hour + ":0" + min + ":0" +sec);
			}else if(hour < 10 && min < 10){
				System.out.print("0" + hour + ":0" + min + ":" +sec);
			}else if(hour < 10){
				System.out.print("0" + hour + ":" + min + ":" +sec);
			}else if(min < 10 && sec < 10){
				System.out.print("" + hour + ":0" + min + ":0" +sec);
			}else if(sec < 10){
				System.out.print("" + hour + ":" + min + ":0" +sec);
			}else if(min < 10){
				System.out.print("" + hour + ":0" + min + ":" +sec);
			}else if(hour < 10 && sec < 10){
				System.out.print("0" + hour + ":" + min + ":0" +sec);
			}else{
				System.out.print(+ hour + ":" + min + ":" +sec);
				System.out.print("\n");
			}
			
		}else{
			System.out.print("\nPlease specify if it's AM or PM : ");
			String form = scanner.next();
			System.out.print("Time plus 5 seconds :\n");
			if(hour < 10 && min < 10 && sec < 10){
				System.out.print("0" + hour + ":0" + min + ":0" +sec +" "+ form);
			}else if(hour < 10 && min < 10){
				System.out.print("0" + hour + ":0" + min + ":" +sec +" "+ form);
			}else if(hour < 10){
				System.out.print("0" + hour + ":" + min + ":" +sec +" "+ form);
			}else if(min < 10 && sec < 10){
				System.out.print("" + hour + ":0" + min + ":0" +sec +" "+ form);
			}else if(sec < 10){
				System.out.print("" + hour + ":" + min + ":0" +sec +" "+ form);
			}else if(min < 10){
				System.out.print("" + hour + ":0" + min + ":" +sec +" "+ form);
			}else if(hour < 10 && sec < 10){
				System.out.print("0" + hour + ":" + min + ":0" +sec +" "+ form);
			}else{
				System.out.print(+ hour + ":" + min + ":" +sec +" "+ form);
				System.out.print("\n");
			}
			
		}
		scanner.close();
		}
	}