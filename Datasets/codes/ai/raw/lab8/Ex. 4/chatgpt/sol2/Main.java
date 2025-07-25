public class Main {
    public static void main(String[] args) {
        Supermarket market = new Supermarket();

        LoyaltyCard card1 = new LoyaltyCard("CUST123");
        LoyaltyCard card2 = new LoyaltyCard("CUST123"); // Different instance, same ID

        card1.addPurchase(100.0); // +10 points
        card2.addPurchase(50.0);  // +5 points

        market.processRedeem(card1, 8.0); // Should succeed
        market.processRedeem(card2, 4.0); // Should fail: already redeemed today
        market.processRedeem(card2, 3.0); // Should still fail due to prior redemption

        market.logStatus();
    }
}