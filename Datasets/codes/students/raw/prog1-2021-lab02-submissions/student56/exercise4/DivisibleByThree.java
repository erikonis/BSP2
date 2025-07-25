package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 * Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// put your code here
		System.out.println("Please enter a number:");
		int nbr = scanner.nextInt();
		int displaynbr = nbr;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum = sum + nbr % 10;
			nbr = nbr / 10;
		}

		System.out.println(
				sum % 3 == 0 ? displaynbr + " est divisible par 3." : displaynbr + " n'est pas divisible par 3.");

		scanner.close();
	}
}