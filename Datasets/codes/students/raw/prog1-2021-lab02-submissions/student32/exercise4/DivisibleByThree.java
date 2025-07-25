package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here

		System.out.print("Please enter a number of at most 4 digits: ");
		int number = scanner.nextInt();
		
		//calculating sum of digits
		int sum = 0;

		//value of first digit added to sum
		sum += number % 10;
		//number loses 1st digit and 2nd now is 1st digit etc. e.g. 2336 → 233
		number = (number - number % 10) / 10;
		
		sum += number % 10;
		number = (number - number % 10) / 10;
		
		sum += number % 10;
		number = (number - number % 10) / 10;
		
		sum += number % 10;
		number = (number - number % 10) / 10;
		
		String result = (sum % 3 == 0) ? "The number you entered is divisible by three." : "The number you entered is not divisible by three";

		System.out.println(result);

		scanner.close();
	}
}