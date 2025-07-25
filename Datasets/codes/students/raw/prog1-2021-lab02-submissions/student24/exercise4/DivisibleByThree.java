package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		int sum=0;
		String tempNumber = Integer.toString(number);
		for (int i = 0; i < (4-tempNumber.length()); i++) {
			tempNumber = "0" + tempNumber;
		}
		for (int i = 0; i < 4; i++) {
			char temp = tempNumber.charAt(i);
			sum += Integer.valueOf(""+temp);
		}
		String output = sum%3==0 ? "The number is divisible by 3" : "The number is not divisible by 3";
		System.out.println(output);
		scanner.close();
	}
}