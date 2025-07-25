import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LoyaltySystem system = new LoyaltySystem();

        // Issue cards for a family (same ID)
        system.issueNewCard("FAMILY123");
        system.issueNewCard("FAMILY123");
        system.issueNewCard("FAMILY123");

        // Issue individual card
        system.issueNewCard("INDIVIDUAL1");

        // Record purchases
        system.recordPurchase("FAMILY123", 100.0); // Adds 10 points to each family card
        system.recordPurchase("INDIVIDUAL1", 50.0); // Adds 5 points

        // Try redemptions
        boolean redemption1 = system.redeemPoints("FAMILY123", 5);
        System.out.println("Redemption 1 (5 points): " + (redemption1 ? "Success" : "Failed"));

        boolean redemption2 = system.redeemPoints("FAMILY123", 5);
        System.out.println("Redemption 2 (5 points): " + (redemption2 ? "Success" : "Failed"));

        boolean redemption3 = system.redeemPoints("FAMILY123", 5);
        System.out.println("Redemption 3 (5 points): " + (redemption3 ? "Success" : "Failed"));

        boolean redemption4 = system.redeemPoints("FAMILY123", 5);
        System.out.println("Redemption 4 (5 points): " + (redemption4 ? "Success" : "Failed"));

        boolean individualRedemption = system.redeemPoints("INDIVIDUAL1", 5);
        System.out.println("Individual redemption (5 points): " + (individualRedemption ? "Success" : "Failed"));

        // Print all cards
        System.out.println("\nAll cards in system:");
        for (LoyaltyCard card : system.getAllCards()) {
            System.out.println(card);
        }
    }
}