public class IntOverflowLoop {
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE - 5;

        // Incrementing to overflow
        for (int i = 0; i < 10; i++) {
            value++;
            System.out.println("Incrementing: " + value);
        }

        value = Integer.MIN_VALUE + 5;

        // Decrementing to overflow
        for (int i = 0; i < 10; i++) {
            value--;
            System.out.println("Decrementing: " + value);
        }
    }
}