import java.util.Scanner;
import java.util.InputMismatchException;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = readDimension(scanner);
            
            System.out.println("Enter matrix (row-wise):");
            double[][] matrix = readMatrix(scanner, n);
            
            System.out.println("Enter vector:");
            double[] vector = readVector(scanner, n);
            
            double[] result = multiply(matrix, vector);
            printVector(result);
        } finally {
            scanner.close();
        }
    }

    private static int readDimension(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter dimension (N > 0): ");
                int n = scanner.nextInt();
                if (n > 0) return n;
                System.out.println("Dimension must be positive.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
    }

    private static double[][] readMatrix(Scanner scanner, int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    try {
                        System.out.printf("Enter matrix[%d][%d]: ", i, j);
                        matrix[i][j] = scanner.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                }
            }
        }
        return matrix;
    }

    private static double[] readVector(Scanner scanner, int n) {
        double[] vector = new double[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.printf("Enter vector[%d]: ", i);
                    vector[i] = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }
        }
        return vector;
    }

    private static double[] multiply(double[][] matrix, double[] vector) {
        double[] result = new double[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    private static void printVector(double[] vector) {
        System.out.print("Result: [");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}