public class FloatDoublePrecision {
    public static void main(String[] args) {
        float smallFloat = 1e-10f;
        float largeFloat = 1e10f;
        
        double smallDouble = 1e-10;
        double largeDouble = 1e10;
        
        // Adding small to large float
        float resultFloat = smallFloat + largeFloat;
        System.out.println("Float result (small + large): " + resultFloat);  // Likely just largeFloat due to precision loss
        
        // Adding small to large double
        double resultDouble = smallDouble + largeDouble;
        System.out.println("Double result (small + large): " + resultDouble);  // Still likely just largeDouble
        
        // Exploring more precise additions
        System.out.println("Adding small numbers in float: " + (smallFloat + smallFloat));
        System.out.println("Adding small numbers in double: " + (smallDouble + smallDouble));
    }
}
