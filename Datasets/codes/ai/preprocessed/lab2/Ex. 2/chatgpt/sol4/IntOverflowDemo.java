public class IntOverflowDemo {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Overflow above Integer.MAX_VALUE
        int overflowAbove = maxInt + 1; // Wraps around to Integer.MIN_VALUE
        System.out.println("Overflow when exceeding Integer.MAX_VALUE: " + overflowAbove); // Expected: Integer.MIN_VALUE

        // Overflow below Integer.MIN_VALUE
        int overflowBelow = minInt - 1; // Wraps around to Integer.MAX_VALUE
        System.out.println("Overflow when exceeding Integer.MIN_VALUE: " + overflowBelow); // Expected: Integer.MAX_VALUE

        // Using long for larger numbers
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        // Overflow with Long.MAX_VALUE
        long overflowLongAbove = maxLong + 1;
        System.out.println("Overflow with Long.MAX_VALUE: " + overflowLongAbove); // Expected: Long.MIN_VALUE

        // Overflow with Long.MIN_VALUE
        long overflowLongBelow = minLong - 1;
        System.out.println("Overflow with Long.MIN_VALUE: " + overflowLongBelow); // Expected: Long.MAX_VALUE
    }
}