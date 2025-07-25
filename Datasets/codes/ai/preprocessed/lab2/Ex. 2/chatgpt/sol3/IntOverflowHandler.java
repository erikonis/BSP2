public class IntOverflowHandler {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Try to add a number and handle overflow
        int attempt1 = maxInt + 1;
        int attempt2 = minInt - 1;

        System.out.println("Max Int: " + maxInt + " + 1 = " + attempt1);
        System.out.println("Min Int: " + minInt + " - 1 = " + attempt2);

        // Demonstrating a reaction to overflow
        if (attempt1 == Integer.MIN_VALUE) {
            System.out.println("Overflow detected! Use Long for larger numbers.");
        }
        if (attempt2 == Integer.MAX_VALUE) {
            System.out.println("Overflow detected! Use Long for larger negative numbers.");
        }
    }
}