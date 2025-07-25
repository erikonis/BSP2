public class ByteOverflowDemo {
    public static void main(String[] args) {
        byte b = 127; // Maximum value for byte
        System.out.println("Initial value: " + b);

        // Overflow at the top limit
        b++;
        System.out.println("After incrementing: " + b); // Should print -128

        // Overflow at the bottom limit
        b = -128; // Minimum value for byte
        b--;
        System.out.println("After decrementing: " + b); // Should print 127
    }
}