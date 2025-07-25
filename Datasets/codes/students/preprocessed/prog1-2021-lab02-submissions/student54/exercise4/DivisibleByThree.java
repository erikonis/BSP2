package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int digit = 0;

		System.out.println("Please enter the number :");
		int a = scanner.nextInt();

		// TODO: put your code here
		while(a > 0){
			digit = a % 10;
			sum += digit;
			a = a/10;
		}

		System.out.println(sum % 3 == 0 ? "true" : "false");

		scanner.close();
	}
}