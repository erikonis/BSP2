package lu.uni.programming1.lab2.exercise2;

/**
 * Class for Exercise 2.2
 */
public class IntegerOverflow {

	public static void main(String[] args) {
		// TOdo: Define two int variables a and b here
		// set them to the int domain boundary values you looked up
		// and print them each before and after the over-/under-flow
		// int a, b;
		// a = Integer.MAX_VALUE;
		// b = Integer.MIN_VALUE;

		// System.out.println("Before: " + a);
		// System.out.println("Before: " + b);

		// a = Integer.MAX_VALUE + 1;
		// b = Integer.MIN_VALUE - 1;

		// System.out.println("After: " + a);
		// System.out.println("After: " + b);

		// a = Integer.MAX_VALUE - 1;
		// b = Integer.MIN_VALUE + 1;

		// System.out.println("After: " + a);
		// System.out.println("After: " + b);

		// TOdo: Define variables of a type that can hold larger
		// (positive and negative) values than int here
		// verify that they do not overflow at the boudaries of int

		long x, y;
		x = 15555566666888L;
		y = -55555666677777L;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}