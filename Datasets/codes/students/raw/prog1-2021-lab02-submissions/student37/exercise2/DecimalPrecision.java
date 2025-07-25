package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// TODO: Define two decimal numbers per type float and double
		//       make assign a very small and large value per type
		//       try to add them respectively and print out the value
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		System.out.println("float = " + "[" + floatMin + "; " + floatMax + "]");
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		System.out.println("double = " + "[" + doubleMin + "; " + doubleMax + "]");
	}
}