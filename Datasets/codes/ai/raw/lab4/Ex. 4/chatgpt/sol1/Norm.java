public // Norm.java
import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the dimension of the vector
        System.out.print("Enter the dimension N of the vector: ");
        int N = scanner.nextInt();

        // Reading the vector
        double[] vector = new double[N];
        System.out.print("Enter the vector values: ");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        // Calculating the Euclidean norm of the vector
        double norm = 0;
        for (int i = 0; i < N; i++) {
            norm += vector[i] * vector[i];
        }
        norm = Math.sqrt(norm);

        // Printing the Euclidean norm
        System.out.println("Euclidean norm of the vector: " + norm);
    }
}
 {
    
}
