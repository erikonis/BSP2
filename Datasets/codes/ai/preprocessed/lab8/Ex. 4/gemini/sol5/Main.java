import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SupermarketLoyaltySystem loyaltySystem = new SupermarketLoyaltySystem();

        // Customer with multiple cards
        LoyaltyCard customer1Card1 = loyaltySystem.issueNewCard("CUST001");
        LoyaltyCard customer1Card2 = loyaltySystem.issueNewCard("CUST001");

        // Another customer
        LoyaltyCard customer2Card1 = loyaltySystem.issueNewCard("CUST002");

        // Purchases
        loyaltySystem.processPurchase(customer1Card1.getCardId(), 120.50);
        loyaltySystem.processPurchase(customer1Card2.getCardId(), 55.00);
        loyaltySystem.processPurchase(customer2Card1.getCardId(), 200.00);

        System.out.println("--- Attempting Redemptions on Day 1 ---");

        // Redemption attempts for customer 1 - card 1
        loyaltySystem.attemptRedeem(customer1Card1.getCardId(), 10);
        loyaltySystem.attemptRedeem(customer1Card1.getCardId(), 20);
        loyaltySystem.attemptRedeem(customer1Card1.getCardId(), 5);

        // Redemption attempt for customer 1 - card 2 (separate points)
        loyaltySystem.processPurchase(customer1Card2.getCardId(), 80.00);
        loyaltySystem.attemptRedeem(customer1Card2.getCardId(), 5);

        // Redemption attempt for customer 2
        loyaltySystem.attemptRedeem(customer2Card1.getCardId(), 15);
        loyaltySystem.attemptRedeem(customer2Card1.getCardId(), 10);

        // Start a new day
        loyaltySystem.startNewDay();

        System.out.println("--- Attempting Redemptions on Day 2 ---");

        // Redemption attempts on the new day
        loyaltySystem.attemptRedeem(customer1Card1.getCardId(), 15);
        loyaltySystem.attemptRedeem(customer2Card1.getCardId(), 5);

        // Attempt to redeem with a non-existent card
        loyaltySystem.attemptRedeem("NONEXISTENT", 5);

        // Inspect customer accounts (optional)
        CustomerAccount account1 = loyaltySystem.findAccount("CUST001");
        if (account1 != null) {
            System.out.println("\nAccount for Customer " + account1.getCustomerId() + ":");
            account1.getCards().forEach(System.out::println);
            System.out.println("Total Points: " + account1.getTotalPoints());
        }
    }
}