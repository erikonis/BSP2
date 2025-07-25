package lu.uni.programming1.lab4.ex4;

import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dimension: ");
        int dimension = scanner.nextInt();

        System.out.print("Enter NxN matrix: ");
        double[][] matrix = new double[dimension][dimension];
        for (int j = 0; j < dimension; j++) {
            for (int i = 0; i < dimension; i++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Enter vector: ");
        double[] vector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextDouble();
        }

        double[] result = new double[dimension];
        for (int j = 0; j < dimension; j++) { // iterate over matrix rows
            for (int i = 0; i < dimension; i++) {
                result[j] += vector[i] * matrix[i][j];
            }
        }

        System.out.println("M x v: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(result[i] + ((i < dimension - 1) ? "," : ""));
        }

        scanner.close();
    }
}