import java.util.Scanner;

public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter three integers: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		if (number1 > number2) {
			int res = number1;
			number1 = number2;
			number2 = res;
		}
		if (number2 > number3) {
			int res = number2;
			number2 = number3;
			number3 = res;
		}

		if (number1 > number2) {
			int res = number1;
			number1 = number2;
			number2 = res;
		}

		System.out.println("The sorted numbers are " + number1 + " " + number2 + " " + number3);

		scanner.close();
	}
}