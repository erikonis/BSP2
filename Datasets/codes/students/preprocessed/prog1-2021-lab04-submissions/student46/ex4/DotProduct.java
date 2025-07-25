import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dimension: ");
        int dimension = scanner.nextInt();

        System.out.print("Enter vector 1: ");
        double[] vector1 = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            vector1[i] = scanner.nextDouble();
        }

        System.out.print("Enter vector 2: ");
        double[] vector2 = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            vector2[i] = scanner.nextDouble();
        }

        double dotProduct = 0.0;
        for (int i = 0; i < dimension; i++) {
            dotProduct += vector1[i] * vector2[i];
        }

        System.out.println("Dot product of the vectors: " + dotProduct);

        scanner.close();
    }
}