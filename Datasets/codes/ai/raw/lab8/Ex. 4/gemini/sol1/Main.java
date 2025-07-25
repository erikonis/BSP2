import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        LoyaltyCard card1 = new LoyaltyCard("123");
        LoyaltyCard card2 = new LoyaltyCard("123"); // Same ID, different card object
        LoyaltyCard card3 = new LoyaltyCard("456");

        supermarket.registerPurchase(card1, 100);
        supermarket.registerPurchase(card2, 50); // Points added to card2, but card1 and card2 are considered the same

        System.out.println(card1);
        System.out.println(card2);


        supermarket.processRedemption(card1, 20);
        supermarket.processRedemption(card2, 10); // Fails, already redeemed today

        supermarket.printRedemptionRecords(LocalDate.now());

        supermarket.processRedemption(card3, 10);
        supermarket.printRedemptionRecords(LocalDate.now());

    }
}