package lu.uni.programming1.lab2.exercise4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp = 0;
		int sum = 0;
		

		System.out.print("Please enter a number: ");
		int a = scanner.nextInt();

		while(a>0)	
		{
			temp = a%10;
			sum +=temp;
			a = a/10;
		}

		System.out.println(sum%3==0 ? "true" : "false");
 
		// TODO: put your code here

		scanner.close();
	}
}