import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter vector dimension N: ");
        int N = scanner.nextInt();
        
        double[] vector = new double[N];
        System.out.println("Enter vector components:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }
        
        double sum = 0;
        for (double v : vector) {
            sum += v * v;
        }
        double norm = Math.sqrt(sum);
        
        System.out.println("Euclidean norm: " + norm);
        scanner.close();
    }
}