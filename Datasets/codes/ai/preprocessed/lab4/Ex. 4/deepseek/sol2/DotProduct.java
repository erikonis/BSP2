import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vector dimension N: ");
        int N = scanner.nextInt();

        double[] v1 = new double[N];
        double[] v2 = new double[N];

        System.out.println("Enter first vector components:");
        for (int i = 0; i < N; i++) {
            v1[i] = scanner.nextDouble();
        }

        System.out.println("Enter second vector components:");
        for (int i = 0; i < N; i++) {
            v2[i] = scanner.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < N; i++) {
            dotProduct += v1[i] * v2[i];
        }

        System.out.println("Dot product: " + dotProduct);
        scanner.close();
    }
}