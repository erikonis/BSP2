import java.util.Scanner;

public class XtoY {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter x:");
		double x = scanner.nextDouble();
		System.out.println("Please enter y:");
		double y = scanner.nextDouble();
		System.out.println("Please enter the step d:");
		double d = scanner.nextDouble();

		scanner.close();

		for (double i = x; i <= y; i += d) {
			System.out.println(i);
		}
	}
}