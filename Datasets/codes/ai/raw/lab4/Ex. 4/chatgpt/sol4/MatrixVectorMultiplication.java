import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matrix size (N x N): ");
        int n = input.nextInt();

        double[][] matrix = new double[n][n];
        double[] vector = new double[n];
        double[] result = new double[n];

        System.out.println("Enter matrix values:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = input.nextDouble();

        System.out.println("Enter vector values:");
        for (int i = 0; i < n; i++)
            vector[i] = input.nextDouble();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i] += matrix[i][j] * vector[j];

        System.out.println("Result of matrix × vector:");
        for (double val : result)
            System.out.print(val + " ");

        input.close();
    }
}
