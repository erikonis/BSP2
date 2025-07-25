public class IntegerOverflowDemo {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Integer Overflow Demo:");
        System.out.println("Max int: " + maxInt);
        maxInt++;
        System.out.println("After overflow: " + maxInt);

        System.out.println("\nInteger Underflow Demo:");
        System.out.println("Min int: " + minInt);
        minInt--;
        System.out.println("After underflow: " + minInt);

        System.out.println("\nAlternative Types:");
        System.out.println("Long can store larger numbers (up to " + Long.MAX_VALUE + ")");
        System.out.println("BigInteger can store arbitrarily large integers");
    }
}