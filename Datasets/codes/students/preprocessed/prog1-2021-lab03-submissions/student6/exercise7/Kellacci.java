import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Please type N number: ");
        n = scanner.nextInt();
        int k, k1 = 1, k2 = 1;

        for (int i = 1; i <= n; i++) {
        if (i <= 2) {
        System.out.println(1);
        } else {
        k = (k1 - 1) + (k2 * 2);
        k2 = k1;
        k1 = k;
        System.out.println("Kellacci numbers: " + k);
        }
        }
        scanner.close();
   
    }
}
