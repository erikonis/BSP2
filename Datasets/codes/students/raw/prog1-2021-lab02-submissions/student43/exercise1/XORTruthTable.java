package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		boolean a = false;
		boolean b = false;
		// values for a and b can be changed
		boolean xor1 = a && !b || !a && b;
		//my own formula for xor is "(a and not b) or (not a and b)"
		//this makes it that its only true if one is true and the other false
		boolean xor2 = a ^ b;
		//the xor function that's a part of Java
		System.out.println("A: " +a);
		System.out.println("B: " +b);
		System.out.println("XOR: " +xor1);
		System.out.println("XOR (integrated): " +xor2);
		//printed nicely
		
		// TODO: for each combination of a and b
		//       Change variables a and b
		//		 and set the xor variable according
		//       to your formula f 
		//       then print the results
	}
}