public class Main {
    public static void main(String[] args) {
        LoyaltyCard card1 = new LoyaltyCard("CUST123");
        LoyaltyCard card2 = new LoyaltyCard("CUST123"); // Same customer, different card
        LoyaltyCard card3 = new LoyaltyCard("CUST456");

        card1.addPurchase(100);
        card2.addPurchase(50);
        card3.addPurchase(200);

        LoyaltySystem system = new LoyaltySystem();

        System.out.println("Redeem from card1 (30 EUR): " + system.redeem(card1, 30));
        System.out.println("Redeem again from card1 (5 EUR): " + system.redeem(card1, 5)); // Should fail (same day)
        System.out.println("Redeem from card2 (5 EUR): " + system.redeem(card2, 5));
        System.out.println("Redeem from card3 (25 EUR): " + system.redeem(card3, 25));

        system.printRedeemedToday();
    }
}