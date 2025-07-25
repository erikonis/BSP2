package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		// TODO: Define two decimal numbers per type float and double
		//       make assign a very small and large value per type
		//       try to add them respectively and print out the value
	double a, b;
	a = Double.MAX_VALUE;
	b = Double.MIN_VALUE;
	System.out.println("Double Boundary values: " + a + "    " + b);
	System.out.println("a+b = " + a+b + "\n");

	float c, d;
	c = Float.MAX_VALUE;
	d = Float.MIN_VALUE;
	System.out.println("Float Boundary values: " + c + "    " + d);
	System.out.println("a+b = " + c+d + "\n");
	System.out.println("You would normally expect the result to be negative since we did an addition to the max result. However, float and double stand for precision. As such, their 'limit values' only decide the maximum number of places behind the comma possible and not how 'big' a number can be.");
	}
}