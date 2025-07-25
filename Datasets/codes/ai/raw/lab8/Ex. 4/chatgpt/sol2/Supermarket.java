import java.time.LocalDate;
import java.util.*;

public class Supermarket {
    private final Map<LocalDate, List<LoyaltyCard>> redemptionLog = new HashMap<>();

    public boolean processRedeem(LoyaltyCard card, double amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedToday = redemptionLog.getOrDefault(today, new ArrayList<>());

        for (LoyaltyCard c : redeemedToday) {
            if (c.equals(card)) {
                System.out.println("Card already redeemed today: " + card.getId());
                return false;
            }
        }

        boolean success = card.redeem(amount, today);
        if (success) {
            redeemedToday.add(card);
            redemptionLog.put(today, redeemedToday);
            System.out.println("Redeem successful: " + card);
        } else {
            System.out.println("Redeem failed for card " + card.getId());
        }
        return success;
    }

    public void logStatus() {
        System.out.println("Redemption Log:");
        for (Map.Entry<LocalDate, List<LoyaltyCard>> entry : redemptionLog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}