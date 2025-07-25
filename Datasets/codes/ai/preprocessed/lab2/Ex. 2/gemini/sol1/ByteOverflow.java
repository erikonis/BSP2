public class ByteOverflow {
    public static void main(String[] args) {
        byte maxByte = 127;
        byte minByte = -128;

        System.out.println("Max Byte: " + maxByte);
        System.out.println("Max Byte + 1: " + (byte) (maxByte + 1)); // Overflow to -128

        System.out.println("Min Byte: " + minByte);
        System.out.println("Min Byte - 1: " + (byte) (minByte - 1)); // Overflow to 127
    }
}