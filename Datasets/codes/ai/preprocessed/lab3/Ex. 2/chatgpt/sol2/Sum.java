import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
        } while (n <= 0);

        scanner.close();

        int sumFor = 0, sumWhile = 0, sumDoWhile = 0;

        // Using for loop
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Using while loop
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Using do-while loop
        int j = 1;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= n);

        // Using formula
        int formulaResult = n * (n + 1) / 2;

        System.out.println("For loop sum: " + sumFor);
        System.out.println("While loop sum: " + sumWhile);
        System.out.println("Do-while loop sum: " + sumDoWhile);
        System.out.println("Formula result: " + formulaResult);
    }
}