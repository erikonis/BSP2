package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 * Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		int a, b, c, mid;

		System.out.println("Enter 1st number :");
		a = scanner.nextInt();
		System.out.println("Enter 2nd number :");
		b = scanner.nextInt();
		System.out.println("Enter 3rd number :");
		c = scanner.nextInt();
		mid = a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
		System.out.println("Numbers in ascending order :");
		System.out.println(Math.min(a, Math.min(b, c)) + "");
		System.out.println(mid + "");
		System.out.println(Math.max(a, Math.max(b, c)) + "");

		scanner.close();
	}
}