import java.util.Scanner;

public class XORTruthTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean a, b;
		System.out.println("a = ");
		a = scanner.nextBoolean();
		System.out.println("b = ");
		b = scanner.nextBoolean();
		

		boolean f = (a ^ b) || (b ^ a);
		System.out.println("Results: ");
		System.out.println("f = " + f);

		scanner.close();
	}
}