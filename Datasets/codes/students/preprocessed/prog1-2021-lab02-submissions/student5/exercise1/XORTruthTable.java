import java.util.Scanner;

public class XORTruthTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("boolean a (true/false):");
		boolean a = scanner.nextBoolean();
		System.out.println("boolean b (true/false):");
		boolean b = scanner.nextBoolean();
		boolean xor = (a && !b) || (!a && b);
		System.out.println("XOR truth: " + xor);
		xor = a ^ b;
		System.out.println("verification: " + xor);
		


		scanner.close();
	}
}