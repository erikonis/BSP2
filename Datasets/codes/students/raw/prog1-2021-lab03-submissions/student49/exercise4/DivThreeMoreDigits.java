package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivThreeMoreDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long temp = 0;
		long sum = 0;
		

		System.out.print("Please enter a number: ");
		long a = scanner.nextLong();

		while(a>0)	
		{
			temp = a%10;
			sum +=temp;
			a = a/10;
		}

		System.out.println(sum%3==0 ? "true" : "false");

		scanner.close();
	}
}