public class DoublePrecision {
    public static void main(String[] args) {
        double largeNumber = 1e308; // Very large number
        double smallNumber = 1e-308; // Very small number

        double result = largeNumber + smallNumber;
        System.out.println("Result of adding large and small double: " + result);
    }
}