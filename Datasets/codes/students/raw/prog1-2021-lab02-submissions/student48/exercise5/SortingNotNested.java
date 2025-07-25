package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 intergers numbers : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if ((b<=a)&&(a<=c)){
			System.out.println(b+ "≤" + a+ "≤" + c );	
			}
			else if ((c<=a)&&(a<=b)){
			System.out.println(c+ "≤" + a + "≤" + b );
			}
			else if ((a<=b)&&(b<=c)){
			System.out.println(a+ "≤" + b + "≤" + c );
			}
			else if ((c<=b)&&(b<=a)){
			System.out.println(c+ "≤" + b + "≤" + a );
			}
			else if ((b<=c)&&(c<=a)){
			System.out.println(b+ "≤" + c+ "≤" + a );	
			}
			else if ((a<=c)&&(c<=b)){
			System.out.println(b+ "≤" + c+ "≤" + a );
			}
		
		
		scanner.close();
	}
}