import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Sorting with nested if-statements
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
               if (b > c) {
            temp = b;
            b = c;
            c = temp;
            }
        System.out.println("Sorted order (nested if): " + a + " " + b + " " + c);
        }
        // Sorting without nested if-statements
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;
        System.out.println("Sorted order (no nested if): " + min + " " + mid + " " + max);
    }
}