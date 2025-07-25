package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int digit;
		
		int variable = scanner.nextInt();

		while (variable>0){
			digit = variable % 10;
			sum = sum + digit;
			variable = variable / 10;
		}

		System.out.println(sum);

		if (sum % 3 == 0){
			System.out.println("divisible by 3");
		}

		scanner.close();
	}
}