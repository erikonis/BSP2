public class FloatingPointPrecisionDemo {
    public static void main(String[] args) {
        System.out.println("\nFloating-Point Precision Issues:");
        System.out.println("-------------------------------");
        
        double largeValue = 1.0e20;
        double smallValue = 1.0;
        double sum = largeValue + smallValue;
        
        System.out.println("Large value: " + largeValue);
        System.out.println("Small value: " + smallValue);
        System.out.println("Sum: " + sum);
        System.out.println("Difference from large value: " + (sum - largeValue));
        
        System.out.println("\nUsing BigDecimal for precise arithmetic:");
        java.math.BigDecimal preciseLarge = new java.math.BigDecimal("1.0e20");
        java.math.BigDecimal preciseSmall = new java.math.BigDecimal("1.0");
        System.out.println("Precise sum: " + preciseLarge.add(preciseSmall));
    }
}