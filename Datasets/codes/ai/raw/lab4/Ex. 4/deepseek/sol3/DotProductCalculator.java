import java.util.Scanner;

public class DotProductCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter vector dimension N: ");
            int n = readPositiveInt(scanner);
            
            System.out.println("First vector:");
            double[] v1 = readVector(scanner, n);
            
            System.out.println("Second vector:");
            double[] v2 = readVector(scanner, n);
            
            double dotProduct = computeDotProduct(v1, v2);
            System.out.printf("Dot product: %.4f%n", dotProduct);
        }
    }

    // Reused methods
    private static int readPositiveInt(Scanner scanner) { /* same */ }
    private static double[] readVector(Scanner scanner, int n) { /* same */ }

    private static double computeDotProduct(double[] v1, double[] v2) {
        double result = 0.0;
        for (int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }
}