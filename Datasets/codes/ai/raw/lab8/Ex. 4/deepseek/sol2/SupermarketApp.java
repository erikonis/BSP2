public class SupermarketApp {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        LoyaltyCard card1 = new LoyaltyCard.Builder().setId("CARD123").build();
        LoyaltyCard card2 = new LoyaltyCard.Builder().setId("CARD456").build();

        // Add points to cards
        card1.addPoints(100); // 10 points added
        card2.addPoints(200); // 20 points added

        // Attempt to redeem points
        if (supermarket.canRedeem(card1, 5)) {
            supermarket.addRedemption(card1);
            System.out.println("Card1 redemption successful!");
        } else {
            System.out.println("Card1 redemption failed.");
        }

        if (supermarket.canRedeem(card2, 25)) {
            supermarket.addRedemption(card2);
            System.out.println("Card2 redemption successful!");
        } else {
            System.out.println("Card2 redemption failed.");
        }

        // Print redemption history
        supermarket.printRedemptionHistory();
    }
}