public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        Customer customer = new Customer("John Doe");
        LoyaltyCard card1 = new LoyaltyCard("12345");
        LoyaltyCard card2 = new LoyaltyCard("12345"); // Same ID, different card
        LoyaltyCard card3 = new LoyaltyCard("67890");

        customer.addCard(card1);
        customer.addCard(card2);
        customer.addCard(card3);

        supermarket.addPurchase(card1, 100.0);
        supermarket.addPurchase(card2, 50.0);
        supermarket.addPurchase(card3, 200.0);

        System.out.println("Redeem card1: " + supermarket.redeem(card1, 10)); // Should succeed
        System.out.println("Redeem card2: " + supermarket.redeem(card2, 5)); // Should succeed
        System.out.println("Redeem card1 again: " + supermarket.redeem(card1, 10)); // Should fail

        supermarket.printRedeemedCards();
    }
}