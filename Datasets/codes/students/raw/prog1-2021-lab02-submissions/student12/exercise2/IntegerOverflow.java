package lu.uni.programming1.lab2.exercise2;

/**
 * Class for Exercise 2.2
 */
public class IntegerOverflow {

	public static void main(String[] args) {
		// TODO: Define two int variables a and b here
		int a, b;
		// set them to the int domain boundary values you looked up
		a = -2147483648;
		b = 2147483647;
		// and print them each before and after the over-/under-flow
		System.out.println("a= " + a + "   b= " + b);
		a = a - 1;
		b = b + 1;
		System.out.println("a= " + a + "   b= " + b);
		// TODO: Define variables of a type that can hold larger
		double d, c;
		// (positive and negative) values than int here
		d = (double) a;
		c = (double) b;
		System.out.println("d= " + d + "   c= " + c);
		// verify that they do not overflow at the boudaries of int
		d = d + 1;
		c = c - 1;
		System.out.println("d= " + d + "   c= " + c);
	}
}