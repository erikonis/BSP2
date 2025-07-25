import java.util.Scanner;

public class XORTruthTable {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean xor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input value a:");
		a = scanner.nextBoolean();
		System.out.println("Input value b:");
		b = scanner.nextBoolean();
		xor = a ^ b;
		/* xor=((a&&!b)||(!a&&b)); */
		System.out.println("a = " + a + "   b= " + b + "   xor= " + xor);
		scanner.close();

	}
}