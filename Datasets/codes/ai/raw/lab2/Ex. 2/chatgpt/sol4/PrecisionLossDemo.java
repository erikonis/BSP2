public class PrecisionLossDemo {
    public static void main(String[] args) {
        float smallFloat = 1e-10f;  // A very small float value
        float largeFloat = 1e10f;   // A very large float value
        
        // Adding a small float to a large float
        float floatResult = smallFloat + largeFloat;
        System.out.println("Result of adding small float to large float: " + floatResult); // Should show large value
        
        double smallDouble = 1e-10; // A very small double value
        double largeDouble = 1e10;  // A very large double value
        
        // Adding a small double to a large double
        double doubleResult = smallDouble + largeDouble;
        System.out.println("Result of adding small double to large double: " + doubleResult); // Should show large value
    }
}
