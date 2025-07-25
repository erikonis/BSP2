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

        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        int sumWhile = 0, i = 1;
        while (i <= n) {
            sumWhile += i++;
        }

        int sumDoWhile = 0;
        i = 1;
        do {
            sumDoWhile += i++;
        } while (i <= n);

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum (for loop): " + sumFor);
        System.out.println("Sum (while loop): " + sumWhile);
        System.out.println("Sum (do-while loop): " + sumDoWhile);
        System.out.println("Sum (formula): " + formulaSum);
    }
}