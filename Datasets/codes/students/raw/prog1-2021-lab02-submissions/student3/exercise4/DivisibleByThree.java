package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		int firstdigit,sum,input = 0;
		sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the digit:");

		// Reading the road type id from standard input
	    input = scanner.nextInt();
		while(input>0){
		firstdigit= input % 10;
		sum = sum + firstdigit;
		input= input / 10;
		}
		System.out.println("Sum of Digits: " + sum);
        String result=	(sum%3==0)? ("Yes it is divisble by 3."): ("NO.");
		System.out.println(result);
		// TODO: put your code here
		
		

		scanner.close();
	}
}