import java.util.Scanner;

public class SortThreeNumbersNestedIfExtremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest, largest, middle;

        // Find the smallest
        if (a <= b && a <= c) {
            smallest = a;
            if (b <= c) { middle = b; largest = c; } else { middle = c; largest = b; }
        } else if (b <= a && b <= c) {
            smallest = b;
            if (a <= c) { middle = a; largest = c; } else { middle = c; largest = a; }
        } else { // c <= a && c <= b
            smallest = c;
            if (a <= b) { middle = a; largest = b; } else { middle = b; largest = a; }
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
        scanner.close();
    }
}