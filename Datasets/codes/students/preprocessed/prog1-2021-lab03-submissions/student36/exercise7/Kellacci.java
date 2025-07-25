import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K1 = 1, K2 = 1;
        System.out.println("Enter an integer number n: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(K1 + " ");
            int Kellacci = (K1 - 1) + (K2 * 2);
            if (n > 2)
            K1 = K2;
            K2 = Kellacci;
            i++;
        }
        scanner.close();
    }
}
