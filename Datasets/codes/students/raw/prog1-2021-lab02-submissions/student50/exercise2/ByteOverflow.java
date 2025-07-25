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
		byte a = (byte) -128;
		byte b = (byte) 127;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		a--;
		b++;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}