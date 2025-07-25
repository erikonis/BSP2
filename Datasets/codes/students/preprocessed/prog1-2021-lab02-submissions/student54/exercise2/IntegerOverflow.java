package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a = -2147483648;
		int b = 2147483647;

		System.out.println(a + "<->" +b);
		System.out.println(a-1 + "<->" +(b+1));
		// TODO: Define two int variables a and b here
		//       set them to the int domain boundary values you looked up
		//       and print them each before and after the over-/under-flow

		long a2 = a;
		long b2 = b;
		
		System.out.println(a2 + "<->" +b2);
		System.out.println(a2-1 + "<->" +(b2+1));
		// TODO: Define variables of a type that can hold larger
		//       (positive and negative) values than int here
		//       verify that they do not overflow at the boudaries of int
	}
}