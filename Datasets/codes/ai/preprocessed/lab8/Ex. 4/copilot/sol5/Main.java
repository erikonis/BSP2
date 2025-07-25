public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        LoyaltyCard card1 = new LoyaltyCard("123", 100);
        LoyaltyCard card2 = new LoyaltyCard("123", 50);

        supermarket.addPurchase(card1, 200);
        System.out.println("Card1 points: " + card1.getPoints());

        supermarket.redeem(card1, 20);
        System.out.println("Card1 points after redeem: " + card1.getPoints());

        supermarket.redeem(card1, 20); // Should fail as card1 has already redeemed today
        supermarket.redeem(card2, 20); // Should succeed as card2 has not redeemed today
    }
}