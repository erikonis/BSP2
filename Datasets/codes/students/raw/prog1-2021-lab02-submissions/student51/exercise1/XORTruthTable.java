package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {

		// TODO: Define boolean variables a, b and xor

		boolean a;
		boolean b;
		boolean xor;

		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		a=false;b=false;
		xor = (a&&!b)||(b&&!a);
		System.out.println(xor);
		System.out.println("	" + (a ^ b));

		a=false;b=true;
		xor = (a&&!b)||(b&&!a);
		System.out.println(xor);
		System.out.println("	" + (a ^ b));

		a=true;b=false;
		xor = (a&&!b)||(b&&!a);
		System.out.println(xor);
		System.out.println("	" + (a ^ b));

		a=true;b=true;
		xor = (a&&!b)||(b&&!a);
		System.out.println(xor);
		System.out.println("	" + (a ^ b));


	}
}