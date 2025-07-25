import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k1 = 1, k2 = 1, k, n = 1;
        System.out.println("Please insert a value for n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("K" + i + " = ");
            if (i == 1 || i == 2) {
                System.out.println(1);
            }
            else {
                k = (k1 - 1) + (k2 * 2);
                System.out.println(k);
                k2 = k1;
                k1 = k;
            }
        }

        scanner.close();
    }

}
