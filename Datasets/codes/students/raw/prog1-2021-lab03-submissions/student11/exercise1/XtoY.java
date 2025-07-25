package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;
		
		int y;

		double d;
		
		System.out.println("Please enter a value for x:");
		x = scanner.nextInt();

		System.out.println("Please enter a value for y:");
		y = scanner.nextInt();

		System.out.println("Please enter a value for d:");
		d = scanner.nextDouble();


		for(double i = x; i <=y ; i += d) {

			System.out.println(i);

		}

		scanner.close();
	}
}