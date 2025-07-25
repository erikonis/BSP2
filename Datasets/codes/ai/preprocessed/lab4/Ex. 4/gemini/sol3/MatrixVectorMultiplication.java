import java.util.Arrays;
import java.util.Scanner;

// MatrixVectorMultiplication.java
public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix dimension (NxN): ");
        int dimension = input.nextInt();

        double[][] matrix = new double[dimension][dimension];
        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        double[] vector = new double[dimension];
        System.out.println("Enter vector elements:");
        for (int i = 0; i < dimension; i++) {
            vector[i] = input.nextDouble();
        }

        double[] resultVector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            double sum = 0;
            for (int j = 0; j < dimension; j++) {
                sum += matrix[i][j] * vector[j];
            }
            resultVector[i] = sum;
        }

        System.out.println("Resultant vector: " + Arrays.toString(resultVector));
        input.close();
    }
}