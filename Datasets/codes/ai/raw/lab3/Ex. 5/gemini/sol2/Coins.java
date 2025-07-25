public class Coins {
    public static void main(String[] args) {
        int count = 0; // Initialize a counter for the number of possibilities

        System.out.println("Possible ways to decompose a 1€ coin (100 cents) into 20, 10, and 5 cent coins:");

        // Iterate through all possible combinations of 20, 10, and 5 cent coins
        for (int twentyCentCoins = 0; twentyCentCoins <= 5; twentyCentCoins++) { // Max 5 x 20c = 100c
            for (int tenCentCoins = 0; tenCentCoins <= 10; tenCentCoins++) {    // Max 10 x 10c = 100c
                for (int fiveCentCoins = 0; fiveCentCoins <= 20; fiveCentCoins++) { // Max 20 x 5c = 100c
                    // Check if the current combination equals 100 cents
                    if (twentyCentCoins * 20 + tenCentCoins * 10 + fiveCentCoins * 5 == 100) {
                        // Print the combination
                        System.out.println(twentyCentCoins + " x 20c + " + tenCentCoins + " x 10c + " + fiveCentCoins + " x 5c");
                        count++; // Increment the counter
                    }
                }
            }
        }

        // Print the total number of possibilities
        System.out.println("\nTotal number of possibilities: " + count);
    }
}