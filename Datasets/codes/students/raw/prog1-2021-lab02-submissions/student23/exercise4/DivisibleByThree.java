package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		System.out.println("Enter an integer (between -9999 & and 9999)");
		int nb = scanner.nextInt();

		nb = Math.min(nb, 9999); nb = Math.max(nb, -9999);//avoid having 5 digit number

		int d1, d2, d3, d4;
//exemple :  1   9   8   5   <- 1991

		//Calculating each digit
		int temp = nb;
		d4 = temp % 10; temp/=10;// x % 10 returns the unit digit of x, divide by 10 and start over to get the next digit etc etc..
		d3 = temp%10; temp /=10;
		d2 = temp%10; temp/=10;
		d1 = temp%10; temp/= 10;
		
		//Sum and check
		int sum = d1 + d2 + d3 + d4;

		String msg = (sum%3 == 0) ? " is divisible by three." : " is not divisible by three";

		//Display
		System.out.println(nb + msg);

		scanner.close();
	}
}