public class InverseVector extends VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = readDimension(scanner);
            System.out.println("Enter vector components:");
            double[] vector = readVector(scanner, n);
            double[] inverse = computeInverse(vector);
            printVector(inverse);
        } finally {
            scanner.close();
        }
    }

    private static double[] computeInverse(double[] vector) {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = -vector[i];
        }
        return result;
    }
}