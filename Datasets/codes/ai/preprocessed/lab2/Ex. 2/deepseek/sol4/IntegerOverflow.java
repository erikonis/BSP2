public class IntegerOverflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Integer overflow demonstration:");
        System.out.println("Max int value: " + maxInt);
        maxInt++;  // Overflow occurs here
        System.out.println("After incrementing max int: " + maxInt);

        System.out.println("\nMin int value: " + minInt);
        minInt--;  // Underflow occurs here
        System.out.println("After decrementing min int: " + minInt);

        // Larger type demonstration
        System.out.println("\nUsing larger types:");
        long largerValue = (long)Integer.MAX_VALUE + 1;
        System.out.println("Value that overflows int: " + largerValue);
    }
}