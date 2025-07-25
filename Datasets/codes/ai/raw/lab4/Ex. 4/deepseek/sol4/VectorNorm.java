public class VectorNorm extends VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = readDimension(scanner);
            System.out.println("Enter vector components:");
            double[] vector = readVector(scanner, n);
            double norm = computeNorm(vector);
            System.out.printf("Euclidean norm: %.4f%n", norm);
        } finally {
            scanner.close();
        }
    }

    private static double computeNorm(double[] vector) {
        double sum = 0.0;
        for (double v : vector) {
            sum += v * v;
        }
        return Math.sqrt(sum);
    }
}