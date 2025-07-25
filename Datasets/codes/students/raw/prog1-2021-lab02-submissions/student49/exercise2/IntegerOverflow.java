package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {
		// We observe again that the value goes from MaxInt to minInt and vice-versa. (Look up two's complement for details)
		// Java stores the maximal value for a type inside the corresponding "Boxed Type" class. e.g. Integer.MAX_VALUE, Byte.MIN_VALUE etc.
		int i = 2147483647;  // or Integer.MAX_VALUE;
		System.out.println("i = " + i);
		i++;
		System.out.println("i + 1 = " + i);
		i = -2147483648; // or Integer.MIN_VALUE;
		System.out.println("i = " + i);
		i--;
		System.out.println("i - 1 = " + i);

		
		//The long type can store twice as many bits compared to int, so we go from 2^31-1 to 2^63-1 as a maximal value and -2^31 to -2^63 as a minimum value (one bit is reserved of the sign)
		long l = Long.MAX_VALUE;
		System.out.println("l = " + l);
		l++;
		System.out.println("l + 1 = " + l);
		l = Long.MIN_VALUE;
		System.out.println("l = " + l);
		l--;
		System.out.println("l - 1 = " + l);
	}
}