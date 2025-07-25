package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		// TODO: Define two int variables a and b here
		//       set them to the int domain boundary values you looked up
		//       and print them each before and after the over-/under-flow

		int a = 2147483647;
		int b = -2147483648;

		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is :" + b);

		a += 1;
		b -= 1;
		
		System.out.println("The new value of a is: " + a);
		System.out.println("The new value of b is :" + b);

		// TODO: Define variables of a type that can hold larger
		//       (positive and negative) values than int here
		//       verify that they do not overflow at the boudaries of int

		System.out.println("Doing the same with long variables");

		long c = 2147483647;
		long d = -2147483648;

		System.out.println("The value of c is: " + c);
		System.out.println("The value of d is :" + d);

		c += 1;
		d -= 1;
		
		System.out.println("The new value of c is: " + c);
		System.out.println("The new value of d is :" + d);
		//there is no overflow so, long variables can store values >2147483647 and <-2147483648 unlike int variables
	}
}