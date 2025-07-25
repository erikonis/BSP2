public class IntOverflowArithmetic {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // Overflow at the top limit
        int overflowTop = max + 100;
        System.out.println("Overflow at top limit (Integer.MAX_VALUE + 100): " + overflowTop); // Expected: -2,147,483,548

        // Underflow at the bottom limit
        int underflowBottom = min - 100;
        System.out.println("Underflow at bottom limit (Integer.MIN_VALUE - 100): " + underflowBottom); // Expected: 2,147,483,548
    }
}