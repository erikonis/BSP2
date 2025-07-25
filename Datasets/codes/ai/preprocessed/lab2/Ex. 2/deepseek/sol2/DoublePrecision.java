public class DoublePrecision {
    public static void demonstratePrecisionIssue() {
        double largeNumber = 1.0e20; // A very large number
        double smallNumber = 1.0;    // A very small number

        double result = largeNumber + smallNumber;
        System.out.println("Result: " + result); // Should print 1.0E20 (precision loss)
    }
}