package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		int h = scanner.nextInt();

		System.out.println("Enter the hour");

		int m = scanner.nextInt();

		System.out.println("Enter the minute");

		int s = scanner.nextInt();

		System.out.println("Enter the second");

		int hour= (h>=0 && h<24) ? h:0 ;
		int minute = (m>=0 && m<60) ? m:0 ;
		int second = (s>=0 && s<60) ? s:0 ;

		System.out.printf("%02d : %02d : %02d"+ hour,minute,second);
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner

		scanner.close();
	}
}