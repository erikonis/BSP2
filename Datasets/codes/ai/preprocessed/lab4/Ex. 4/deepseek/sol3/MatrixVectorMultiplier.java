import java.util.Scanner;

public class MatrixVectorMultiplier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter dimension N: ");
            int n = readPositiveInt(scanner);

            double[][] matrix = readMatrix(scanner, n);
            double[] vector = readVector(scanner, n);

            double[] result = multiplyMatrixVector(matrix, vector);

            System.out.println("Matrix-vector product:");
            printVector(result);
        }
    }

    private static double[][] readMatrix(Scanner scanner, int n) {
        double[][] matrix = new double[n][n];
        System.out.println("Enter matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number:");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    private static double[] multiplyMatrixVector(double[][] matrix, double[] vector) {
        double[] result = new double[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    // Reused methods
    private static int readPositiveInt(Scanner scanner) { /* same */ }
    private static double[] readVector(Scanner scanner, int n) { /* same */ }
    private static void printVector(double[] vector) { /* same */ }
}