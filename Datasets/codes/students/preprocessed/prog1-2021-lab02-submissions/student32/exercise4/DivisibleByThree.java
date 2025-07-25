import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Please enter a number of at most 4 digits: ");
		int number = scanner.nextInt();
		
		int sum = 0;

		sum += number % 10;
		number = (number - number % 10) / 10;
		
		sum += number % 10;
		number = (number - number % 10) / 10;
		
		sum += number % 10;
		number = (number - number % 10) / 10;
		
		sum += number % 10;
		number = (number - number % 10) / 10;
		
		String result = (sum % 3 == 0) ? "The number you entered is divisible by three." : "The number you entered is not divisible by three";

		System.out.println(result);

		scanner.close();
	}
}