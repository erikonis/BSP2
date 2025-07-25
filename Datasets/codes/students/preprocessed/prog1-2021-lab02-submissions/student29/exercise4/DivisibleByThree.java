import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		int n, sum;
		String msg, nString;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to check if it is divisible by 3: ");
		
		n = scanner.nextInt();
		sum = 0;
		nString = "" + n;

		for (int i = 0; i < nString.length(); i++) {
			sum += n%10;
			n = n/10;
		}
		System.out.println("Sum of digits: " + sum);

		msg = (sum % 3 == 0) ? "Number is divisible by 3" : "Number is not divisible by 3";
		System.out.println(msg);

		
		scanner.close();
	}
}