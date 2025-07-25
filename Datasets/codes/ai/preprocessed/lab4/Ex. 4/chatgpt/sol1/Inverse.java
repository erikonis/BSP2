import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the dimension of the vector
        System.out.print("Enter the dimension N of the vector: ");
        int N = scanner.nextInt();

        // Reading the vector
        double[] vector = new double[N];
        System.out.print("Enter the vector values: ");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        // Calculating and printing the inverse of the vector
        System.out.print("Inverse of the vector: ");
        for (int i = 0; i < N; i++) {
            System.out.print(-vector[i] + " ");
        }
        System.out.println();
    }
}
 {

}