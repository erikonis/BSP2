package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO: put your code here

		System.out.print("Enter the first number: ");
		int a = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int b = scanner.nextInt();

		System.out.print("Enter the third number: ");
		int c = scanner.nextInt();

		if (b < a && a < c) {
			System.out.println(b + "\n" + a + "\n" + c);
		}
		else if (b < c && c < a) {
			System.out.println(b + "\n" + c + "\n" + a);
		}
		else if (c < b && b < c) {
			System.out.println(c + "\n" + b + "\n" + a);
		}
		else if (a < b && b < c ) {
			System.out.println(a + "\n" + b + "\n" + c);
		}
		else if (a < c && c < b) {
			System.out.println(a + "\n" + c + "\n" + b);
		}
		else {
			System.out.println(c + "\n" + a + "\n" + b);
		}
		
		scanner.close();
	}
}