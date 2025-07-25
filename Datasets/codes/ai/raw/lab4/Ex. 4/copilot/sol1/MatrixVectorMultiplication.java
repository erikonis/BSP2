package lab04.Ex. 4.copilot.sol4;

public package exercise4;

import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension N of the matrix and vector:");
        int N = scanner.nextInt();
        double[][] matrix = new double[N][N];
        double[] vector = new double[N];
        double[] result = new double[N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        System.out.println("The result of the matrix-vector multiplication is:");
        for (double v : result) {
            System.out.print(v + " ");
        }
    }
} {
    
}
