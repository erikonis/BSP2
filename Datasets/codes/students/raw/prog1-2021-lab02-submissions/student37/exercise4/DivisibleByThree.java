package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		System.out.println("Enter a 4 digit number: ");
		int number = scanner.nextInt();
		
		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		String divisible =  (sum % 3 == 0) ? "Divisible by three." : "Not divisible by three.";
		System.out.println(divisible);
		
		scanner.close();
	}
}