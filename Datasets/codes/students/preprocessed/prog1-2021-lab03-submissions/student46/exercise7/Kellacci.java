import java.util.Scanner;

public class Kellacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		do {
			System.out.print("n = ");
			n = scanner.nextInt();
		} while (n < 1);
		scanner.close();

		if (n == 1) {
			System.out.println(1);
		} else {
			int secondToLast = 1;
			int last = 1;
			int current;

			System.out.print(secondToLast + " " + last + " ");

			for (int i = 3; i <= n; i++) {
				current = last - 1 + secondToLast * 2;
				secondToLast = last;
				last = current;
				System.out.print(current + " ");
			}
		}
	}
}