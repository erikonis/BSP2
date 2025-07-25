import java.util.Arrays;
import java.util.Scanner;

// Inverse.java
public class Inverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vector dimension: ");
        int size = input.nextInt();

        double[] vector = new double[size];
        System.out.println("Enter vector elements:");
        for (int i = 0; i < size; i++) {
            vector[i] = input.nextDouble();
        }

        double[] negatedVector = new double[size];
        for (int i = 0; i < size; i++) {
            negatedVector[i] = -vector[i];
        }

        System.out.println("Inverse vector: " + Arrays.toString(negatedVector));
        input.close();
    }
}