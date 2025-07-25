public class DoublePrecisionExample {
    public static void main(String[] args) {
        double bigNumber = 1.0e16; // A very large double
        double smallNumber = 0.1;   // A very small double relative to bigNumber

        double sum = bigNumber + smallNumber;

        System.out.println("Big number: " + bigNumber);
        System.out.println("Small number: " + smallNumber);
        System.out.println("Sum of big and small number: " + sum);

        // Expected mathematical result: 10000000000000000.1
        // The output will likely be: 1.0E16
    }
}