package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {
	
	int num;
	
	public int digitCount(int n) {
		int digits = 0;
		while (n != 0) {
			n /= 10;
			++digits;
		}
		return digits;
	}

	public boolean isDivisibleBy3() {
		return num % 3 == 0 ? true : false;
	}
	
	public int sumDigits(int n) {
		int sum = n == 0 ? 0 : n % 10 + sumDigits(n / 10);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DivisibleByThree d = new DivisibleByThree();
		
		int dCount;
		int sum;
		int num;
		
		// User input number
		System.out.print("Enter a number: ");
		d.num = scanner.nextInt();;
		num = d.num;
		System.out.println("Number      : " + num);
		
		// Add digits together
		sum = d.sumDigits(num);
		System.out.println("Sum         : " + sum);
		
		// Count number of digits
		dCount = d.digitCount(d.num);
		System.out.println("Digit Count : " + dCount);
		
		// Verify if number of digits bigger than 1
		System.out.printf("%d > 1       : %b\n\n", dCount, (dCount > 1));
		System.out.println("Number      : " + sum);
		
		if (dCount > 1) {
			sum = d.sumDigits(sum);
			System.out.println("Sum         : " + sum);
			System.out.println("Digit Count : " + d.digitCount(sum));
			System.out.printf("%d > 1       : %b\n\n", dCount, (dCount > 1));
		}
		
		// Print if number is divisible or not by 3
		switch(sum) {
		case 3:
		case 6:
		case 9:
			System.out.printf("%d is divisible by 3\n", num);
			break;
		default:
			System.out.printf("%d is not divisible by 3\n", num);
			break;
		}

		// Short method with % (MOD)
		boolean isDivBy3 = d.isDivisibleBy3();
		System.out.printf("\n%d divisible by 3 ? %b\n", num, isDivBy3);
			
		System.out.println("\nEnd...");

		scanner.close();
	}
}