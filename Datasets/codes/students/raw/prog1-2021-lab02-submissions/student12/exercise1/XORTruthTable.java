package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
import java.util.Scanner;

public class XORTruthTable {

	public static void main(String[] args) {
		// TODO: Define boolean variables a, b and xor
		boolean a;
		boolean b;
		boolean xor;
		// TODO: for each combination of a and
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input value a:");
		a = scanner.nextBoolean();
		System.out.println("Input value b:");
		b = scanner.nextBoolean();
		xor = a ^ b;
		/* xor=((a&&!b)||(!a&&b)); */
		System.out.println("a = " + a + "   b= " + b + "   xor= " + xor);
		scanner.close();

		// Change variables a and b
		// and set the xor variable according
		// to your formula f
		// then print the results
	}
}