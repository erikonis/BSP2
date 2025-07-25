package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int nr= scanner.nextInt();
		int n=nr;
		int sd=0;
		while(nr>0)
		{ sd+=nr%10;
			nr=nr/10;
		}
		String message= (sd%3==0)?"The number " + n + "is divisible by 3":"The number "+ n + "is not divisible  by 3";
		System.out.println(message);

		scanner.close();
	}
}