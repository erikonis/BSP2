public class XORTruthTable {

	public static void main(String[] args) {
		boolean a = false, b = false;

		boolean xor;
		
		xor = (a && b)||(!a && !b);
		System.out.println(xor);

		a = false; b = true;
		xor = (a && b)||(!a && !b);
		System.out.println(xor);

		a = true; b = false;
		xor = (a && b)||(!a && !b);
		System.out.println(xor);
		
		a = true; b = true;
		xor = (a && b)||(!a && !b);
		System.out.println(xor);

	}
}