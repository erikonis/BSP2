import java.util.Arrays;
import java.util.Scanner;

// MatrixVectorMultiplication.java
public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter the dimension N of the square matrix: ");
        int matrixSizeN = inputReader.nextInt();

        double[][] matrixValues = new double[matrixSizeN][matrixSizeN];
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < matrixSizeN; i++) {
            for (int j = 0; j < matrixSizeN; j++) {
                matrixValues[i][j] = inputReader.nextDouble();
            }
        }

        double[] vectorValuesInput = new double[matrixSizeN];
        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < matrixSizeN; i++) {
            vectorValuesInput[i] = inputReader.nextDouble();
        }

        double[] productVectorResult = new double[matrixSizeN];
        for (int i = 0; i < matrixSizeN; i++) {
            double sumOfProducts = 0;
            for (int j = 0; j < matrixSizeN; j++) {
                sumOfProducts += matrixValues[i][j] * vectorValuesInput[j];
            }
            productVectorResult[i] = sumOfProducts;
        }

        System.out.println("The resulting vector from the matrix-vector multiplication is: " + Arrays.toString(productVectorResult));
        inputReader.close();
    }
}