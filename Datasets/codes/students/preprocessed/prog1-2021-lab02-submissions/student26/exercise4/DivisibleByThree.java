import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number (at most 4 digits): ");
		int number = scanner.nextInt();
		int sum = 0;
		while (number > 0) {

			sum = sum + number % 10;

			number = number / 10;
		}

		System.out.println(sum % 3 == 0 ? "Divisible by 3" : "Not divisible by 3");
		scanner.close();
	}
}