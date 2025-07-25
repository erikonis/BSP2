public class Coins {
    public static void main(String[] args) {
        final int TARGET = 100; // 1 euro = 100 cents
        final int COIN_20 = 20;
        final int COIN_10 = 10;
        final int COIN_5 = 5;

        int count = 0;

        System.out.println("Possible combinations:");
        System.out.println("20c\t10c\t5c");
        System.out.println("-------------------");

        // Iterate through all possible counts of 20c coins
        for (int twenty = 0; twenty <= TARGET / COIN_20; twenty++) {
            // For each 20c count, iterate through possible 10c coins
            for (int ten = 0; ten <= (TARGET - twenty * COIN_20) / COIN_10; ten++) {
                // Calculate remaining amount to be made up with 5c coins
                int remaining = TARGET - twenty * COIN_20 - ten * COIN_10;
                if (remaining % COIN_5 == 0) {
                    int five = remaining / COIN_5;
                    System.out.printf("%d\t%d\t%d%n", twenty, ten, five);
                    count++;
                }
            }
        }

        System.out.println("-------------------");
        System.out.println("Total combinations: " + count);
    }
}