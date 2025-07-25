package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number,sum;
		System.out.println("enter your number");

		number = scanner.nextInt();
		for(sum=0 ;number!=0 ;number/=10)
	    {
		sum+=number%10;
		}
		System.out.println("the sum of the digits is "+sum);
		sum =sum%3;
		sum=(sum==0) ? 0:1;
		if (sum==0){
			System.out.println("your number is divisble by 3");
		}
		else {
			System.out.println("you number is not divisble by 3");
		}


		scanner.close();
	}
}