package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a = -2147483648, b = 2147483647;
		System.out.println(a + " " + b);
		System.out.println(--a + " " + ++b);

		long c = -2147483648, d = 2147483647;
		System.out.println(c + " " + d);
		System.out.println(--c + " " + ++d);
	}
}