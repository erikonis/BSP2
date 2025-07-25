package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
	
		byte a,b;

		//       set them to the byte domain boundary values
		 a = 127;
		 b = -127;

		//       print them

		System.out.print ("These are values for a " + a + " and b " + b );

		// then increment/decrement them by one resp.
		// and print them again
		System.out.print (" These are values for a " + ++a + " and b " + --b );

		//We notice the programm is turning around the [-128,127], 
		//when you reach the minimum/maximum as -128 or 127, it going to start on the other side
		//because a or b can just contain values between [-128;127]

	}
}