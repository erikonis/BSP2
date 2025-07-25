public class ByteOverflowDemo {
    public static void main(String[] args) {
        System.out.println("=== Byte Overflow Demo ===");
        byte b = 127;
        System.out.println("Initial byte value: " + b);
        b++; // Overflow
        System.out.println("After incrementing: " + b);
        b = -128;
        System.out.println("Initial byte value: " + b);
        b--; // Underflow
        System.out.println("After decrementing: " + b);

        System.out.println("Explanation: Byte uses 8 bits (2's complement). It wraps around at its limits.");
    }
}
