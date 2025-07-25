import java.util.Arrays;
import java.util.Scanner;

// Inverse.java
public class Inverse {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Enter the dimension of the vector: ");
        int vectorSize = consoleIn.nextInt();

        double[] vectorValues = new double[vectorSize];
        System.out.println("Enter the vector's components:");
        for (int i = 0; i < vectorSize; i++) {
            vectorValues[i] = consoleIn.nextDouble();
        }

        double[] negativeVector = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            negativeVector[i] = -vectorValues[i];
        }

        System.out.println("The inverse vector is: " + Arrays.toString(negativeVector));
        consoleIn.close();
    }
}