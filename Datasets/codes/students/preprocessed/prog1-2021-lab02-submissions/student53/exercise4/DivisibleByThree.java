package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Asks for number to be checked
		System.out.println("Enter the number you want to check:");
		int num = scanner.nextInt();
		int temp = num;

		// Calculates the sum of digits
		int sum = 0;
		while(num > 0){
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		
		// Checks if sum of digits is divisible by 3 and outputs result
		String result = (sum % 3 == 0) ? "Number " + temp + "is divisible by 3" : "Number " + temp + " is not divisible by 3";
		System.out.println(result);
		scanner.close();
	}
}
