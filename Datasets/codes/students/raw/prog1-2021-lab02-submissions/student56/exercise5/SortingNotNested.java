package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 * Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		while (a > b || b > c || a > c) {
			if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}
			if (a > c) {
				a = a + c;
				c = a - c;
				a = a - c;
			}
			if (b > c) {
				b = b + c;
				c = b - c;
				b = b - c;
			}
		}
		System.out.println(a + ", " + b + ", " + c);
		// TODO: put your code here

		scanner.close();
	}
}