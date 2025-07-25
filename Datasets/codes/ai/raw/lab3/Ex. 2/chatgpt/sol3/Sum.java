import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Input: Ensure positive integer
        do {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
        } while (n <= 0);

        // 1. Using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // 2. Using while loop
        int sumWhile = 0, i = 1;
        while (i <= n) {
            sumWhile += i++;
        }

        // 3. Using do-while loop
        int sumDoWhile = 0, j = 1;
        do {
            sumDoWhile += j++;
        } while (j <= n);

        // 4. Using formula
        int sumFormula = n * (n + 1) / 2;

        // Output
        System.out.println("Sum (for loop):      " + sumFor);
        System.out.println("Sum (while loop):    " + sumWhile);
        System.out.println("Sum (do-while loop): " + sumDoWhile);
        System.out.println("Sum (formula):       " + sumFormula);
    }
}
