public class XORTruthTable {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean xor;
		a = b;
		b = a;
		xor = (a && b) || (!a && !b);
		System.out.println(xor);

	}
}