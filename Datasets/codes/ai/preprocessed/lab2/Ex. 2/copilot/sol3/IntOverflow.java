public class IntOverflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // Overflow at the top limit
        int overflowTop = max + 1;
        System.out.println("Overflow at top limit: " + overflowTop); // Expected: -2,147,483,648

        // Overflow at the bottom limit
        int overflowBottom = min - 1;
        System.out.println("Overflow at bottom limit: " + overflowBottom); // Expected: 2,147,483,647
    }
}