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
		byte a = -128;
		byte b = 127;
		//setting a and b to the maximum value for byte
		System.out.println("A: "+a--);
		System.out.println("B: "+b++);
		System.out.println("Increment");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		//printing them, then incrementing them and printing again
	}
}