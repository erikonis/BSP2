package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO: put your code here
		
		System.out.print("Enter 1st number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int num3 = scanner.nextInt();
		
		if (num1 < num2 && num2 < num3) {
			System.out.printf("%d < %d < %d", num1, num2, num3);
		} 
		else if (num1 < num3 && num3 < num2) {
			System.out.printf("%d < %d < %d", num1, num3, num2);
		} 
		else if (num2 < num1 && num1 < num3) {
			System.out.printf("%d < %d < %d", num2, num1, num3);
		} 
		else if (num2 < num3 && num3 < num1) {
			System.out.printf("%d < %d < %d", num2, num3, num1);
		} 
		else if (num3 < num1 && num1 < num2) {
			System.out.printf("%d < %d < %d", num3, num1, num2);
		} 
		else {
			System.out.printf("%d < %d < %d", num3, num2, num1);
		}
		
		scanner.close();
	}
}