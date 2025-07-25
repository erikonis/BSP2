import java.time.LocalDate;
import java.util.*;

public class LoyaltySystem {
    private final Map<LocalDate, List<LoyaltyCard>> redeemedCards = new HashMap<>();

    public boolean redeem(LoyaltyCard card, double amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> todaysList = redeemedCards.getOrDefault(today, new ArrayList<>());

        if (todaysList.contains(card)) {
            return false; // Already redeemed today
        }

        if (card.redeem(amount)) {
            todaysList.add(card);
            redeemedCards.put(today, todaysList);
            return true;
        }
        return false;
    }

    public void printRedeemedToday() {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> list = redeemedCards.get(today);
        if (list != null) {
            System.out.println("Cards that redeemed today:");
            for (LoyaltyCard card : list) {
                System.out.println(card);
            }
        } else {
            System.out.println("No redemptions today.");
        }
    }
}