package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your number: ");
		
		
		 int mynumber = scanner.nextInt();

		 int sum = 0;

		 int digit = 0;

	   while (0 < mynumber) {
	   
		digit = mynumber % 10;

		sum = sum + digit;

		mynumber = mynumber / 10;
	   }

	 System.out.println("Here's the sum of the number's digits " + sum);

	 int remainder = sum % 3;
	
	String isit;

	isit = remainder > 0 ? "not divisable":"divisable" ;

	 System.out.println("The sum of the digits of that number is " + isit + " by 3 since the value of the remainder is: " + remainder);
		
	 System.out.println("Therefore, " + mynumber + " is " + isit + " by 3");

		scanner.close();
	}
}