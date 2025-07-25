import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n = scanner.nextInt();

        System.out.print("Enter second number: ");
        int m = scanner.nextInt();
        if (n < m) {
            for (int i = n; i < m + 1; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i > m - 1; i--) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
