import java.util.Scanner;

public class SortThreeNumbersNoNestingSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Compare and swap to ensure a <= b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Compare and swap to ensure b <= c (now b is at least as large as initial a)
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // One final comparison to ensure a <= b (in case initial c was smallest)
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Ascending order: " + a + ", " + b + ", " + c);
        scanner.close();
    }
}