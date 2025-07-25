package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 * Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b || a > c || b > c) {

			if (b > c) {
				b = b + c;
				c = b - c;
				b = b - c;
			} else if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			} else if (a > c) {
				a = a + c;
				c = a - c;
				a = a - c;
			} else if (b > c) {
				b = b + c;
				c = b - c;
				b = b - c;
			}
		}
		System.out.println(a + ", " + b + ", " + c);
		// TODO: put your code here
		// Hint: "Nested Ifs" means "if" conditions inside the body of other "if"
		// conditions

		scanner.close();
	}
}