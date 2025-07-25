package lu.uni.programming1.lab2.exercise2;

/**
 * Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// TODO: Define two byte variables a and b here
		byte a, b;

		// set them to the byte domain boundary values
		a = -128;
		b = 127;
		// print them
		System.out.println("a= " + a + "   b= " + b);
		// then increment/decrement them by one resp.
		a = (byte) (a - 1);
		b = (byte) (b + 1);

		// and print them again
		System.out.println("a= " + a + "   b= " + b);
	}
}