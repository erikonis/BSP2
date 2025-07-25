import java.util.Scanner;

public class SortThreeNumbersMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        int middle = 0;

        // Find the middle by elimination
        if (a != smallest && a != largest) {
            middle = a;
        } else if (b != smallest && b != largest) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
        scanner.close();
    }
}