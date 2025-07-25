package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// TODO: Define two byte variables a and b here
		//       set them to the byte domain boundary values
		//       print them
		//       then increment/decrement them by one resp.
		//       and print them again

		byte a, b;

		a = -128;
		b = 127;

		System.out.println("\na : " + a-- + "\nb : " + b++);

		System.out.println("\na : " + a + "\nb : " + b);

		//comes back to the other limit eg. from -128 to 127 or from 127 to -128

	}
}