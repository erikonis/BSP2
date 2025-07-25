package lu.uni.programming1.lab2.exercise2;

/**
 * Class for Exercise 2.2
 */
public class IntegerOverflow {

	public static void main(String[] args) {
		// Define two int variables a and b here
		int a, b;
		// set them to the int domain boundary values you looked up
		a = -2147483648;
		b = 2147483647;
		// and print them each before and after the over-/under-flow
		System.out.println("a=" + a + " ,b=" + b);
		a--;
		b++;
		System.out.println("a=" + a + " ,b=" + b);
		// Define variables of a type that can hold larger
		// (positive and negative) values than int here
		// verify that they do not overflow at the boudaries of int
		float c, d;
		c = -2147483648;
		d = 2147483647;
		System.out.println("c=" + c + " ,d=" + d);
		c--;
		d++;
		System.out.println("c=" + c + " ,d=" + d);
	}
}