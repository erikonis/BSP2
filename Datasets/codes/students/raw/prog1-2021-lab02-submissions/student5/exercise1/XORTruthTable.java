package lu.uni.programming1.lab2.exercise1;

import java.util.Scanner;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// DoneTODO: Define boolean variables a, b and xor
		System.out.println("boolean a (true/false):");
		boolean a = scanner.nextBoolean();
		System.out.println("boolean b (true/false):");
		boolean b = scanner.nextBoolean();
		boolean xor = (a && !b) || (!a && b);
		System.out.println("XOR truth: " + xor);
		xor = a ^ b;
		System.out.println("verification: " + xor);
		

		// DoneTODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		scanner.close();
	}
}