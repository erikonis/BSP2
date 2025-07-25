// SupermarketLoyaltySystem.java
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SupermarketLoyaltySystem {
    private final Map<String, CustomerAccount> customerAccounts;
    private final Map<String, LoyaltyCard> activeCards; // Track all active cards by their unique ID

    public SupermarketLoyaltySystem() {
        this.customerAccounts = new HashMap<>();
        this.activeCards = new HashMap<>();
    }

    public LoyaltyCard issueNewCard(String customerId) {
        String newCardId = generateUniqueCardId();
        LoyaltyCard newCard = new LoyaltyCard(newCardId, customerId);
        activeCards.put(newCardId, newCard);
        customerAccounts.computeIfAbsent(customerId, CustomerAccount::new).addCard(newCard);
        return newCard;
    }

    public LoyaltyCard findCard(String cardId) {
        return activeCards.get(cardId);
    }

    public CustomerAccount findAccount(String customerId) {
        return customerAccounts.get(customerId);
    }

    public void processPurchase(String cardId, double purchaseAmount) {
        LoyaltyCard card = findCard(cardId);
        if (card != null) {
            card.addPoints(purchaseAmount);
            System.out.println("Card " + cardId + " (Customer " + card.getCustomerId() + "): " + (int)(purchaseAmount * 0.10) + " points added. Current balance: " + card.getPoints());
        } else {
            System.out.println("Loyalty card with ID " + cardId + " not found.");
        }
    }

    public void attemptRedeem(String cardId, int amount) {
        LoyaltyCard card = findCard(cardId);
        LocalDate today = LocalDate.now(java.time.Clock.system(java.time.ZoneId.of("Europe/Luxembourg")));

        if (card == null) {
            System.out.println("Loyalty card with ID " + cardId + " not found.");
            return;
        }

        card.resetDailyRedemption(today); // Ensure daily redemption flag is reset at the start of an attempt

        if (card.redeemPoints(amount, today)) {
            System.out.println("Card " + cardId + " (Customer " + card.getCustomerId() + "): Redeemed " + amount + " points. Remaining balance: " + card.getPoints());
        } else if (card.redeemedTodayForDate(today)) {
            System.out.println("Card " + cardId + " has already been used for redemption today.");
        } else {
            System.out.println("Card " + cardId + ": Insufficient points to redeem " + amount + " points. Current balance: " + card.getPoints());
        }
    }

    private String generateUniqueCardId() {
        return java.util.UUID.randomUUID().toString();
    }

    public void startNewDay() {
        LocalDate today = LocalDate.now(java.time.Clock.system(java.time.ZoneId.of("Europe/Luxembourg")));
        activeCards.values().forEach(card -> card.resetDailyRedemption(today));
        System.out.println("--- Starting a new day - daily redemption flags reset ---");
    }
}