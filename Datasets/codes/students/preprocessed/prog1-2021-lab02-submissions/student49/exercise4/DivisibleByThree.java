import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("n = ");
		int n = scanner.nextInt();
		scanner.close();

		if (n > 9999) {
			System.out.println("No numbers with more than 4 digits allowed!");
			return;
		}

		int lastDigit;
		int rest = n;
		int sum = 0;

		 
		lastDigit = rest % 10; // get last digit
		sum += lastDigit;   // add it to the sum
		rest = rest / 10;   // remove last digit from "rest"
		
		lastDigit = rest % 10;
		sum += lastDigit;
		rest = rest / 10;

		lastDigit = rest % 10;
		sum += lastDigit;
		rest = rest / 10;
		
		lastDigit = rest % 10;
		sum += lastDigit;

		System.out.println("The sum of the digits is: " + sum);
		System.out.println( (sum % 3 == 0) 
			? String.format("The number %d is divisible by three.", n)
			: String.format("The number %d is NOT divisible by three.", n)
		);

	}
}