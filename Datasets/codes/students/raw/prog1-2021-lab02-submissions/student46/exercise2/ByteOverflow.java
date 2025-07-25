package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		byte a;
		byte b;
		a = -128;
		b = 127;
		System.out.println(a);
		System.out.println(b);

		--a;
		++b;
		System.out.println(a);
		System.out.println(b);
		// TODO: Define two byte variables a and b here
		//       set them to the byte domain boundary values
		//       print them
		//       then increment/decrement them by one resp.
		//       and print them again
	}
}