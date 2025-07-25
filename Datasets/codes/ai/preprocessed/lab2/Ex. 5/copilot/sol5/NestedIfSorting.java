import java.util.Scanner;

public class NestedIfSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Sorting using nested if-statements
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("Sorted order: " + c + " " + b + " " + a);
                } else {
                    System.out.println("Sorted order: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Sorted order: " + b + " " + a + " " + c);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println("Sorted order: " + c + " " + a + " " + b);
                } else {
                    System.out.println("Sorted order: " + a + " " + c + " " + b);
                }
            } else {
                System.out.println("Sorted order: " + a + " " + b + " " + c);
            }
        }
    }
}