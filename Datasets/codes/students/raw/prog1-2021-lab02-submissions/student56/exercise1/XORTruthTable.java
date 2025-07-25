package lu.uni.programming1.lab2.exercise1;

/**
 * Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {

		boolean a = false, b = false; // 0 or 0
		boolean xor = a && !b || !a && b;
		System.out.println(a + ", " + b + " = " + xor);

		b = !b;// 0 or 1
		xor = a && !b || !a && b;
		System.out.println(a + ", " + b + " = " + xor);

		a = !a;
		b = !b;// 1 or 0
		xor = a && !b || !a && b;
		System.out.println(a + ", " + b + " = " + xor);

		b = !b;// 1 or 1
		xor = a && !b || !a && b;
		System.out.println(a + ", " + b + " = " + xor);
	}
}