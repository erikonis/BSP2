import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vectors: ");
        int n = scanner.nextInt();

        double[] vectorA = new double[n];
        double[] vectorB = new double[n];
        System.out.println("Enter elements of vector A:");
        for (int i = 0; i < n; i++) {
            vectorA[i] = scanner.nextDouble();
        }

        System.out.println("Enter elements of vector B:");
        for (int i = 0; i < n; i++) {
            vectorB[i] = scanner.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < n; i++) {
            dotProduct += vectorA[i] * vectorB[i];
        }

        System.out.println("Dot product: " + dotProduct);
    }
}
