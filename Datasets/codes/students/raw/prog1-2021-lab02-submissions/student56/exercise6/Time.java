package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h, min, sec;
		boolean format;

		System.out.println("Do you want to use the 12h format (true or false):");
		format = scanner.nextBoolean();
		System.out.println("Please enter a value for the hours:");
		h = scanner.nextInt();
		System.out.println("Please enter a value for the minutes:");
		min = scanner.nextInt();
		System.out.println("Please enter a value for the seconds:");
		sec = scanner.nextInt();

		displayTime(h, min, sec, format);

		sec = sec + 5;

		displayTime(h, min, sec, format);
		// TODO: put your code here
		// Hint: you can read whether we want to
		// use AM mode as a boolean using the
		// nextBoolean() method of Scanner

		scanner.close();
	}

	private static void displayTime(int h, int min, int sec, boolean format) {
		String tmpH = "", tmpMin = "", tmpSec = "",ending="";
		boolean pm=false;
		while (sec > 59) {
			sec = sec - 60;
			min++;
		}
		while (min > 59) {
			min = min - 60;
			h++;
		}
		if (format) {
			while (h > 12) {
				h = h - 12;
				pm=!pm;
			}
		} else {
			while (h >= 24) {
				h = h - 24;
			}
		}
		if (h < 10) {
			tmpH = "0" + h;
		} else {
			tmpH = "" + h;
		}
		if (min < 10) {
			tmpMin = ":0" + min;
		} else {
			tmpMin = ":" + min;
		}
		if (sec < 10) {
			tmpSec = ":0" + sec;
		} else {
			tmpSec = ":" + sec;
		}
		if(format){
			if(pm){
				ending="PM";
			}else{
				ending="AM";
			}
		}
		System.out.println(tmpH + tmpMin + tmpSec + ending);
	}
}
