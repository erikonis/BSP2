import java.time.LocalDate;
import java.util.*;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> redemptionHistory;

    public Supermarket() {
        this.redemptionHistory = new HashMap<>();
    }

    public void addRedemption(LoyaltyCard card) {
        LocalDate today = LocalDate.now();
        redemptionHistory.computeIfAbsent(today, k -> new ArrayList<>()).add(card);
    }

    public boolean canRedeem(LoyaltyCard card, int amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedToday = redemptionHistory.getOrDefault(today, Collections.emptyList());

        // Check if the card has already been used today
        if (redeemedToday.contains(card)) {
            return false;
        }

        // Check if the card has enough points
        return card.redeemPoints(amount);
    }

    public void printRedemptionHistory() {
        for (Map.Entry<LocalDate, List<LoyaltyCard>> entry : redemptionHistory.entrySet()) {
            System.out.println("Date: " + entry.getKey());
            for (LoyaltyCard card : entry.getValue()) {
                System.out.println("  " + card);
            }
        }
    }
}