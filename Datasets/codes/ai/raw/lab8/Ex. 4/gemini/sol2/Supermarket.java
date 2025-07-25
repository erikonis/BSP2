import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<String, LoyaltyCard> cards;
    private Map<LocalDate, List<LoyaltyCard>> redemptionRecords;

    public Supermarket() {
        this.cards = new HashMap<>();
        this.redemptionRecords = new HashMap<>();
    }

    public LoyaltyCard createOrGetCard(String id) {
        return cards.computeIfAbsent(id, LoyaltyCard::new);
    }

    public void registerPurchase(String cardId, double amount) {
        LoyaltyCard card = createOrGetCard(cardId);
        card.addPoints(amount);
    }

    public boolean processRedemption(String cardId, int amount) {
        LoyaltyCard card = cards.get(cardId);
        if (card == null) return false; // Card not found
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedCards = redemptionRecords.getOrDefault(today, new ArrayList<>());

        if (!redeemedCards.contains(card) && card.redeem(amount)) {
            redeemedCards.add(card);
            redemptionRecords.put(today, redeemedCards);
            return true;
        }
        return false;
    }

    // ... (printRedemptionRecords same as before)
}