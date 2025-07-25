public class ByteOverflowVisualizer {
    public static void main(String[] args) {
        byte max = 127;
        byte min = -128;
        
        System.out.println("Starting with byte max: " + max + " and min: " + min);

        // Increment and show overflow behavior
        byte overflowAbove = (byte) (max + 1);
        byte overflowBelow = (byte) (min - 1);
        
        System.out.println("Overflow above 127: " + overflowAbove);  // Wraps to -128
        System.out.println("Overflow below -128: " + overflowBelow);  // Wraps to 127
        
        // Demonstrating the overflow in a loop (further)
        System.out.println("Incrementing beyond max...");
        for (byte i = 0; i < 130; i++) {
            System.out.print(i + " ");
        }
    }
}
