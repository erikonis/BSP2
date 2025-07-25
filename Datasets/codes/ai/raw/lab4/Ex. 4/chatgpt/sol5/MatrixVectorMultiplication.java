import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix/vector dimension N: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        double[] vector = new double[n];
        double[] result = new double[n];

        System.out.println("Enter matrix values row-by-row:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = scanner.nextDouble();

        System.out.println("Enter vector values:");
        for (int i = 0; i < n; i++)
            vector[i] = scanner.nextDouble();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i] += matrix[i][j] * vector[j];

        System.out.println("Result (Matrix × Vector):");
        for (double val : result)
            System.out.print(val + " ");
        System.out.println();

        scanner.close();
    }
}
