public class ByteOverflowArithmetic {
    public static void main(String[] args) {
        byte max = 127;
        byte min = -128;

        // Overflow at the top limit
        byte overflowTop = (byte) (max + 10);
        System.out.println("Overflow at top limit (127 + 10): " + overflowTop); // Expected: -119

        // Underflow at the bottom limit
        byte underflowBottom = (byte) (min - 10);
        System.out.println("Underflow at bottom limit (-128 - 10): " + underflowBottom); // Expected: 118
    }
}
