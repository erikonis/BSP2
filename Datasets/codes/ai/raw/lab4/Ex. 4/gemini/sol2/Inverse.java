import java.util.Arrays;
import java.util.Scanner;

// Inverse.java
public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector space: ");
        int n = scanner.nextInt();

        double[] v = new double[n];
        System.out.println("Enter the elements of the vector v:");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextDouble();
        }

        double[] inverseV = new double[n];
        for (int i = 0; i < n; i++) {
            inverseV[i] = -v[i];
        }

        System.out.println("The inverse of vector v (-v) is: " + Arrays.toString(inverseV));
        scanner.close();
    }
}