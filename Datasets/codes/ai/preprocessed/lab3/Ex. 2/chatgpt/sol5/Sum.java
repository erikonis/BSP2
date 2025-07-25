import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;

        while (n <= 0) {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
        }

        // For loop sum
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // While loop sum
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Do-while loop sum
        int sumDoWhile = 0;
        int j = 1;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= n);

        // Formula result
        int sumFormula = (n * (n + 1)) / 2;

        System.out.println("For loop sum:      " + sumFor);
        System.out.println("While loop sum:    " + sumWhile);
        System.out.println("Do-while loop sum: " + sumDoWhile);
        System.out.println("Formula result:    " + sumFormula);
    }
}