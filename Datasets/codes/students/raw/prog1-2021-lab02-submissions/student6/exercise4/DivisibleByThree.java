package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 * Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int a, b, c, d;
		int sum;
		boolean divisible = true;
		System.out.println("Please type a value: ");
		number = scanner.nextInt();

		a = number % 10;
		b = number / 10 % 10;
		c = number / 100 % 10;
		d = number / 1000 % 10;
		sum = a + b + c + d;
		System.out.println("Sum of " + number + " is = " + sum);

		if (number <= 9999 && number > 0) {
			divisible = (sum % 3 == 0);
			System.out.println("Is " + sum + "  divisible by 3: " + divisible);
		} else {
			System.out.println("Please type a positive number with 4 digits not more.");
		}

		scanner.close();
	}
}