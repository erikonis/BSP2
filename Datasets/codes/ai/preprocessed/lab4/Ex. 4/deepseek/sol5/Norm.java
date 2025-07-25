import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimension N
        int N = scanner.nextInt();

        // Read vector components
        double[] vector = new double[N];
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        // Calculate norm
        double sumOfSquares = 0.0;
        for (double component : vector) {
            sumOfSquares += component * component;
        }
        double norm = Math.sqrt(sumOfSquares);

        System.out.println("Euclidean norm: " + norm);
    }
}