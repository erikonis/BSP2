public class Coins {
    public static void main(String[] args) {
        // Total value of 1 euro in cents
        int totalValue = 100;

        // Variables to track the number of possibilities
        int count = 0;

        // Loop over all possible combinations of 20, 10, and 5 cent coins
        for (int twenty = 0; twenty <= totalValue / 20; twenty++) {
            for (int ten = 0; ten <= (totalValue - twenty * 20) / 10; ten++) {
                for (int five = 0; five <= (totalValue - twenty * 20 - ten * 10) / 5; five++) {
                    // If the sum of the coins equals 100 cents, print the combination
                    if (twenty * 20 + ten * 10 + five * 5 == totalValue) {
                        System.out.println("20c: " + twenty + ", 10c: " + ten + ", 5c: " + five);
                        count++;
                    }
                }
            }
        }

        // Print the total number of possibilities
        System.out.println("Total number of possibilities: " + count);
    }
}
