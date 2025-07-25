import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vectors: ");
        int n = scanner.nextInt();

        double[] v1 = new double[n];
        double[] v2 = new double[n];

        System.out.println("Enter elements of first vector:");
        for (int i = 0; i < n; i++) {
            v1[i] = scanner.nextDouble();
        }

        System.out.println("Enter elements of second vector:");
        for (int i = 0; i < n; i++) {
            v2[i] = scanner.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < n; i++) {
            dotProduct += v1[i] * v2[i];
        }

        System.out.println("Dot product: " + dotProduct);
        scanner.close();
    }
}
