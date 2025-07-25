public class ByteOverflowHandler implements OverflowChecker<Byte> {
    @Override
    public void checkUpperOverflow(Byte initialValue, int increments) {
        System.out.println("--- Byte Upper Overflow Check ---");
        byte value = initialValue;
        System.out.println("Initial byte value: " + value);
        for (int i = 0; i < increments; i++) {
            value++;
            System.out.println("Incremented byte value: " + value);
        }
        System.out.println();
    }

    @Override
    public void checkLowerOverflow(Byte initialValue, int decrements) {
        System.out.println("--- Byte Lower Overflow Check ---");
        byte value = initialValue;
        System.out.println("Initial byte value: " + value);
        for (int i = 0; i < decrements; i++) {
            value--;
            System.out.println("Decremented byte value: " + value);
        }
        System.out.println();
    }
}