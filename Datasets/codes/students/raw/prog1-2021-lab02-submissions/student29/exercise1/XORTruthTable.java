package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// part 1
	boolean a, b, xor;
		// part 2
	a = false; b = false;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	a = false; b = true;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	a = true; b = false;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	a = true; b = true;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

		// part 3
	System.out.println("Now with the built-in java XOR operator: ");
	a = false; b = false;
	System.out.print("xor = "); System.out.println(a^b);

	a = false; b = true;
	System.out.print("xor = "); System.out.println(a^b);

	a = true; b = false;
	System.out.print("xor = "); System.out.println(a^b);

	a = true; b = true;
	System.out.print("xor = "); System.out.println(a^b);
	}
}