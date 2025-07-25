package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
	

			boolean a,b,xor,xorf;

	
		a=false; b=false;
		xor=!(a&&b)&&(a||b);
		xorf= a^b;
		System.out.println(xor + " " + xorf);


		a=false; b=true;
		xor=!(a&&b)&&(a||b);
		xorf= a^b;
		System.out.println(xor + " " + xorf);


		a=true; b=false;
		xor=!(a&&b)&&(a||b);
		xorf= a^b;
		System.out.println(xor + " " + xorf);

		
		a=true; b=true;
		xor=!(a&&b)&&(a||b);
		xorf= a^b;
		System.out.println(xor + " " + xorf);
	}
}