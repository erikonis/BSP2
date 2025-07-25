package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		boolean a = true;
		boolean b = false;
		boolean xor;
		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results
		a = b;
		b = a;
		xor = (a && b) || (!a && !b);
		System.out.println(xor);

	}
}