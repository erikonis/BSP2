import java.util.Scanner;

public class VectorsAndMatricesAllInOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension N of the vector:");
        int N = scanner.nextInt();
        double[] vector = new double[N];

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        System.out.println("The inverse of the vector is:");
        for (int i = 0; i < N; i++) {
            System.out.print(-vector[i] + " ");
        }
        System.out.println();

        double norm = 0;
        for (double v : vector) {
            norm += v * v;
        }
        norm = Math.sqrt(norm);
        System.out.println("The Euclidean norm of the vector is: " + norm);

        System.out.println("Enter the elements of another vector for dot product:");
        double[] vector2 = new double[N];
        for (int i = 0; i < N; i++) {
            vector2[i] = scanner.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < N; i++) {
            dotProduct += vector[i] * vector2[i];
        }
        System.out.println("The dot product of the vectors is: " + dotProduct);

        System.out.println("Enter the dimension N of the matrix:");
        double[][] matrix = new double[N][N];
        double[] result = new double[N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }

        System.out.println("The result of the matrix-vector multiplication is:");
        for (double v : result) {
            System.out.print(v + " ");
        }
    }
}