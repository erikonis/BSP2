package lu.uni.programming1.lab2.ex1;

/**
 * Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TO DO: Define boolean variables a, b and xor
		boolean a, b;

		a = false;
		b = false;
		System.out.println("a=false; b=false;  ->  " + (a ^ b));

		a = false;
		b = true;
		System.out.println("a=false; b=true;  ->  " + (a ^ b));

		a = true;
		b = false;
		System.out.println("a=true;  b=false;  ->  " + (a ^ b));

		a = true;
		b = true;
		System.out.println("a=true; b=true;  ->  " + (a ^ b));

		// TO DO: for each combination of a and b
		// Change variables a and b
		// and set the xor variable according
		// to your formula f
		// then print the results
	}
}