import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltySystem {
    private final Map<LocalDate, List<LoyaltyCard>> redemptionHistory;
    private final List<LoyaltyCard> allCards;

    public LoyaltySystem() {
        this.redemptionHistory = new HashMap<>();
        this.allCards = new ArrayList<>();
    }

    public void issueNewCard(String cardId) {
        allCards.add(new LoyaltyCard(cardId));
    }

    public void recordPurchase(String cardId, double purchaseAmount) {
        for (LoyaltyCard card : allCards) {
            if (card.getCardId().equals(cardId)) {
                card.addPoints(purchaseAmount);
            }
        }
    }

    public boolean redeemPoints(String cardId, int amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> todaysRedemptions = redemptionHistory.getOrDefault(today, new ArrayList<>());

        for (LoyaltyCard card : allCards) {
            if (card.getCardId().equals(cardId)) {
                // Check if this card was already used today
                if (todaysRedemptions.contains(card)) {
                    return false;
                }

                // Attempt redemption
                if (card.redeemPoints(amount)) {
                    todaysRedemptions.add(card);
                    redemptionHistory.put(today, todaysRedemptions);
                    return true;
                }
            }
        }
        return false;
    }

    public List<LoyaltyCard> getAllCards() {
        return new ArrayList<>(allCards);
    }

    public List<LoyaltyCard> getCardsForCustomer(String cardId) {
        List<LoyaltyCard> customerCards = new ArrayList<>();
        for (LoyaltyCard card : allCards) {
            if (card.getCardId().equals(cardId)) {
                customerCards.add(card);
            }
        }
        return customerCards;
    }
}