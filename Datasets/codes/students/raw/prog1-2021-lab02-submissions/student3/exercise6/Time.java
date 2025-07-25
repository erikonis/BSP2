package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hours:");
		int hours = scanner.nextInt();
		if (hours < 0 || hours > 24){
			System.out.print("it does not make sense:");
			return;
		}
		System.out.print("Enter the minutes:");
		int minutes = scanner.nextInt();
		if (minutes < 0 || minutes > 59){
			System.out.print("it does not make sense:");
			return;
		}
		System.out.print("Enter the seconds:");
		int seconds = scanner.nextInt();
		if (seconds < 0 || seconds > 59){
			System.out.print("it does not make sense:");
			return;
		}
		System.out.print("Enter the Format:");
		int Format = scanner.nextInt();
		if (Format != 12 && Format != 24){
			System.out.print("it does not make sense:");
			return;
		}
		if(Format==12 && hours>12){
			hours=hours-12;
		}
		String hoursdisplay=hours<10 ? "0" + hours:Integer.toString(hours);
		String minutesdisplay=minutes<10 ? "0" + minutes:Integer.toString(minutes);
		String secondsdisplay=seconds<10 ? "0" + seconds:Integer.toString(seconds);
        System.out.println(hoursdisplay +":"+ minutesdisplay +":"+ secondsdisplay);
		int totalseconds = hours * 60 * 60 + minutes * 60 + seconds;
		int newTimeSeconds = totalseconds + 5;
        int newHours = newTimeSeconds/ (60*60);
		newTimeSeconds = newTimeSeconds % (60*60);
		int newMintues = newTimeSeconds / 60;
		newTimeSeconds = newTimeSeconds % 60;
		int newSeconds = newTimeSeconds;
		System.out.println(newHours +":" + newMintues +":"+ newSeconds);


		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner

		scanner.close();
	}
}