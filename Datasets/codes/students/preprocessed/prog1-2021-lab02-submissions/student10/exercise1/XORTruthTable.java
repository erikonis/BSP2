
public class XORTruthTable {

	public static void main(String[] args) {
		
		boolean a=false;
		boolean b=false;
		boolean xor=false;
		boolean xor2=false;


		System.out.println("|   a   |   b   |  XOR  |  XOR2  |");
		System.out.println("| "+a+ " | "+b+" | "+xor+" | "+xor2+"  |");

		a = !a;
		xor = a && !b || !a && b;
		xor2= a ^ b;
		
		System.out.println("| "+a+ "  | "+b+" | "+xor+"  | "+xor2+"   |");
		
		a = !a;
		b = !b;
		xor = a && !b || !a && b;
		xor2= a ^ b;

		System.out.println("| "+a+ " | "+b+"  | "+xor+"  | "+xor2+"   |");

		a = !a;
		xor = a && !b || !a && b;
		xor2= a ^ b;

		System.out.println("| "+a+ "  | "+b+"  | "+xor+" | "+xor2+"  |");
		
	}
}