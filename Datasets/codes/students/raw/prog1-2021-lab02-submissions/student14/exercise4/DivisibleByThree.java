package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TO DO: put your code here
		System.out.print("Enter a number :");
		int num = scanner.nextInt();
		int sumOfDigits = 0;
		while (num != 0) {
			int currentLastDigit = num % 10;
			sumOfDigits += currentLastDigit;
			num = num - currentLastDigit;
			num = num / 10;
		}
		/* System.out.println(sumOfDigits); */
		if (sumOfDigits % 3 == 0) {
			System.out.print("The number is divisible by three");
		} else {
			System.out.print("The number is not divisible by three");
		}

		scanner.close();
	}
}