package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor

		boolean a, b, xor;

		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results

		//line 1
		a = b = false;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		//line 2
		a = false; b = true;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		//line 3
		a = true; b = false;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		//line 4
		a = b = true;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		//with the java xor operator:
		System.out.println("--------------------------------------------");
		
		//line 1
		a = b = false;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	
		//line 2
		a = false; b = true;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	
		//line 3
		a = true; b = false;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	
		//line 4
		a = b = true;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	}
}