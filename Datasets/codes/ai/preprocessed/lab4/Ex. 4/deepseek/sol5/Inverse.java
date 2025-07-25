import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimension N
        int N = scanner.nextInt();

        // Read vector components
        double[] vector = new double[N];
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        // Calculate and print inverse
        System.out.print("Inverse vector: ");
        for (int i = 0; i < N; i++) {
            System.out.print(-vector[i] + " ");
        }
    }
}