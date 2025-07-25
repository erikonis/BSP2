package lu.uni.programming1.lab2.exercise1;

import java.util.Scanner;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {

		
			Scanner Boolean = new Scanner(System.in);

				System.out.println("Enter boolean value a: (true/false)");

					boolean a = Boolean.nextBoolean();

				System.out.println("Enter boolean value b: (true/false)");

					boolean b = Boolean.nextBoolean();

			Boolean.close();


		Boolean ExclusiveOr = (!( a && b ) && ( a || b));

			System.out.println("Boolean value a = " + a);
			System.out.println("Boolean value b = " + b);
			System.out.println("Result of exclusive or = " + ExclusiveOr);

	// Check with XOR Operator

	Boolean XOR = a^b;

			System.out.println("Result of java integrated XOR = " + XOR);





	}
}