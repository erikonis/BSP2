package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input time format\n1: 24h \n2: 12h \n");
		byte format = scanner.nextByte();
		if (format != 1 && format != 2){
			System.out.println("invalid input");
			System.exit(0);
		}

		System.out.println("input time (hour)");
		byte hour = scanner.nextByte();
		if (hour >= (24/format)){
			System.out.println("invalid input (allowed input goes up to " + (24/format-1) + " for this format)");
			System.exit(0);
		}

		String ampm = "";
		if (format == 2){
			System.out.print("1) AM\n2) PM");
			Byte answer = scanner.nextByte();
			if (answer == 1){
				ampm = "AM";
			}else if (answer == 1){
				ampm = "PM";
			} else {
				System.out.println("invalid input (allowed input: AM; PM)");
				System.exit(0);
			}	
		}
		

		System.out.println("input time (minute)");
		byte minute = scanner.nextByte();
		if (minute >= 60){
			System.out.println("invalid input (allowed input goes up to 59)");
			System.exit(0);
		}

		System.out.println("input time (second)");
		byte second = scanner.nextByte();

		byte timeskip = 0;
	
		scanner.close();

		while (format < 3){
			while (hour < (24/format)){
				while (minute < 60){
					while (second < 60){
						if (timeskip == 0){
							System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second) + " " + ampm);
							TimeUnit.SECONDS.sleep(1);
						} else {
							timeskip--;
						}
						second++;
					}
					minute++;
					second = 0;
				}
				hour++;
				minute=0;
			}	
			hour = 0;
			if (ampm == "AM"){
				ampm = "PM";
			} else if (ampm == "PM"){
				ampm = "AM";
			}
		}		
	}
}