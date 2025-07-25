package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// TODO: Define two decimal numbers per type float and double
		//       make assign a very small and large value per type
		//       try to add them respectively and print out the value
		
		float floata = -41371840;
		float floatb = 10000000;

		float floatresult = floata + floatb;

		System.out.println("floata + floatb = " + floatresult);

		//it outputs -3.137184E7 but I expected it would output -31371840

		System.out.println("The same thing with the type double:");

		double doublea = -41371840;
		double doubleb = 10000000;

		double doubleresult = doublea + doubleb;

		System.out.println("doublea + doubleb = " + doubleresult);
		//the same thing happens
	}
}