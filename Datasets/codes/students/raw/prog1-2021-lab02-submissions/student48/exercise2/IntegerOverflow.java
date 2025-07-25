package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.2
 */
public class IntegerOverflow {
	
	public static void main(String[] args) {

		int c,d ;
		c = -2147483648; 
		d = 2147483647;

		System.out.print (" These are values for c " + c + " and d " + d );
		System.out.print (" These are values for c " + --c + " and d " + --d );

		// the same for int , is restarting the value from the end of the set


	
	}
}