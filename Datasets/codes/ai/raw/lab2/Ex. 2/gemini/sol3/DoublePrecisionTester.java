import java.math.BigDecimal;

public class DoublePrecisionTester {
    public void testPrecision() {
        System.out.println("--- Double Precision Test ---");
        double bigNumber = 2.0e16;
        double smallNumber = 0.3;
        double sumDouble = bigNumber + smallNumber;

        System.out.println("Big double: " + bigNumber);
        System.out.println("Small double: " + smallNumber);
        System.out.println("Sum (double): " + sumDouble);

        BigDecimal bigDecimal = new BigDecimal("2.0E+16");
        BigDecimal smallDecimal = new BigDecimal("0.3");
        BigDecimal sumBigDecimal = bigDecimal.add(smallDecimal);

        System.out.println("\nUsing BigDecimal for precise calculation:");
        System.out.println("Big BigDecimal: " + bigDecimal);
        System.out.println("Small BigDecimal: " + smallDecimal);
        System.out.println("Sum (BigDecimal): " + sumBigDecimal);
        System.out.println();
    }
}