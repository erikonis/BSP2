import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension N of the matrix and vector: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        double[] vector = new double[n];
        double[] result = new double[n];

        System.out.println("Enter elements of the matrix (row by row):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter elements of the vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j] * vector[j];
            }
            result[i] = sum;
        }

        System.out.println("Result of matrix × vector:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
