import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vector dimension N: ");
        int N = scanner.nextInt();

        double[] vector = new double[N];
        System.out.println("Enter vector components:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        System.out.println("Inverse vector:");
        for (int i = 0; i < N; i++) {
            System.out.print(-vector[i] + " ");
        }

        scanner.close();
    }
}