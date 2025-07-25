public class ByteOverflowLoop {
    public static void main(String[] args) {
        byte value = 120;

        // Incrementing to overflow
        for (int i = 0; i < 10; i++) {
            value++;
            System.out.println("Incrementing: " + value);
        }

        value = -120;

        // Decrementing to overflow
        for (int i = 0; i < 10; i++) {
            value--;
            System.out.println("Decrementing: " + value);
        }
    }
}
