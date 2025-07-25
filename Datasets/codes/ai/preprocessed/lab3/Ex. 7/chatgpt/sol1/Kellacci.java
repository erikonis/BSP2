import java.util.Scanner;
public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int k1 = 1, k2 = 1, kn;
        System.out.print(k1 + " " + k2 + " ");
        for (int i = 3; i <= n; i++) {
            kn = (k2 - 1) + (k1 * 2);
            System.out.print(kn + " ");
            k1 = k2;
            k2 = kn;
        }
    }
}