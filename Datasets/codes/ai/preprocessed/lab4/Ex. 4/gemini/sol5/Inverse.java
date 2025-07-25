import java.util.Arrays;
import java.util.Scanner;

// Inverse.java
public class Inverse {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter the dimension of the vector space: ");
        int dimensionSize = inputReader.nextInt();

        double[] vectorComponents = new double[dimensionSize];
        System.out.println("Enter the components of the vector:");
        for (int i = 0; i < dimensionSize; i++) {
            vectorComponents[i] = inputReader.nextDouble();
        }

        double[] invertedVector = new double[dimensionSize];
        for (int i = 0; i < dimensionSize; i++) {
            invertedVector[i] = -vectorComponents[i];
        }

        System.out.println("The inverted vector is: " + Arrays.toString(invertedVector));
        inputReader.close();
    }
}