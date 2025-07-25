public class IntOverflowDemo {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE; // Maximum value for int
        System.out.println("Initial value: " + i);

        // Overflow at the top limit
        i++;
        System.out.println("After incrementing: " + i); // Should print -2147483648

        // Overflow at the bottom limit
        i = Integer.MIN_VALUE; // Minimum value for int
        i--;
        System.out.println("After decrementing: " + i); // Should print 2147483647
    }
}