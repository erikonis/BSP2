public class ByteOverflow {
    public static void main(String[] args) {
        byte max = 127;
        byte min = -128;

        // Overflow at the top limit
        byte overflowTop = (byte) (max + 1);
        System.out.println("Overflow at top limit: " + overflowTop); // Expected: -128

        // Overflow at the bottom limit
        byte overflowBottom = (byte) (min - 1);
        System.out.println("Overflow at bottom limit: " + overflowBottom); // Expected: 127
    }
}
