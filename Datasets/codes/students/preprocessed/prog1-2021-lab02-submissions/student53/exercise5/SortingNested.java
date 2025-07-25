package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Asks for input of 3 numbers
		System.out.println("Enter the first number to be sorted");
		int num1 = scanner.nextInt();
		System.out.println("Now enter the second number to be sorted");
		int num2 = scanner.nextInt();
		System.out.println("Finally enter the last number to be sorted");
		int num3 = scanner.nextInt();

		// Sorts the 3 numbers
		if(num1 < num2 && num1 < num3){
			if(num2 < num3){
				System.out.println(num1 + ", " + num2 + ", " + num3);
			}
			else{
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		}else if(num2 < num3){
			if(num1 < num3){
				System.out.println(num2 + ", " + num1 + ", " + num3);
			}
			else{
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}else{
			if(num1 < num2){
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}
			else{
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}
		}

		scanner.close();
	}
}
