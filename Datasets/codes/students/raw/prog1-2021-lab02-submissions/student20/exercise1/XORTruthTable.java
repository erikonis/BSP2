package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;

		boolean c = !(a&&b)&&(a||b);

		System.out.println(c);

	}
}