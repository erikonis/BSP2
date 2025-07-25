package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		byte a,b;
		a=-128;
		b=127;
		System.out.println(a+" "+b);
		a--; b++;
		System.out.println(a+" "+b);
		//both of them go to the other boundary (a=127, b=-128)
	}
}