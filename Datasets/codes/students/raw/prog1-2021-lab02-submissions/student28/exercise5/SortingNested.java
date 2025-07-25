package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input 1st number");
		int number1 = scanner.nextInt();
		System.out.println("input 2nd number");
		int number2 = scanner.nextInt();
		System.out.println("input 3rd number");
		int number3 = scanner.nextInt();
		// TODO: put your code here
		// 		Hint: "Nested Ifs" means "if" conditions inside the body of other "if" conditions  
		if (number1 > number2){
			if (number2 > number3){
				System.out.println(number1 + "\n" + number2 + "\n" + number3);
			}
		}
		if (number1 > number3){
			if (number3 > number2){
				System.out.println(number1 + "\n" + number3 + "\n" + number2);
			}
		}
		if (number2 > number1) {
			if (number1 > number3) {
				System.out.println(number2 + "\n" + number1 + "\n" + number3);
			}
		}
		if (number2 > number3){
			if(number3 > number1){
				System.out.println(number2 + "\n" + number3 + "\n" + number1);
			}
		}
		if (number3 > number1){
			if (number1 > number2){
				System.out.println(number3 + "\n" + number1 + "\n" + number2);
			}
		}
		if (number3 > number2){
			if ( number2 > number1){
				System.out.println(number3 + "\n" + number2 + "\n" + number1);
			}
		}
		
		scanner.close();
	}
}