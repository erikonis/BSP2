package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// TODO: Define two byte variables a and b here
		byte a;
		byte b;
		//       set them to the byte domain boundary values
		a = 127;
		b = -128;
		//       print them
		System.out.println(a);
		System.out.println(b);
		//       then increment/decrement them by one resp.
		a ++;
		b --;
		//       and print them again
		System.out.println(a);
		System.out.println(b);

	}
}