package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert value:");
		long variable = scanner.nextLong();

		long sum = 0;
		long digit;
		//calculate sum of digits of variable
		while (variable>0){
			//take first digit of variable
			digit = variable % 10;
			sum += digit;
			//drop first digit from variable
			variable /= 10;
		}

		System.out.println(sum);
		//print if number is divisible by 3 
		System.out.println("Divisible by 3: " + (sum%3==0));
		scanner.close();
	}
}
