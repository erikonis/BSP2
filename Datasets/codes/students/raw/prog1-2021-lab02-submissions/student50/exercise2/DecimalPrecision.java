package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// TODO: Define two decimal numbers per type float and double
		//       make assign a very small and large value per type
		//       try to add them respectively and print out the value
		
		float f1 = 54321;
		float f2 = 1;
		double d1 = 1.54321;
		double d2 = 1.000000001;
		
		System.out.println(f1+d1);
		System.out.println(f2+d2);
		System.out.println();
		System.out.println(f1+f2);
		System.out.println(d1+d2);
		
	}
}