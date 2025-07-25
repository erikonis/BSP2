public class DotProduct extends VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = readDimension(scanner);

            System.out.println("First vector:");
            double[] v1 = readVector(scanner, n);

            System.out.println("Second vector:");
            double[] v2 = readVector(scanner, n);

            double product = computeDotProduct(v1, v2);
            System.out.printf("Dot product: %.4f%n", product);
        } finally {
            scanner.close();
        }
    }

    private static double computeDotProduct(double[] v1, double[] v2) {
        double result = 0.0;
        for (int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }
}