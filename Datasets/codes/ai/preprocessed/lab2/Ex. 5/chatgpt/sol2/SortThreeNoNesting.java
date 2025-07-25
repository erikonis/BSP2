import java.util.Scanner;

public class SortThreeNoNesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int temp;

        if (a > b) {
            temp = a; a = b; b = temp;
        }

        if (a > c) {
            temp = a; a = c; c = temp;
        }

        if (b > c) {
            temp = b; b = c; c = temp;
        }

        System.out.println("Sorted: " + a + " " + b + " " + c);
    }
}