package lu.uni.programming1.lab3.exercise2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		do {
			System.out.print("n = ");
			n = scanner.nextInt();
		} while (n < 0); // sanity check

		/* For loop */
		int forSum = 0;
		for (int i = 1; i <= n; i++) {
			forSum += i;
		}

		/* While loop */
		int whileSum = 0;
		// must be redeclared here, as it was previously only declared and known
		// within the for loop
		int i = 1;
		while (i <= n) {
			whileSum += i;
			i++;
		}

		/* Do-while loop */
		int doWhileSum = 0;
		// only reset the value, as it was declared previously in the same scope
		i = 0;
		do {
			doWhileSum += i;
			i++;
		} while (i <= n);

		int formulaSum = n * (n + 1) / 2;

		System.out.println("Comparison:");
		System.out.println("For Loop Sum: " + forSum);
		System.out.println("While Loop Sum: " + whileSum);
		System.out.println("Do-While Loop Sum: " + doWhileSum);
		System.out.println("Formula Sum: " + formulaSum);

		scanner.close();
	}
}