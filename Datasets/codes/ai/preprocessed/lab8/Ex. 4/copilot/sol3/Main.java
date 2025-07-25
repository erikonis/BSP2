public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        LoyaltyCard card1 = new LoyaltyCard("12345");
        LoyaltyCard card2 = new LoyaltyCard("12345");
        LoyaltyCard card3 = new LoyaltyCard("67890");

        supermarket.addPurchase(card1, 100);
        supermarket.addPurchase(card2, 200);
        supermarket.addPurchase(card3, 300);

        System.out.println("Card1 points: " + card1.getPoints());
        System.out.println("Card2 points: " + card2.getPoints());
        System.out.println("Card3 points: " + card3.getPoints());

        supermarket.redeem(card1, 5);
        supermarket.redeem(card2, 10);
        supermarket.redeem(card3, 20);

        supermarket.printRedeemedCards();
    }
}