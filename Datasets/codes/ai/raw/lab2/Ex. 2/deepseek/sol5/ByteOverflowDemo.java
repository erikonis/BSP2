public class ByteOverflowDemo {
    public static void main(String[] args) {
        System.out.println("Byte Overflow Demonstration:");
        System.out.println("---------------------------");
        
        byte maxByte = Byte.MAX_VALUE;  // 127
        byte minByte = Byte.MIN_VALUE;  // -128
        
        System.out.println("Max byte value: " + maxByte);
        maxByte++;
        System.out.println("After overflow: " + maxByte);
        
        System.out.println("\nMin byte value: " + minByte);
        minByte--;
        System.out.println("After underflow: " + minByte);
    }
}