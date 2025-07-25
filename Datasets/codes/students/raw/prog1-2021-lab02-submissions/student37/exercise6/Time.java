package lu.uni.programming1.lab2.exercise6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
		//			  nextBoolean() method of Scanner;
		LocalTime nowTime = LocalTime.now();
		String customTime1 = nowTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
		System.out.println("User defined pattern 1 (12 hr time): " + customTime1);
		String customTime2 = nowTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println("User defined pattern 2 (24 hr time): " + customTime2);

		System.out.println("New Time: " + nowTime.plusSeconds(5));

		scanner.close();
	}
}