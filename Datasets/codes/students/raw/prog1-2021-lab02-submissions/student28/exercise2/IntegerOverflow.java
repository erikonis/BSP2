package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		// TODO: Define two int variables a and b here
		int a;
		int b;
		//       set them to the int domain boundary values you looked up
		a = 2147483647;
		b = -2147483648;
		//       and print them each before and after the over-/under-flow
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(b--);
		// TODO: Define variables of a type that can hold larger
		long c;
		long d;
		//       (positive and negative) values than int here
		c = 2147483647;
		d = -2147483648;
		//       verify that they do not overflow at the boudaries of int
		System.out.println(++c);
		System.out.println(--d);
	}
}