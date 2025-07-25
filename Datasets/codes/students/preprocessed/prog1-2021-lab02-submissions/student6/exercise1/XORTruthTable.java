package lu.uni.programming1.lab2.exercise1;

/**
 * Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// Define boolean variables a, b and xor

		// for each combination of a and b
		// Change variables a and b
		// and set the xor variable according
		// to your formula f
		// then print the results

		boolean a = true;
		boolean b = true;
		boolean myXOR = a ^ b;
		System.out.println("true XOR true: " + myXOR);

		a = false;
		b = true;
		myXOR = a ^ b;
		System.out.println("false XOR true: " + myXOR);

		a = true;
		b = false;
		myXOR = a ^ b;
		System.out.println("true XOR false: " + myXOR);
		
		a = false;
		b = false;
		myXOR = a ^ b;
		System.out.println("false XOR false: " + myXOR);

	}
}