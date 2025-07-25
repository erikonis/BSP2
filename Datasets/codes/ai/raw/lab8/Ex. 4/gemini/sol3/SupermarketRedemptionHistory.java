// SupermarketRedemptionHistory.java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SupermarketRedemptionHistory {
    private final Map<LocalDate, List<LoyaltyCard>> redemptionHistory;

    public SupermarketRedemptionHistory() {
        this.redemptionHistory = new HashMap<>();
    }

    public boolean recordRedemption(LocalDate date, LoyaltyCard card) {
        redemptionHistory.computeIfAbsent(date, k -> new ArrayList<>()).add(card);
        return true; // Recording is always successful once the action is performed
    }

    public boolean hasRedeemedOnDate(LocalDate date, LoyaltyCard card) {
        List<LoyaltyCard> redeemedCardsOnDate = redemptionHistory.get(date);
        if (redeemedCardsOnDate != null) {
            return redeemedCardsOnDate.contains(card);
        }
        return false;
    }
}