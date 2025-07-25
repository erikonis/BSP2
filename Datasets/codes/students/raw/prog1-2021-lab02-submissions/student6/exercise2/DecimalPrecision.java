package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// TOdo: Define two decimal numbers per type float and double
		//       make assign a very small and large value per type
		//       try to add them respectively and print out the value

		float a, b;
		double x,y;

		a = 222222000444f;
		b = -3333330000f;
		x = 444444444;
		y = -66666666;

		System.out.println("Sum of a and b: " + a+b);
		System.out.println("Sum of x and y: " + x+y);
	}
}