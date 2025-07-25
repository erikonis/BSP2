public class IntOverflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Max Int: " + maxInt);
        System.out.println("Max Int + 1: " + (maxInt + 1)); // Overflow to minInt

        System.out.println("Min Int: " + minInt);
        System.out.println("Min Int - 1: " + (minInt - 1)); // Overflow to maxInt

        long maxLong = Long.MAX_VALUE;
        System.out.println("Max Long: " + maxLong);
    }
}