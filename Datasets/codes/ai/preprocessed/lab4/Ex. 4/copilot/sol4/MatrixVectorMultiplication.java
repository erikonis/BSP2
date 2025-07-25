import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int N = scanner.nextInt();
        double[][] matrix = new double[N][N];
        double[] vector = new double[N];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        double[] resultVector = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultVector[i] += matrix[i][j] * vector[j];
            }
        }

        System.out.println("Result of matrix-vector multiplication:");
        for (double v : resultVector) {
            System.out.print(v + " ");
        }
    }
}