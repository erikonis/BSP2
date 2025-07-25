public class IntegerOverflowHandler implements OverflowChecker<Integer> {
    @Override
    public void checkUpperOverflow(Integer initialValue, int increments) {
        System.out.println("--- Integer Upper Overflow Check ---");
        int value = initialValue;
        System.out.println("Initial int value: " + value);
        for (int i = 0; i < increments; i++) {
            value++;
            System.out.println("Incremented int value: " + value);
        }
        System.out.println();
    }

    @Override
    public void checkLowerOverflow(Integer initialValue, int decrements) {
        System.out.println("--- Integer Lower Overflow Check ---");
        int value = initialValue;
        System.out.println("Initial int value: " + value);
        for (int i = 0; i < decrements; i++) {
            value--;
            System.out.println("Decremented int value: " + value);
        }
        System.out.println();
    }
}