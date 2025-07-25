package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here

		System.out.print("Enter a number to check if it is divisible by 3: ");

		int number = scanner.nextInt();
		int numberToDivide = number;

		int sumOfNumbers = 0;

		while (numberToDivide > 0) {

			sumOfNumbers += numberToDivide%10;
			numberToDivide = numberToDivide/10;
			
		}

		int moduloThree = sumOfNumbers%3;

		 String isDivisible = (moduloThree == 0) ? " is divisible by three": " is not divisible by three";

		 System.out.println(number + isDivisible);

		scanner.close();
	}
}