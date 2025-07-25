import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimension N
        int N = scanner.nextInt();

        // Read NxN matrix
        double[][] matrix = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Read vector
        double[] vector = new double[N];
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        // Perform multiplication
        double[] result = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        // Print result
        System.out.print("Matrix-vector product: ");
        for (double value : result) {
            System.out.print(value + " ");
        }
    }
}