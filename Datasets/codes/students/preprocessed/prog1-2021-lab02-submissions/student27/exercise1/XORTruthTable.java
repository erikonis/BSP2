public class XORTruthTable {

	public static void main(String[] args) {

		boolean a,b,xor, xorop;

		a = true; b = true; xor = (a||b)&&(!(a&&b)); xorop = a ^ b;

		System.out.println("\nXOR : " + xorop + "\nFormula : " + xor);
		
	}
}