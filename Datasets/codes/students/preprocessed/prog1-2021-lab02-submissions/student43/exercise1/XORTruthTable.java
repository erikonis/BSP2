public class XORTruthTable {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		boolean xor1 = a && !b || !a && b;
		boolean xor2 = a ^ b;
		System.out.println("A: " +a);
		System.out.println("B: " +b);
		System.out.println("XOR: " +xor1);
		System.out.println("XOR (integrated): " +xor2);
		
	}
}