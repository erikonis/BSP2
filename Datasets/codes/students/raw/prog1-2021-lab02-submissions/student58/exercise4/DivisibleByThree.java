package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 * Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x, sum;
		sum = 0;

		System.out.print("Enter x: ");
		x = scanner.nextInt();

		while (x > 0 && x < 10000) {
			sum = sum + x % 10;
			x = x / 10;
		}

		System.out.println("The sum is " + sum + ".");

		boolean isDivisibleBy3 = (sum % 3 == 0) ? true : false;

		System.out.println("This sum is divisible by 3: " + isDivisibleBy3 + ".");

		scanner.close();
	}
}