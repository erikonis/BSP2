package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// part 1
	byte a, b;
	a = Byte.MAX_VALUE;
	b = Byte.MIN_VALUE;
	System.out.println("Byte Boundary values: " + a + " " + b);
	System.out.println("Incremented/Decremented values " + ++a + " " + --b + "\n");
	}
}