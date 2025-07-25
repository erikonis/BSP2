import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension N of the square matrix: ");
        int n = sc.nextInt();

        double[][] matrix = new double[n][n];
        double[] vector = new double[n];
        double[] result = new double[n];

        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j] * vector[j];
            }
            result[i] = sum;
        }

        System.out.println("Result of matrix × vector multiplication:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}