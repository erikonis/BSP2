package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {

		byte a = -128;
		byte b = 127;
		System.out.println(a);
		System.out.println(b);
		a--;
		System.out.println(a);
		b++;
		System.out.println(b);

	}
}