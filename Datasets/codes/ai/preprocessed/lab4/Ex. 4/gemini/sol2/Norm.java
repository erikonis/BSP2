import java.util.Scanner;

// Norm.java
public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector space: ");
        int n = scanner.nextInt();

        double[] v = new double[n];
        System.out.println("Enter the elements of the vector v:");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextDouble();
        }

        double euclideanNorm = 0;
        for (double element : v) {
            euclideanNorm += element * element;
        }
        euclideanNorm = Math.sqrt(euclideanNorm);

        System.out.println("The Euclidean norm of vector v is: " + euclideanNorm);
        scanner.close();
    }
}