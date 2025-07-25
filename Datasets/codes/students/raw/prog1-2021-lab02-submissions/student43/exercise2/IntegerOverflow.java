package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		// TODO: Define two int variables a and b here
		//       set them to the int domain boundary values you looked up
		//       and print them each before and after the over-/under-flow
		int a = -2147483648;
		int b = 2147483647;
		//setting a and b to limits of integers
		System.out.println("A: "+a--);
		System.out.println("B: "+b++);
		System.out.println("Increment");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		//print, increment, then print again
		// TODO: Define variables of a type that can hold larger
		//       (positive and negative) values than int here
		//       verify that they do not overflow at the boudaries of int
		long c = -2147483648;
		long d = 2147483647;
		System.out.println("C: "+c--);
		System.out.println("D: "+d++);
		System.out.println("Increment");
		System.out.println("C: "+c);
		System.out.println("D: "+d);
		//same process, but having them be long instead of int, proving that long can hold bigger values
	}
}