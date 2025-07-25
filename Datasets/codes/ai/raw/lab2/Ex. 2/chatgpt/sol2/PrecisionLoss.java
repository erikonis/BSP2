public class PrecisionLoss {
    public static void main(String[] args) {
        float smallFloat = 1e-10f;  // Very small float
        float largeFloat = 1e10f;   // Very large float
        
        // Adding the small to large float
        float resultFloat = smallFloat + largeFloat;
        System.out.println("Float result: " + resultFloat); // Expecting result to be just largeFloat due to precision loss
        
        double smallDouble = 1e-10; // Very small double
        double largeDouble = 1e10;  // Very large double
        
        // Adding the small to large double
        double resultDouble = smallDouble + largeDouble;
        System.out.println("Double result: " + resultDouble); // Expecting result to be just largeDouble due to precision loss
    }
}
