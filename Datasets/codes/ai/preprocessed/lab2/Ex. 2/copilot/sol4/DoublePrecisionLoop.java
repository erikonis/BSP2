public class DoublePrecisionLoop {
    public static void main(String[] args) {
        double largeNumber = 1e308; // Very large number
        double smallNumber = 1e-308; // Very small number

        double result = largeNumber;

        // Adding small number repeatedly
        for (int i = 0; i < 10; i++) {
            result += smallNumber;
            System.out.println("Result after adding small number: " + result);
        }
    }
}