import java.util.Scanner;
public class XORTruthTable {

	public static void main(String[] args) {
		boolean a, b, xOr;

		a = true;
		b = true;

		xOr = (a || b) && !(a && b);
		System.out.println("a is " + a +", b is " + b + ", so a xor b is " + xOr);

		a = false;
		b = false;

		xOr = (a || b) && !(a && b);
		System.out.println("a is " + a +", b is " + b + ", so a xor b is " + xOr);

		a = false;
		b = true;

		xOr = (a || b) && !(a && b);
		System.out.println("a is " + a +", b is " + b + ", so a xor b is " + xOr);

		a = true;
		b = false;

		xOr = (a || b) && !(a && b);
		System.out.println("a is " + a +", b is " + b + ", so a xor b is " + xOr);
	}
}