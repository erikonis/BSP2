public class OverflowByte {
    public static void main(String[] args) {
        byte max = 127;
        byte min = -128;
        
        // Overflowing above 127
        byte overflowAbove = (byte) (max + 1);
        System.out.println("Overflow above 127: " + overflowAbove); // Expecting -128 (wraps around)
        
        // Overflowing below -128
        byte overflowBelow = (byte) (min - 1);
        System.out.println("Overflow below -128: " + overflowBelow); // Expecting 127 (wraps around)
    }
}
