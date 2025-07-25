package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// We observe that the value goes from 127 to -128 and from -128 to 127, this is due to the carry over going into the sign bit. (Look up two's complement for details)
		byte b = 127;
		System.out.println("b = " + b);
		b++;
		System.out.println("b + 1 = " + b);
		b = -128;
		System.out.println("b = " + b);
		b--;
		System.out.println("b - 1 = " + b);
	}
}