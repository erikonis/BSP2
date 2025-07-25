package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable 
{

	public static void main(String[] args) 
	{
		// TODO: Define boolean variables a, b and xor
		boolean a;
		boolean b; 

		boolean xor;
		boolean operatorXOR;

		
		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results
		 
		a = false; b = false; 
		xor = (!a && b) || (a && !b); // formula found given the symmetry of the XOR operation
		operatorXOR = a ^ b; // truth value calculated with built-in operator
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

		a = true;
		xor = (!a && b) || (a && !b);
		operatorXOR = a ^ b;
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

		a = false; b = true;
		xor = (!a && b) || (a && !b);
		operatorXOR = a ^ b;
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

		a = true;
		xor = (!a && b) || (a && !b);
		operatorXOR = a ^ b;
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

	}
}