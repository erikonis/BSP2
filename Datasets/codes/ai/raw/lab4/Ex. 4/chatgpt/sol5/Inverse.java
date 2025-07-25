import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector: ");
        int n = scanner.nextInt();

        double[] vector = new double[n];
        System.out.println("Enter the vector values:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
        }

        System.out.println("Inverse vector:");
        for (int i = 0; i < n; i++) {
            System.out.print(-vector[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
