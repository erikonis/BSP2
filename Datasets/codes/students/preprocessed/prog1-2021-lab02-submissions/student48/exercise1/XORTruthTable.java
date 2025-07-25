import java.util.Scanner;

public class XORTruthTable {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

		System.out.print ("Define if a is true or false");
		boolean a = scanner.nextBoolean();

		System.out.print ("Define if b is true or false");
		boolean b = scanner.nextBoolean();

		boolean c = (a || b) && (!a ||!b);


		System.out.print (" The value for A OR exclusive B is : " + c  );

		boolean d = a^b;

		System.out.print (" The value given by Java : " + d );


		scanner.close();
	}
}