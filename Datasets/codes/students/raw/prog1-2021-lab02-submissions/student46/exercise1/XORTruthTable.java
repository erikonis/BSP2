package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		boolean xor = a&&!b ||!a&&b ;
		System.out.println(xor);

		a = false;
		b = true;
		xor = a&&!b ||!a&&b ;
		System.out.println(xor);

		a = true;
		b = false;
		xor = a&&!b ||!a&&b ;
		System.out.println(xor);

		a = true;
		b = true;
		xor = a&&!b ||!a&&b ;
		System.out.println(xor);

		System.out.println("      ");

		a = false;
		b = false;
		System.out.println(a^b);

		a = false;
		b = true;
		System.out.println(a^b);

		a = true;
		b = false;
		System.out.println(a^b);

		a = true;
		b = true;
		System.out.println(a^b);



		// TODO: Define boolean variables a, b and xor

		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results
	}
}