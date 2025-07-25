package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		boolean a = false, b = false;
		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		//Formula = (a && b)||(!a && !b)
		boolean xor;
		
		//Line 1
		xor = (a && b)||(!a && !b);
		System.out.println(xor);

		//Line 2
		a = false; b = true;
		xor = (a && b)||(!a && !b);
		System.out.println(xor);

		//Line 3
		a = true; b = false;
		xor = (a && b)||(!a && !b);
		System.out.println(xor);
		
		//Line 4
		a = true; b = true;
		xor = (a && b)||(!a && !b);
		System.out.println(xor);

	}
}