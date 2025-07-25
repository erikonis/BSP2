import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		int save;
		int sum = 0;
		String result;

		System.out.println("Enter your number :");
		number = scanner.nextInt();
		save = number;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;

		}
		result = (sum % 3 == 0) ? "Yes the number " + save + " is divisible by 3"
				: "No the number " + save + " is not divisible by 3";
		System.out.println(result);

		scanner.close();
	}
}