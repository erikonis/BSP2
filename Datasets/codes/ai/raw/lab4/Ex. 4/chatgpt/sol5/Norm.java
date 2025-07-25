import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector: ");
        int n = scanner.nextInt();

        double[] vector = new double[n];
        double sumSquares = 0;

        System.out.println("Enter the vector values:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
            sumSquares += vector[i] * vector[i];
        }

        double norm = Math.sqrt(sumSquares);
        System.out.printf("Euclidean norm: %.3f\n", norm);

        scanner.close();
    }
}
