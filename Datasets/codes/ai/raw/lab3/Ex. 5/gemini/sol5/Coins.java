public class Coins {
    public static void main(String[] args) {
        final int TARGET = 100;
        final int[] COINS = {20, 10, 5};
        final String[] COIN_NAMES = {"20c", "10c", "5c"};
        int count = 0;

        System.out.println("Possible ways to decompose a 1€ coin (100 cents) into 20, 10, and 5 cent coins:");

        for (int c20 = 0; c20 <= TARGET / COINS[0]; c20++) {
            for (int c10 = 0; c10 <= (TARGET - c20 * COINS[0]) / COINS[1]; c10++) {
                int remaining = TARGET - c20 * COINS[0] - c10 * COINS[1];
                if (remaining % COINS[2] == 0) {
                    int c5 = remaining / COINS[2];
                    System.out.println(c20 + " x " + COIN_NAMES[0] + " + " +
                                       c10 + " x " + COIN_NAMES[1] + " + " +
                                       c5 + " x " + COIN_NAMES[2]);
                    count++;
                }
            }
        }

        System.out.println("\nTotal number of possibilities: " + count);
    }
}