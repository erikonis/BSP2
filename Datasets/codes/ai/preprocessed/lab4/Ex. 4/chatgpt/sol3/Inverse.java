import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of the vector: ");
        int n = sc.nextInt();

        double[] vector = new double[n];
        System.out.println("Enter the vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }

        System.out.println("Inverse of the vector:");
        for (int i = 0; i < n; i++) {
            System.out.print(-vector[i] + " ");
        }
        sc.close();
    }
}