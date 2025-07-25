public class PrecisionFloatDouble {
    public static void main(String[] args) {
        double small = 1e-15; // very small number
        double large = 1e15;  // very large number
        
        // Adding small to large
        double result = small + large;
        
        // Printing the result
        System.out.println("Result of adding a very small number to a very large number: " + result);
    }
}
