import java.util.Scanner;

// MatrixVectorMultiplication.java
public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector space (NxN matrix): ");
        int n = scanner.nextInt();

        double[][] m = new double[n][n];
        System.out.println("Enter the elements of the " + n + "x" + n + " matrix m row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }

        double[] v = new double[n];
        System.out.println("Enter the elements of the " + n + "-dimensional vector v:");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextDouble();
        }

        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i] += m[i][j] * v[j];
            }
        }

        System.out.println("The result of the matrix-vector multiplication (m x v) is: " + Arrays.toString(result));
        scanner.close();
    }
}