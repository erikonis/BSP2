package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		boolean a,b,xor, xorop;

		// a = false; b = false; xor = (a||b)&&(!(a&&b)); xorop = a ^ b;
		// a = false; b = true; xor = (a||b)&&(!(a&&b)); xorop = a ^ b;
		// a = true; b = false; xor = (a||b)&&(!(a&&b)); xorop = a ^ b;
		a = true; b = true; xor = (a||b)&&(!(a&&b)); xorop = a ^ b;

		System.out.println("\nXOR : " + xorop + "\nFormula : " + xor);
		
	}
}