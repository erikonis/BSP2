import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create some customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add loyalty cards to customers
        LoyaltyCard card1 = new LoyaltyCard();
        LoyaltyCard card2 = new LoyaltyCard();
        LoyaltyCard card3 = new LoyaltyCard();

        customer1.addCard(card1);
        customer1.addCard(card2);
        customer2.addCard(card3);

        // Add some points based on purchases
        card1.addPoints(100.0);
        card2.addPoints(50.0);
        card3.addPoints(150.0);

        // Create a supermarket
        Supermarket supermarket = new Supermarket();

        // Attempt to redeem points
        supermarket.redeemPoints(card1, 10.0); // Successful
        supermarket.redeemPoints(card1, 10.0); // Should fail: already redeemed today
        supermarket.redeemPoints(card2, 60.0); // Should fail: not enough points
        supermarket.redeemPoints(card3, 50.0); // Successful

        // Print redemption log
        supermarket.printRedemptionLog();
    }
}