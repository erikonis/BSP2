import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int k = (b - 1) + (a * 2);
            System.out.print(k + " ");
            a = b;
            b = k;
        }
    }
}