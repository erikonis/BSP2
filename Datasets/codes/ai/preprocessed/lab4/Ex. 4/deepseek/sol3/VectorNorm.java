import java.util.Scanner;

public class VectorNorm {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter vector dimension N: ");
            int n = readPositiveInt(scanner);

            double[] vector = readVector(scanner, n);
            double norm = computeEuclideanNorm(vector);

            System.out.printf("Euclidean norm: %.4f%n", norm);
        }
    }

    // Reused methods from InverseVector.java
    private static int readPositiveInt(Scanner scanner) { /* same */ }
    private static double[] readVector(Scanner scanner, int n) { /* same */ }
    private static void printVector(double[] vector) { /* same */ }

    private static double computeEuclideanNorm(double[] vector) {
        double sumOfSquares = 0.0;
        for (double v : vector) {
            sumOfSquares += v * v;
        }
        return Math.sqrt(sumOfSquares);
    }
}