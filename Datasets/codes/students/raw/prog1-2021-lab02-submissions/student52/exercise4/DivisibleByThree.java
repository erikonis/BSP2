package lu.uni.programming1.lab2.exercise4;

import java.net.NetworkInterface;
import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		System.out.println("Please a number to be checked if it's divisible by 3: ");
		int num = scanner.nextInt();
		int tmp,sum = 0;

		while (num> 0){

			tmp = num % 10;
			sum = sum + tmp;
			num = num /10;

		}

		String result = (sum%3 == 0)? "The sum of your number is divisible by 3" : "The sum of your number is not divisible by 3";
		System.out.println(result);

		/*
		if (div == 0){
			System.out.println("The sum" + " (" + sum +") " + "of your number is divisible by 3");
		}
		else {
			System.out.println("The sum" + " (" + sum +") " + "of your number is not divisible by 3");
		}

		*/


		scanner.close();
	}
}