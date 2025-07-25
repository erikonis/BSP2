import java.util.Scanner;

public class XORTruthTable {

	public static void main(String[] args) {

		
			Scanner Boolean = new Scanner(System.in);

				System.out.println("Enter boolean value a: (true/false)");

					boolean a = Boolean.nextBoolean();

				System.out.println("Enter boolean value b: (true/false)");

					boolean b = Boolean.nextBoolean();

			Boolean.close();


		Boolean ExclusiveOr = (!( a && b ) && ( a || b));

			System.out.println("Boolean value a = " + a);
			System.out.println("Boolean value b = " + b);
			System.out.println("Result of exclusive or = " + ExclusiveOr);


	Boolean XOR = a^b;

			System.out.println("Result of java integrated XOR = " + XOR);





	}
}