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
		
		System.out.println("====== Integer Limits ======");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		// TODO: Define variables of a type that can hold larger
		//       (positive and negative) values than int here
		//       verify that they do not overflow at the boudaries of int
		
		long al = 9223372036854775807L;
		long bl = -9223372036854775808L;
		
		System.out.println("====== Long Limits ======");
		System.out.println(al);
		System.out.println(bl);
		System.out.println();
		al++;
		bl--;
		System.out.println(al);
		System.out.println(bl);
	}
}