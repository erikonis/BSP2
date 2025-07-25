package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		boolean a, b, xor;

		System.out.println("a\tb\ta (xor) b");
		
		a = false; b = false; xor = (!a && b) || (a && !b);
		System.out.println(a + "\t" + b + "\t" + xor);
		a = false; b = true; xor = (!a && b) || (a && !b);
		System.out.println(a + "\t" + b + "\t" + xor);
		a = true; b = false; xor = (!a && b) || (a && !b);
		System.out.println(a + "\t" + b + "\t" + xor);
		a = true; b = true; xor = (!a && b) || (a && !b);
		System.out.println(a + "\t" + b + "\t" + xor);
		
		
		System.out.println("\na\tb\ta ^ b");
		a = false; b = false; xor = a ^ b;
		System.out.println(a + "\t" + b + "\t" + xor);
		a = false; b = true; xor = a ^ b;
		System.out.println(a + "\t" + b + "\t" + xor);
		a = true; b = false; xor = a ^ b;
		System.out.println(a + "\t" + b + "\t" + xor);
		a = true; b = true; xor = a ^ b;
		System.out.println(a + "\t" + b + "\t" + xor);
	}
}