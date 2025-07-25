import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, K, Kn1, Kn2, counter;
        System.out.print("Please enter an integer: ");
        n = scanner.nextInt();
        scanner.close();
        counter = 1;
        Kn1 = 1;
        Kn2 = 1;
        while (counter < n + 1) {
            switch (counter) {
            case 1, 2:
                System.out.printf("K%d = %d\n", counter, 1);
                break;

            default:
                K = (Kn1 - 1) + (Kn2 * 2);
                System.out.printf("K%d = %d\n", counter, K);
                Kn2 = Kn1;
                Kn1 = K;
                break;
            }
            ++counter;
        }

    }
}
