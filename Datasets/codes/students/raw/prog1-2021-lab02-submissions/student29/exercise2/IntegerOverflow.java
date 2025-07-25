package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		// TODO: Define two int variables a and b here
	int c, d;
	c = Integer.MAX_VALUE;
	d = Integer.MIN_VALUE;
	System.out.println("Int Boundary values: " + c + " " + d);
	System.out.println("Incremented/Decremented values " + ++c + " " + --d + "\n");

	long e, f;
	e = Long.MAX_VALUE;
	f = Long.MIN_VALUE;
	System.out.println("Long Boundary values: " + e + " " + f);
	System.out.println("Incremented/Decremented values " + ++e + " " + --f + "\n");

		// TODO: Define variables of a type that can hold larger
		//       (positive and negative) values than int here
		//       verify that they do not overflow at the boudaries of int
	}
}