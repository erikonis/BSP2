import java.util.Scanner;

public class NtoM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter N:");
		int n = scanner.nextInt();
		System.out.println("Please enter M:");
		int m = scanner.nextInt();

		scanner.close();

		for (int i = n; i <= m; i++) {
			System.out.println(i);
		}
	}
}