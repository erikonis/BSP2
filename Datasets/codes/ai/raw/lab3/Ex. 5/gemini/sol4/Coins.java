import java.util.stream.IntStream;

public class Coins {
    public static void main(String[] args) {
        final int TARGET = 100;
        final int[] COINS = {20, 10, 5};
        final String[] COIN_NAMES = {"20c", "10c", "5c"};
        java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(0);

        System.out.println("Possible ways to decompose a 1€ coin (100 cents) into 20, 10, and 5 cent coins:");

        IntStream.rangeClosed(0, TARGET / COINS[0]) // Number of 20c coins
                .forEach(c20 -> IntStream.rangeClosed(0, (TARGET - c20 * COINS[0]) / COINS[1]) // Number of 10c coins
                        .forEach(c10 -> {
                            int remaining = TARGET - c20 * COINS[0] - c10 * COINS[1];
                            if (remaining % COINS[2] == 0) {
                                int c5 = remaining / COINS[2];
                                System.out.println(c20 + " x " + COIN_NAMES[0] + " + " +
                                                   c10 + " x " + COIN_NAMES[1] + " + " +
                                                   c5 + " x " + COIN_NAMES[2]);
                                count.incrementAndGet();
                            }
                        }));

        System.out.println("\nTotal number of possibilities: " + count.get());
    }
}