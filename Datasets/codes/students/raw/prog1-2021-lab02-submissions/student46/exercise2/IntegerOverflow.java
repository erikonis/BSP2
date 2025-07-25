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
		a = -2147483648;
		b = 2147483647;
		//       and print them each before and after the over-/under-flow
		System.out.println(a);
		System.out.println(b);
		System.out.println("     ");
		--a;
		++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println("     ");
		// TODO: Define variables of a type that can hold larger
		long c = -2147483648;
		long d = 2147483647;
		--c;
		++d;
		System.out.println(c);
		System.out.println(d);

		//       (positive and negative) values than int here
		//       verify that they do not overflow at the boudaries of int
	}
}