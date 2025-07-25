import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> redemptionRecords;

    public Supermarket() {
        this.redemptionRecords = new HashMap<>();
    }

    public void registerPurchase(LoyaltyCard card, double amount) {
        card.addPoints(amount);
    }

    public boolean processRedemption(LoyaltyCard card, int amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedCards = redemptionRecords.getOrDefault(today, new ArrayList<>());

        if (!redeemedCards.contains(card) && card.redeem(amount)) {
            redeemedCards.add(card);
            redemptionRecords.put(today, redeemedCards);
            return true;
        }
        return false;
    }

    public void printRedemptionRecords(LocalDate date) {
        List<LoyaltyCard> cards = redemptionRecords.getOrDefault(date, new ArrayList<>());
        System.out.println("Redemption records for " + date + ":");
        if (cards.isEmpty()) {
            System.out.println("No redemptions on this date.");
        } else {
            for (LoyaltyCard card : cards) {
                System.out.println(card);
            }
        }
    }
}