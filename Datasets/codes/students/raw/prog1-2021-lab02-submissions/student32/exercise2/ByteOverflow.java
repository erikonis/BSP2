package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// TODO: Define two byte variables a and b here
		//       set them to the byte domain boundary values
		//       print them
		//       then increment/decrement them by one resp.
		//       and print them again
		byte a = 127;
		byte b = -128;
		
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is :" + b);

		a += 1;
		b -= 1;
		
		System.out.println("The new value of a is: " + a);
		System.out.println("The new value of b is :" + b);

		// When the byte a which is 127 is set to -128 and the byte b which is -128 becomes 127
		// What happens is that when an overflow occurs the number goes to the next value and this number is at the limit the next value is the other value
		// So when counting up from 126, the program continues with 127, -128, -127 and when counting down from -128, the program continues with -128, 127, 126
	}
}