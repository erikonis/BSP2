package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.3
 */
public class DecimalPrecision {

	public static void main(String[] args) {
		float floatA = -500000000000.0f;
		float floatB = 420000000000.0f;
		float floatResult = floatA+floatB;
		System.out.println("float a : "+floatA);
		System.out.println("float b : "+floatB);
		System.out.println("result : "+ floatResult +"\n");
		double doubleA = -500000000000.0;
		double doubleB = 420000000000.0;
		double doubleResult = doubleA+doubleB;
		System.out.println("double a : "+ doubleA);
		System.out.println("double b : "+ doubleB);
		System.out.println("result : "+ doubleResult +"\n");
		System.out.println("difference : "+ (doubleResult-floatResult));
	}
}