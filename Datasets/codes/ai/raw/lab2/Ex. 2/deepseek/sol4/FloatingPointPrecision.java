public class FloatingPointPrecision {
    public static void main(String[] args) {
        double bigNumber = 1.0e20;      // 10^20
        double smallNumber = 1.0;       // Just 1
        
        System.out.println("Floating-point precision demonstration:");
        System.out.println("Big number: " + bigNumber);
        System.out.println("Small number: " + smallNumber);
        
        double sum = bigNumber + smallNumber;
        System.out.println("Sum: " + sum);
        System.out.println("Difference from big number: " + (sum - bigNumber));
        
        // More precise calculation using BigDecimal
        System.out.println("\nUsing BigDecimal for precise arithmetic:");
        java.math.BigDecimal bdBig = new java.math.BigDecimal("1.0e20");
        java.math.BigDecimal bdSmall = new java.math.BigDecimal("1.0");
        System.out.println("Precise sum: " + bdBig.add(bdSmall));
    }
}