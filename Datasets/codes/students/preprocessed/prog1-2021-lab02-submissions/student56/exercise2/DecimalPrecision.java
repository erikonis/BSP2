package lu.uni.programming1.lab2.exercise2;

import java.util.Scanner;

/**
 * Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// Define two decimal numbers per type float and double
		double a, b;
		float c, d;
		Scanner scanner = new Scanner(System.in);
		// make assign a very small and large value per type
		System.out.println("Enter 2 small numbers: ");
		a = scanner.nextDouble();
		c = scanner.nextFloat();
		System.out.println("Enter 2 large numbers: ");
		b = scanner.nextDouble();
		d = scanner.nextFloat();
		// try to add them respectively and print out the value
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(c + " + " + d + " = " + (c + d));
		scanner.close();
	}
}