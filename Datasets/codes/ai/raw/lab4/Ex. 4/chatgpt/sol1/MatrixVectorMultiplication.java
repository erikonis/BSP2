public // MatrixVectorMultiplication.java
import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the dimension N of the matrix
        System.out.print("Enter the dimension N of the matrix: ");
        int N = scanner.nextInt();

        // Reading the matrix
        double[][] matrix = new double[N][N];
        System.out.println("Enter the matrix values: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Reading the vector
        double[] vector = new double[N];
        System.out.print("Enter the vector values: ");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        // Multiplying the matrix by the vector
        double[] result = new double[N];
        for (int i = 0; i < N; i++) {
            result[i] = 0;
            for (int j = 0; j < N; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        // Printing the result of the multiplication
        System.out.print("Result of matrix-vector multiplication: ");
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
 {
    
}
