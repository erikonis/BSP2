package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		// TODO: Define two byte variables a and b here
		byte a;
		byte b;
		//       set them to the byte domain boundary values
		//       print them
		a	= -128;
		b	=  127;	
		System.out.println( a + "\n" + b );
		//       then increment/decrement them by one resp.
		//       and print them again
		a	= 3;
		b	= 3;	
//here we can see that a byte can hold just 8 bit 11111111 and java dosnt alowed to overflow it
	System.out.println( a + "\n" + b );
	}
}