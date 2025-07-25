package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		int digits = 0;
		while (number != 0) {
			int currentLastDigit = number % 10;
			digits += currentLastDigit;
			number = number - currentLastDigit;
			number = number / 10;
		}
		if (digits % 3 == 0) {
			System.out.print("Given number is divisible by 3");
		} else {
			System.out.print("Given number is not divisible by 3");
		}
		scanner.close();
	}
}