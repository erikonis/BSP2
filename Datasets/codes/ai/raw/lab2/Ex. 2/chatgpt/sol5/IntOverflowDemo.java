import java.math.BigInteger;

public class IntOverflowDemo {
    public static void main(String[] args) {
        System.out.println("=== Int Overflow Demo ===");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE = " + max);
        System.out.println("Integer.MIN_VALUE = " + min);

        int overflow = max + 1;
        int underflow = min - 1;
        System.out.println("Overflow (max + 1): " + overflow);
        System.out.println("Underflow (min - 1): " + underflow);

        BigInteger big = new BigInteger(Long.toString(Long.MAX_VALUE));
        big = big.add(BigInteger.ONE);
        System.out.println("BigInteger (Long.MAX_VALUE + 1): " + big);

        System.out.println("Explanation: Use long or BigInteger for large numbers to avoid overflow.");
    }
}
