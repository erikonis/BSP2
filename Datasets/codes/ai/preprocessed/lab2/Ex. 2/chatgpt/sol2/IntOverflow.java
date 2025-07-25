public class IntOverflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Testing overflow above Integer.MAX_VALUE
        int overflowAbove = maxInt + 1;
        System.out.println("Overflow above Integer.MAX_VALUE: " + overflowAbove); // Expecting Integer.MIN_VALUE

        // Testing overflow below Integer.MIN_VALUE
        int overflowBelow = minInt - 1;
        System.out.println("Overflow below Integer.MIN_VALUE: " + overflowBelow); // Expecting Integer.MAX_VALUE

        // Showing Long overflow
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        // Testing overflow for Long
        long overflowLongAbove = maxLong + 1;
        System.out.println("Overflow above Long.MAX_VALUE: " + overflowLongAbove); // Expecting Long.MIN_VALUE

        long overflowLongBelow = minLong - 1;
        System.out.println("Overflow below Long.MIN_VALUE: " + overflowLongBelow); // Expecting Long.MAX_VALUE
    }
}