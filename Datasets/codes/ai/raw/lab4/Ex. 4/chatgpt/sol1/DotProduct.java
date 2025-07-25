public // DotProduct.java
import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the dimension of the vectors
        System.out.print("Enter the dimension N of the vectors: ");
        int N = scanner.nextInt();

        // Reading the first vector
        double[] vector1 = new double[N];
        System.out.print("Enter the values of the first vector: ");
        for (int i = 0; i < N; i++) {
            vector1[i] = scanner.nextDouble();
        }

        // Reading the second vector
        double[] vector2 = new double[N];
        System.out.print("Enter the values of the second vector: ");
        for (int i = 0; i < N; i++) {
            vector2[i] = scanner.nextDouble();
        }

        // Calculating the dot product
        double dotProduct = 0;
        for (int i = 0; i < N; i++) {
            dotProduct += vector1[i] * vector2[i];
        }

        // Printing the dot product
        System.out.println("Dot product of the vectors: " + dotProduct);
    }
}
 {
    
}
