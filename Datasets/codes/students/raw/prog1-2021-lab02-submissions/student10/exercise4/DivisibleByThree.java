package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		int number=scanner.nextInt();

		int sum=0;

		while(number>0){
			sum = sum +number%10;
			number = number/10;
		}
		System.out.println(sum);

		boolean isDivBy3 = (sum % 3==0) ? true : false;
		System.out.println("the number "+number+" divisability by 3 is "+isDivBy3);

		scanner.close();
	}
}