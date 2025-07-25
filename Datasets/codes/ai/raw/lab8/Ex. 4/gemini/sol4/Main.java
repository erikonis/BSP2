// Main.java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SupermarketLoyaltySystem loyaltySystem = new SupermarketLoyaltySystem();

        // Customer with one account (representing all their cards)
        loyaltySystem.createAccount("FAMILY001");
        LoyaltyCard familyAccount = loyaltySystem.findAccount("FAMILY001");

        // Another customer
        loyaltySystem.createAccount("INDIVIDUAL002");

        // Purchases for the family account
        loyaltySystem.processPurchase("FAMILY001", 150.00); // Adds 15 points
        loyaltySystem.processPurchase("FAMILY001", 75.50);  // Adds 7 points

        // Purchase for the individual account
        loyaltySystem.processPurchase("INDIVIDUAL002", 220.00); // Adds 22 points

        System.out.println("--- Attempting Redemptions on Day 1 ---");

        // Redemption attempts for the family account
        loyaltySystem.attemptRedeem("FAMILY001", 10); // Successful
        loyaltySystem.attemptRedeem("FAMILY001", 25); // Insufficient points
        loyaltySystem.attemptRedeem("FAMILY001", 5);  // Already redeemed today

        // Redemption attempt for the individual account
        loyaltySystem.attemptRedeem("INDIVIDUAL002", 18); // Successful
        loyaltySystem.attemptRedeem("INDIVIDUAL002", 10); // Already redeemed today

        // Start a new day
        loyaltySystem.startNewDay();

        System.out.println("--- Attempting Redemptions on Day 2 ---");

        // Redemption attempts on the new day
        loyaltySystem.attemptRedeem("FAMILY001", 15); // Successful (redemption flag reset)
        loyaltySystem.attemptRedeem("INDIVIDUAL002", 5); // Successful (redemption flag reset)

        // Attempt to redeem with a non-existent account
        loyaltySystem.attemptRedeem("NONEXISTENT", 5);
    }
}