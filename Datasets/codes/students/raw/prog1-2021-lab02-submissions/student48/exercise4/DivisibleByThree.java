package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Can you write a random number between 0 and 9999 please :");
		int a = scanner.nextInt();
		
		//Find digits
		int d1 =  a%10;
		int d2 = (a/10)%10;
		int d3 = (a/100)%10;
		int d4 = (a/1000)%10; 

		// Modulo the sum of the digits
		String out;
		int b = (d1+d2+d3+d4)% 3;
		int c = 0;
		
		out = b==c ? "TRUE " : " FALSE " ;
		System.out.println("The sum of the digits can be divided by 3 : " + out );
	
		scanner.close();
	}
}