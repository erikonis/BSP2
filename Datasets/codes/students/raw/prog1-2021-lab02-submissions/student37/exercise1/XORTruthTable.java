package lu.uni.programming1.lab2.exercise1;

import java.util.Scanner;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		Scanner scanner = new Scanner(System.in);
		boolean a, b;
		System.out.println("a = ");
		a = scanner.nextBoolean();
		System.out.println("b = ");
		b = scanner.nextBoolean();
		
		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		boolean f = (a ^ b) || (b ^ a);
		System.out.println("Results: ");
		System.out.println("f = " + f);

		scanner.close();
	}
}