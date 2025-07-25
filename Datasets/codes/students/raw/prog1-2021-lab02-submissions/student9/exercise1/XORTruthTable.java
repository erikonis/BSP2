package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor

		boolean a = true;
		boolean b = false;

		// TODO: for each combination of a and b
		boolean c = (b ^ b); //
		boolean d = (a ^ b); 
		boolean g = (b ^ a); 
		boolean h = (a ^ a); 
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results
		System.out.println( c + "\n" + d + "\n" + g + "\n" + h );
	
	}
}