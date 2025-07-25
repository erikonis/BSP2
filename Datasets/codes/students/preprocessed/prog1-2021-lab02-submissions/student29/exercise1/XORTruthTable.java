public class XORTruthTable {

	public static void main(String[] args) {
	boolean a, b, xor;
	a = false; b = false;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	a = false; b = true;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	a = true; b = false;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	a = true; b = true;
	xor = (a || b) && !(a && b);
	System.out.print("xor = "); System.out.println(xor);

	System.out.println("Now with the built-in java XOR operator: ");
	a = false; b = false;
	System.out.print("xor = "); System.out.println(a^b);

	a = false; b = true;
	System.out.print("xor = "); System.out.println(a^b);

	a = true; b = false;
	System.out.print("xor = "); System.out.println(a^b);

	a = true; b = true;
	System.out.print("xor = "); System.out.println(a^b);
	}
}