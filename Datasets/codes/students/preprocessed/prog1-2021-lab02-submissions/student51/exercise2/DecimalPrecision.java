package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// TODO: Define two decimal numbers per type float and double
		//       make assign a very small and large value per type
		//       try to add them respectively and print out the value

		double a = 10 * Math.pow(10,-1000);
		double b = 10 * Math.pow(1000, 1000);

		System.out.println(a+b);
	}
}