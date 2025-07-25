public class OverflowInt {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Overflow above Integer.MAX_VALUE
        int overflowAbove = maxInt + 1;
        System.out.println("Overflow above Integer.MAX_VALUE: " + overflowAbove); // Expecting Integer.MIN_VALUE

        // Overflow below Integer.MIN_VALUE
        int overflowBelow = minInt - 1;
        System.out.println("Overflow below Integer.MIN_VALUE: " + overflowBelow); // Expecting Integer.MAX_VALUE
    }
}