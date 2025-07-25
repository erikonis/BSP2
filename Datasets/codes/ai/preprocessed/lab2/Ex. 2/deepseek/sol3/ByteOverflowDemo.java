public class ByteOverflowDemo {
    public static void main(String[] args) {
        byte maxByte = 127;
        byte minByte = -128;

        System.out.println("Byte Overflow Demo:");
        System.out.println("Max byte: " + maxByte);
        maxByte++;
        System.out.println("After overflow: " + maxByte);

        System.out.println("\nByte Underflow Demo:");
        System.out.println("Min byte: " + minByte);
        minByte--;
        System.out.println("After underflow: " + minByte);

        System.out.println("\nExplanation:");
        System.out.println("Bytes use 8 bits (2^8 = 256 values) in two's complement representation.");
        System.out.println("Overflow wraps around to the opposite end of the range.");
    }
}