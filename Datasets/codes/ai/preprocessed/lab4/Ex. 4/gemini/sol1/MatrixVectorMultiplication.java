import java.util.Scanner;

public class MatrixVectorMultiplication {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int N = scanner.nextInt();

        doublematrix = new double[N][N];
        doublevector = new double[N];

        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter the vector components:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        doubleresult = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        System.out.println("Result vector:");
        for (double v : result) {
            System.out.print(v + " ");
        }
    }
}