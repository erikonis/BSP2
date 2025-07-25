package lu.uni.programming1.lab2.exercise1;

import java.util.Set;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		boolean a;
		boolean b;
		boolean xor;

		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		a = true; b = true;
		xor = (a || b) && !(a && b);
		System.out.println(xor);
		System.out.println(a ^ b);

		System.out.println("-------------");

		a = false; b = false;
		xor = (a || b) && !(a && b);
		System.out.println(xor);
		System.out.println(a ^ b);

		System.out.println("-------------");

		a = true; b = false;
		xor = (a || b) && !(a && b);
		System.out.println(xor);
		System.out.println(a ^ b);

		System.out.println("-------------");

		a = false; b = true;
		xor = (a || b) && !(a && b);
		System.out.println(xor);
		System.out.println(a ^ b);
			
	}
}