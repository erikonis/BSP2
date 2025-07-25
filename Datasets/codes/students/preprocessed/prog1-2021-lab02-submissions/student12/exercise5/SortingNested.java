import java.util.Scanner;

public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c;
		System.out.println("Enter 1st number :");
		a = scanner.nextInt();
		System.out.println("Enter 2nd number :");
		b = scanner.nextInt();
		System.out.println("Enter 3rd number :");
		c = scanner.nextInt();
		System.out.println("Numbers in ascending order :");
		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a + "");
				System.out.println(b + "");
				System.out.println(c + "");
			} else {
				System.out.println(a + "");
				System.out.println(c + "");
				System.out.println(b + "");
			}
		}
		if (b < a && b < c) {
			if (a < c) {
				System.out.println(b + "");
				System.out.println(a + "");
				System.out.println(c + "");
			} else {
				System.out.println(b + "");
				System.out.println(c + "");
				System.out.println(a + "");
			}
		}
		if (c < b && c < a) {
			if (b < a) {
				System.out.println(c + "");
				System.out.println(b + "");
				System.out.println(a + "");
			} else {
				System.out.println(c + "");
				System.out.println(a + "");
				System.out.println(b + "");
			}
		}

		scanner.close();
	}
}