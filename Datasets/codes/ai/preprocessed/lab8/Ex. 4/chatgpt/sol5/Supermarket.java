import java.time.LocalDate;
import java.util.*;

public class Supermarket {
    private final Map<LocalDate, List<LoyaltyCard>> redemptionLog;

    public Supermarket() {
        this.redemptionLog = new HashMap<>();
    }

    public void redeemPoints(LoyaltyCard card, double amount) {
        boolean redeemed = card.redeem(amount);
        if (redeemed) {
            redemptionLog.computeIfAbsent(LocalDate.now(), k -> new ArrayList<>()).add(card);
            System.out.println("Redemption successful for card ID: " + card.getCardID());
        } else {
            System.out.println("Redemption failed for card ID: " + card.getCardID());
        }
    }

    public void printRedemptionLog() {
        for (Map.Entry<LocalDate, List<LoyaltyCard>> entry : redemptionLog.entrySet()) {
            System.out.println("Date: " + entry.getKey());
            for (LoyaltyCard card : entry.getValue()) {
                System.out.println("Card ID: " + card.getCardID());
            }
        }
    }
}