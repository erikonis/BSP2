import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int readNumber;
		int sum = 0;
		int count = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		System.out.println("Enter a sequence of integer numbers. Enter 0 to stop.");

		do {
			readNumber = scanner.nextInt();
			sum += readNumber;
			count++;
			if (readNumber != 0) {
				min = Math.min(min, readNumber);
				max = Math.max(max, readNumber);
			}
		} while (readNumber != 0);

		// 0 does not count as a valid entry
		count--;

		if (count == 0) {
			System.out.println("No number was entered.");
		} else {
			double average = (1.0 * sum) / count;
			System.out.println("Average: " + average);
			System.out.println("Min: " + min);
			System.out.println("Max: " + max);
		}

		scanner.close();
	}
}