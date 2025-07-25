import java.util.Scanner;

public class SortWithoutNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Swap a and b if needed
        if (a > b) {
            int temp = a; a = b; b = temp;
        }
        // Swap b and c if needed
        if (b > c) {
            int temp = b; b = c; c = temp;
        }
        // Swap a and b again in case the first swap broke the order
        if (a > b) {
            int temp = a; a = b; b = temp;
        }

        System.out.println("Sorted: " + a + " " + b + " " + c);
    }
}
