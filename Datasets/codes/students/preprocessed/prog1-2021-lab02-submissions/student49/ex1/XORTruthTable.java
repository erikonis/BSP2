public class XORTruthTable {

	public static void main(String[] args) {
		boolean a, b;

		a = false;
		b = false;
		System.out.println("a=false; b=false;  ->  " + (a ^ b));

		a = false;
		b = true;
		System.out.println("a=false; b=true;  ->  " + (a ^ b));

		a = true;
		b = false;
		System.out.println("a=true;  b=false;  ->  " + (a ^ b));

		a = true;
		b = true;
		System.out.println("a=true; b=true;  ->  " + (a ^ b));

	}
}