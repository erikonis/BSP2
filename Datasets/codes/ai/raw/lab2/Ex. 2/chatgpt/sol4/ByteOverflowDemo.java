public class ByteOverflowDemo {
    public static void main(String[] args) {
        byte maxByte = 127;
        byte minByte = -128;

        // Overflow when incrementing beyond 127
        byte overflowAbove = (byte) (maxByte + 1); // Overflow from 127 to -128
        System.out.println("Overflow when exceeding 127: " + overflowAbove); // Expected output: -128

        // Overflow when decrementing below -128
        byte overflowBelow = (byte) (minByte - 1); // Overflow from -128 to 127
        System.out.println("Overflow when exceeding -128: " + overflowBelow); // Expected output: 127
    }
}
