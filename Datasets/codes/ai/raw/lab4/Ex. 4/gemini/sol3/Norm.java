import java.util.Scanner;

// Norm.java
public class Norm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vector dimension: ");
        int size = input.nextInt();

        double[] vector = new double[size];
        System.out.println("Enter vector components:");
        for (int i = 0; i < size; i++) {
            vector[i] = input.nextDouble();
        }

        double normSquared = 0;
        for (double component : vector) {
            normSquared += component * component;
        }
        double vectorNorm = Math.sqrt(normSquared);

        System.out.println("Euclidean norm: " + vectorNorm);
        input.close();
    }
}