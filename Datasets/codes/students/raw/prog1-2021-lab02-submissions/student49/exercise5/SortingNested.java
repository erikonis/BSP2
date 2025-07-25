package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.print("c = ");
		int c = scanner.nextInt();

		if(a < b) {
			if(b < c) {
				System.out.println(a + " <= " + b + " <= " + c);
			} else {
				if(a < c) {
					System.out.println(a + " <= " + c + " <= " + b);
				} else {
					System.out.println(c + " <= " + a + " <= " + b);
				}
			}
		} else {
			if(c < b) {
				System.out.println(c + " <= " + b + " <= " + a);
			} else {
				if(a < c) {
					System.out.println(b + " <= " + a + " <= " + c);
				} else {
					System.out.println(b + " <= " + c + " <= " + a);
				}
			}
		}
		
		scanner.close();
	}
}