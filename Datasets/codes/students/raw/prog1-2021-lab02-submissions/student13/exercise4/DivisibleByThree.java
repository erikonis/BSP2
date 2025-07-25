package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here

		int number;
		int sumOfNumbers =0;
		System.out.println("Please put in the number you want to check: ");
		number = scanner.nextInt();

		while(number > 0)
		{
			sumOfNumbers =  sumOfNumbers + number%10;
			number = number/10;

			if(sumOfNumbers >10)
			{
				int tmp1 = sumOfNumbers%10;
				int tmp2 = sumOfNumbers/10;
				sumOfNumbers = tmp1 + tmp2;
			}
		}

		switch(sumOfNumbers)
		{
			case 3, 6, 9:

			System.out.println("Yes the number you chose is divisible by 3!");
			break;

			default:
			System.out.println("The number you chose isn't divisible by 3!");
		}

		scanner.close();
	}
}