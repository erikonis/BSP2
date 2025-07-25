import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        supermarket.registerPurchase("123", 100);
        supermarket.registerPurchase("123", 50); // Points added to the same card

        LoyaltyCard card1 = supermarket.createOrGetCard("123");
        System.out.println(card1);


        supermarket.processRedemption("123", 20);
        supermarket.processRedemption("123", 10); // Fails, already redeemed today

        supermarket.printRedemptionRecords(LocalDate.now());

        supermarket.processRedemption("456", 10);
        supermarket.printRedemptionRecords(LocalDate.now());
    }
}