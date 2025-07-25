import java.util.Scanner;

public class SortThreeWithoutNesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int first, second, third;

        // Find the smallest number
        if (a <= b && a <= c) {
            first = a;
        } else if (b <= a && b <= c) {
            first = b;
        } else {
            first = c;
        }

        // Find the largest number
        if (a >= b && a >= c) {
            third = a;
        } else if (b >= a && b >= c) {
            third = b;
        } else {
            third = c;
        }

        // The middle value is the remaining one
        if (a != first && a != third) {
            second = a;
        } else if (b != first && b != third) {
            second = b;
        } else {
            second = c;
        }

        System.out.println("Sorted: " + first + " " + second + " " + third);
    }
}
