import java.util.Scanner;

public class SortThreeNumbersNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Sort the numbers using nested if-statements
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        // Display the sorted numbers
        System.out.println("Sorted numbers: " + a + ", " + b + ", " + c);
    }
}