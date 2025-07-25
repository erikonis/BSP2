package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int digit = 0 ;

		// TODO: put your code here
		System.out.println("enter the number : ");
		int number = scanner.nextInt();
		
		while (number > 0 ) { 
		digit = number % 10;
		sum = sum + digit;
		number = number / 10;
	      }
		  int DI = sum % 3;
      String D = ( DI == 0) ? "Divisible":"not Divisible";
	  System.out.println("the number is " + D + " by three.");


		scanner.close();
	}
}