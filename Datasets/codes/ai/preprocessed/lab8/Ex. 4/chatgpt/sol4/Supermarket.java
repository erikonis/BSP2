import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> redemptionLog;

    // Constructor initializes the redemption log
    public Supermarket() {
        this.redemptionLog = new HashMap<>();
    }

    // Redeem points for a card, checking if redemption is successful
    public void redeemPoints(LoyaltyCard card, double amount) {
        boolean isSuccess = card.redeem(amount);
        if (isSuccess) {
            // Log the successful redemption in the map by date
            redemptionLog.computeIfAbsent(LocalDate.now(), k -> new ArrayList<>()).add(card);
            System.out.println("Card ID " + card.getCardID() + " redeemed successfully.");
        } else {
            System.out.println("Card ID " + card.getCardID() + " redemption failed.");
        }
    }

    // Display the redemption log for today
    public void displayRedemptionLog() {
        System.out.println("Redemption log for " + LocalDate.now());
        redemptionLog.getOrDefault(LocalDate.now(), List.of()).forEach(card ->
            System.out.println("Card ID: " + card.getCardID())
        );
    }
}