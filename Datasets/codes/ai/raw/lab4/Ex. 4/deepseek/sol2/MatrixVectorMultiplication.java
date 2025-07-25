import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter dimension N: ");
        int N = scanner.nextInt();
        
        double[][] matrix = new double[N][N];
        double[] vector = new double[N];
        
        System.out.println("Enter matrix row by row:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.println("Enter vector components:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }
        
        double[] result = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        
        System.out.println("Matrix-vector product:");
        for (double v : result) {
            System.out.print(v + " ");
        }
        
        scanner.close();
    }
}