import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create loyalty cards
        LoyaltyCard card1 = new LoyaltyCard("C1");
        LoyaltyCard card2 = new LoyaltyCard("C2");
        LoyaltyCard card3 = new LoyaltyCard("C3");

        // Add cards to customers
        customer1.addCard(card1);
        customer1.addCard(card2);
        customer2.addCard(card3);

        // Add points to the cards based on purchases
        card1.addPoints(100);
        card2.addPoints(50);
        card3.addPoints(75);

        // Create a supermarket
        Supermarket supermarket = new Supermarket();

        // Try redeeming points
        supermarket.redeemPoints(card1, 10); // Success
        supermarket.redeemPoints(card1, 10); // Failure (redeemed today already
        supermarket.redeemPoints(card2, 60); // Failure (not enough points)
        supermarket.redeemPoints(card3, 25); // Success

        // Display today's redemption log
        supermarket.displayRedemptionLog();
    }
}
