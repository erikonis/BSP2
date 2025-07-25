import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int N = scanner.nextInt();
        double[] vector = new double[N];

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        double norm = 0;
        for (int i = 0; i < N; i++) {
            norm += vector[i] * vector[i];
        }
        norm = Math.sqrt(norm);

        System.out.println("Euclidean norm: " + norm);
    }
}