import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read dimension N
        int N = scanner.nextInt();
        
        // Read first vector
        double[] v1 = new double[N];
        for (int i = 0; i < N; i++) {
            v1[i] = scanner.nextDouble();
        }
        
        // Read second vector
        double[] v2 = new double[N];
        for (int i = 0; i < N; i++) {
            v2[i] = scanner.nextDouble();
        }
        
        // Calculate dot product
        double dotProduct = 0.0;
        for (int i = 0; i < N; i++) {
            dotProduct += v1[i] * v2[i];
        }
        
        System.out.println("Dot product: " + dotProduct);
    }
}