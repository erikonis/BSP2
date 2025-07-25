import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SupermarketLoyaltySystem loyaltySystem = new SupermarketLoyaltySystem();

        // Customer with multiple cards
        LoyaltyCard customer1Card1 = loyaltySystem.createCard("CUST001");
        LoyaltyCard customer1Card2 = loyaltySystem.createCard("CUST001"); // Same ID

        // Another customer
        LoyaltyCard customer2Card1 = loyaltySystem.createCard("CUST002");

        // Purchases
        loyaltySystem.processPurchase("CUST001", 120.50); // Adds 12 points
        loyaltySystem.processPurchase("CUST001", 55.00);  // Adds 5 points
        loyaltySystem.processPurchase("CUST002", 200.00); // Adds 20 points

        System.out.println("--- Attempting Redemptions ---");

        // Redemption attempts for customer 1 - card 1
        loyaltySystem.attemptRedeem("CUST001", 10); // Successful
        loyaltySystem.attemptRedeem("CUST001", 20); // Insufficient points
        loyaltySystem.attemptRedeem("CUST001", 5);  // Already redeemed today

        // Redemption attempt for customer 1 - card 2 (separate points)
        loyaltySystem.processPurchase("CUST001", 80.00); // Adds 8 points to the second card
        loyaltySystem.attemptRedeem("CUST001", 5);  // Successful for the second card

        // Redemption attempt for customer 2
        loyaltySystem.attemptRedeem("CUST002", 15); // Successful
        loyaltySystem.attemptRedeem("CUST002", 10); // Already redeemed today

        // Attempt to redeem with a non-existent card
        loyaltySystem.attemptRedeem("NONEXISTENT", 5);
    }
}