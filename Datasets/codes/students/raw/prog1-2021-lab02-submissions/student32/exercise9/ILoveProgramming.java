package lu.uni.programming1.lab2.exercise9;

/**
 *  Class for Exercise 9
 */
public class ILoveProgramming {

	public static void main(String[] args) {
		// the number of times we want to print "I love programming"
		int numberOfiLoveProgrammingPrints = 20;

		// we run a "for" loop to print multiple times "I love programming"
		for (int iLoveProgrammingPrintCount = 0; iLoveProgrammingPrintCount <= numberOfiLoveProgrammingPrints; iLoveProgrammingPrintCount = iLoveProgrammingPrintCount+1) {
			// actually doing the printing
			System.out.println("I love programming!");
		}
		// The error was that there was a semi-colon after the condition
		// So the program counted the iLoveProgrammingPrintCount to 20
		// Then it did what came afterwards, which is once outputting "I love programming"
	}
}