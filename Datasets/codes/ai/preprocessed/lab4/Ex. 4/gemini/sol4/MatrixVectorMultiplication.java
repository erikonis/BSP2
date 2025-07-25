import java.util.Arrays;
import java.util.Scanner;

// MatrixVectorMultiplication.java
public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Enter the dimension of the square matrix (N): ");
        int matrixDimension = consoleIn.nextInt();

        double[][] matrixData = new double[matrixDimension][matrixDimension];
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                matrixData[i][j] = consoleIn.nextDouble();
            }
        }

        double[] vectorData = new double[matrixDimension];
        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < matrixDimension; i++) {
            vectorData[i] = consoleIn.nextDouble();
        }

        double[] productVector = new double[matrixDimension];
        for (int i = 0; i < matrixDimension; i++) {
            double sum = 0;
            for (int j = 0; j < matrixDimension; j++) {
                sum += matrixData[i][j] * vectorData[j];
            }
            productVector[i] = sum;
        }

        System.out.println("The result of the matrix-vector multiplication is: " + Arrays.toString(productVector));
        consoleIn.close();
    }
}