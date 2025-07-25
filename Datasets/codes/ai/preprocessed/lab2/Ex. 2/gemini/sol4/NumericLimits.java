public class NumericLimits {

    public static void main(String[] args) {
        System.out.println("--- Byte Overflow ---");
        byte maxByte = 127;
        byte minByte = -128;

        System.out.println("Maximum byte value: " + maxByte);
        System.out.println("Adding 1 to maximum byte: " + (byte) (maxByte + 1));
        System.out.println("Minimum byte value: " + minByte);
        System.out.println("Subtracting 1 from minimum byte: " + (byte) (minByte - 1));
        System.out.println();

        System.out.println("--- Integer Overflow ---");
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Maximum integer value: " + maxInt);
        System.out.println("Adding 1 to maximum integer: " + (maxInt + 1));
        System.out.println("Minimum integer value: " + minInt);
        System.out.println("Subtracting 1 from minimum integer: " + (minInt - 1));
        System.out.println();

        System.out.println("--- Double Precision ---");
        double bigNumber = 1.0e16; // A very large number
        double smallNumber = 0.1;   // A small number
        double sum = bigNumber + smallNumber;
        System.out.println("Big number: " + bigNumber);
        System.out.println("Small number: " + smallNumber);
        System.out.println("Sum of big and small number: " + sum);
    }
}