package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// todo: Define two byte variables a and b here
		//       set them to the byte domain boundary values
		//       print them
		//       then increment/decrement them by one resp.
		//       and print them again
		byte a;
		byte b;

		a = 127;
		b = -128;
		System.out.println("Before increment: " + a);
		System.out.println("Before decrement: " + b);

		++a;
		--b;
		System.out.println("After increment: " + a);
		System.out.println("After decrement: " + b);

		
		// long a = Long.MIN_VALUE;
		// long b = Long.MAX_VALUE;
		// System.out.println(a);
		// System.out.println(b);
		
	}
}