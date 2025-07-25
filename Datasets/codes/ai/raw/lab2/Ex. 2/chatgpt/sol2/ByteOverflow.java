public class ByteOverflow {
    public static void main(String[] args) {
        byte max = 127;
        byte min = -128;
        
        // Testing overflow above 127
        byte overflowAbove = (byte) (max + 1); // 127 + 1 will overflow
        System.out.println("Overflow above 127: " + overflowAbove); // Expecting -128
        
        // Testing overflow below -128
        byte overflowBelow = (byte) (min - 1); // -128 - 1 will overflow
        System.out.println("Overflow below -128: " + overflowBelow); // Expecting 127
    }
}
