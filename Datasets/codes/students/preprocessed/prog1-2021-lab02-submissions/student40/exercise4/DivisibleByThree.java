import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the desired number :");
		int num = scanner.nextInt();
		int sumOfDigits = 0;
		while (num != 0) {
			int currentLastDigit = num % 10;
			sumOfDigits += currentLastDigit;
			num = num - currentLastDigit;
			num = num / 10;
		}

		if (sumOfDigits % 3 == 0) {
			System.out.print("This number is divisible by three");
		} else {
			System.out.print("This number isn`t divisible by three");
		}

		scanner.close();
	}
}