import java.math.BigDecimal;
import java.math.BigInteger;

public class NumericLimitsAlternative {

    public static void main(String[] args) {
        demonstrateByteOverflow();
        demonstrateIntegerOverflowAndLargerType();
        demonstrateDoublePrecisionIssue();
    }

    public static void demonstrateByteOverflow() {
        System.out.println("--- Byte Overflow (Alternative Approach) ---");
        byte value = 120;
        System.out.println("Initial byte value: " + value);

        // Incrementing towards the limit
        for (int i = 0; i < 10; i++) {
            value++;
            System.out.println("Incremented byte value: " + value);
        }

        value = -120;
        System.out.println("\nInitial byte value: " + value);

        // Decrementing towards the limit
        for (int i = 0; i < 10; i++) {
            value--;
            System.out.println("Decremented byte value: " + value);
        }
        System.out.println();
    }

    public static void demonstrateIntegerOverflowAndLargerType() {
        System.out.println("--- Integer Overflow and BigInteger ---");
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        System.out.println("Maximum int: " + maxValue);
        System.out.println("Maximum int + 1 (overflow): " + (maxValue + 1));

        System.out.println("Minimum int: " + minValue);
        System.out.println("Minimum int - 1 (overflow): " + (minValue - 1));

        // Using BigInteger
        BigInteger bigMaxValue = BigInteger.valueOf(maxValue);
        BigInteger bigMinValue = BigInteger.valueOf(minValue);
        BigInteger one = BigInteger.ONE;

        System.out.println("\nUsing BigInteger:");
        System.out.println("BigInteger from max int: " + bigMaxValue);
        System.out.println("BigInteger max int + 1: " + bigMaxValue.add(one));
        System.out.println("BigInteger from min int: " + bigMinValue);
        System.out.println("BigInteger min int - 1: " + bigMinValue.subtract(one));
        System.out.println();
    }

    public static void demonstrateDoublePrecisionIssue() {
        System.out.println("--- Double Precision Issue (Alternative Approach with BigDecimal) ---");
        double bigDouble = 1.0e16;
        double smallDouble = 0.1;
        double sumDouble = bigDouble + smallDouble;

        System.out.println("Double: Big = " + bigDouble + ", Small = " + smallDouble + ", Sum = " + sumDouble);

        // Using BigDecimal for precise calculation
        BigDecimal bigDecimalBig = new BigDecimal("1.0E+16");
        BigDecimal bigDecimalSmall = new BigDecimal("0.1");
        BigDecimal sumBigDecimal = bigDecimalBig.add(bigDecimalSmall);

        System.out.println("BigDecimal: Big = " + bigDecimalBig + ", Small = " + bigDecimalSmall + ", Sum = " + sumBigDecimal);
        System.out.println();
    }
}