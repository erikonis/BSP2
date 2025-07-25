package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO: put your code here
		// 		Hint: "Nested Ifs" means "if" conditions inside the body of other "if" conditions  
		
		System.out.print("Enter the first number: ");
		int a = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int b = scanner.nextInt();

		System.out.print("Enter the third number: ");
		int c = scanner.nextInt();

		if (a>b) {
			if (c>a) {
				System.out.println(b + "\n" + a + "\n" + c);
			}
			else if (b < c) {
				System.out.println(b + "\n" + c + "\n" + a);
			}
			else {
				System.out.println(c + "\n" + b + "\n" + a);
			}
		} else {
			if (c>b) {
				System.out.println(a + "\n" + b + "\n" + c);
			}
			else if (a < c) {
				System.out.println(a + "\n" + c + "\n" + b);
			}
			else {
				System.out.println(c + "\n" + a + "\n" + b);
			}
		}
		
		scanner.close();
	}
}