package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		
		int overflow = Integer.MAX_VALUE;

		System.out.println("integer max value: " + overflow);
		System.out.println("after adding 1: " + ++overflow);
		System.out.println("after removing 1 again: " + --overflow);
	}
}