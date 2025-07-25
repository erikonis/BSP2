public class NumericLimitsMainAlternative {
    public static void main(String[] args) {
        // Demonstrate byte overflow
        ByteOverflowHandler byteHandler = new ByteOverflowHandler();
        byteHandler.checkUpperOverflow((byte) 120, 10);
        byteHandler.checkLowerOverflow((byte) -120, 10);

        // Demonstrate integer overflow
        IntegerOverflowHandler intHandler = new IntegerOverflowHandler();
        intHandler.checkUpperOverflow(Integer.MAX_VALUE - 5, 10);
        intHandler.checkLowerOverflow(Integer.MIN_VALUE + 5, 10);

        // Demonstrate large number storage
        LargeNumberStorage largeNumberStorage = new LargeNumberStorage();
        largeNumberStorage.demonstrateStorage();

        // Demonstrate double precision
        DoublePrecisionTester doubleTester = new DoublePrecisionTester();
        doubleTester.testPrecision();
    }
}