package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 * Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		int number;
		int save;
		int sum = 0;
		String result;

		System.out.println("Enter your number :");
		number = scanner.nextInt();
		save = number;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;

		}
		result = (sum % 3 == 0) ? "Yes the number " + save + " is divisible by 3"
				: "No the number " + save + " is not divisible by 3";
		System.out.println(result);

		scanner.close();
	}
}