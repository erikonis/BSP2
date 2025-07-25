public class ByteOverflow {
    public static void main(String[] args) {
        byte maxByte = 127;
        byte minByte = -128;
        
        System.out.println("Byte overflow demonstration:");
        System.out.println("Initial max byte value: " + maxByte);
        maxByte++;  // Overflow occurs here
        System.out.println("After incrementing max byte: " + maxByte);
        
        System.out.println("\nInitial min byte value: " + minByte);
        minByte--;  // Underflow occurs here
        System.out.println("After decrementing min byte: " + minByte);
    }
}