package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;



/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer with up to 4 digits: ");

		int number = scanner.nextInt();

		int numberCopy = number;

		scanner.close();

		int sum = 0;

				sum = ( number > 0 ) ? (sum + (number % 10)) : sum;
					number = number / 10;
				
				sum = ( number > 0 ) ? (sum + (number % 10)) : sum;
					number = number / 10;
				
				sum = ( number > 0 ) ? (sum + (number % 10)) : sum;
					number = number / 10;
				
				sum = ( number > 0 ) ? (sum + (number % 10)) : sum;
					number = number / 10;
		
		System.out.println("Sum of Digits = " + sum);


		String reveal;

		reveal = (sum % 3 == 0) ? " is" : " isn't";

		System.out.println(sum + reveal + " divisble by 3, and thus " + numberCopy + reveal + " divisible by 3.");


			
	}
}