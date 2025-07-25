package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;


public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer number with no more than 4 digits: ");

		int divisible = scanner.nextInt();

			int div1 = divisible % 10;
			int divisible1 = divisible / 10;
			int div2 = divisible1 % 10;
			int divisible2 = divisible1 / 10;
			int div3 = divisible2 % 10;
			int divisible3 = divisible2 / 10;
			int div4 = divisible3 % 10;
			

			int sum = div1 + div2 + div3 + div4;

			int sum2 = sum % 3;

			String answer = sum2==0?" is":" is not";

			System.out.println(divisible + answer + " divisible by 3");

			

		scanner.close();
	}
}