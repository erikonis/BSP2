import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SupermarketLoyaltySystem {
    private final Map<String, LoyaltyCard> loyaltyAccounts; // Using customerId as the key

    public SupermarketLoyaltySystem() {
        this.loyaltyAccounts = new HashMap<>();
    }

    public LoyaltyCard createAccount(String customerId) {
        if (!loyaltyAccounts.containsKey(customerId)) {
            LoyaltyCard newAccount = new LoyaltyCard(customerId);
            loyaltyAccounts.put(customerId, newAccount);
            return newAccount;
        }
        return loyaltyAccounts.get(customerId); // Return existing account if ID already exists
    }

    public LoyaltyCard findAccount(String customerId) {
        return loyaltyAccounts.get(customerId);
    }

    public void processPurchase(String customerId, double purchaseAmount) {
        LoyaltyCard account = findAccount(customerId);
        if (account != null) {
            account.addPoints(purchaseAmount);
            System.out.println("Customer " + customerId + ": " + (int)(purchaseAmount * 0.10) + " points added. Current balance: " + account.getPoints());
        } else {
            System.out.println("Loyalty account with ID " + customerId + " not found.");
        }
    }

    public void attemptRedeem(String customerId, int amount) {
        LoyaltyCard account = findAccount(customerId);

        if (account == null) {
            System.out.println("Loyalty account with ID " + customerId + " not found.");
            return;
        }

        if (account.redeemPoints(amount)) {
            System.out.println("Customer " + customerId + ": Redeemed " + amount + " points. Remaining balance: " + account.getPoints());
        } else if (account.redeemedToday) {
            System.out.println("Customer " + customerId + " has already used their points for redemption today.");
        } else {
            System.out.println("Customer " + customerId + ": Insufficient points to redeem " + amount + " points. Current balance: " + account.getPoints());
        }
    }

    // Simplified way to simulate a new day - resets redemption flag for all accounts
    public void startNewDay() {
        loyaltyAccounts.values().forEach(LoyaltyCard::resetRedemptionFlag);
        System.out.println("--- Starting a new day - redemption flags reset ---");
    }
}