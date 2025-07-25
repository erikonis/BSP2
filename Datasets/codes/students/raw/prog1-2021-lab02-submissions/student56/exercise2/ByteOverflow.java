package lu.uni.programming1.lab2.exercise2;

/**
 * Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// Define two byte variables a and b here
		byte a = -128, b = 127;
		// set them to the byte domain boundary values
		// print them
		System.out.println(a + " ," + b);
		// then increment/decrement them by one resp.
		a--;
		b++;
		// and print them again
		System.out.println(a + " ," + b);
	}
}