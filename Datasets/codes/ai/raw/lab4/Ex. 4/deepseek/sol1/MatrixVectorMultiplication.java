package lab04.Ex. 4.deepseek.sol1;

public package exercise4;

import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];
        double[] vector = new double[n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
        }

        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            result[i] = 0;
            for (int j = 0; j < n; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
} {
    
}
