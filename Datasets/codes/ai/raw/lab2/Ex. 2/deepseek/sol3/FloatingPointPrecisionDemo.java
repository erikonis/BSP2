public class FloatingPointPrecisionDemo {
    public static void main(String[] args) {
        double bigNumber = 1.0e20;      // 10^20
        double smallNumber = 1.0;       // Just 1
        
        System.out.println("Floating Point Precision Demo:");
        System.out.println("Big number: " + bigNumber);
        System.out.println("Small number: " + smallNumber);
        
        double sum = bigNumber + smallNumber;
        System.out.println("\nSum: " + sum);
        System.out.println("Difference from big number: " + (sum - bigNumber));
        
        System.out.println("\nExplanation:");
        System.out.println("Floating-point has limited precision (about 15-17 decimal digits for double)");
        System.out.println("When adding very large and small numbers, the small number may be lost due to precision limits");
        System.out.println("For precise decimal arithmetic, use BigDecimal");
    }
}