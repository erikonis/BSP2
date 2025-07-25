import java.time.LocalDate;
import java.util.*;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> redeemedCards;

    public Supermarket() {
        this.redeemedCards = new HashMap<>();
    }

    public void addPurchase(LoyaltyCard card, double amount) {
        card.addPoints(amount);
    }

    public boolean redeem(LoyaltyCard card, int amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedToday = redeemedCards.getOrDefault(today, new ArrayList<>());

        if (redeemedToday.contains(card)) {
            return false; // Card already redeemed today
        }

        if (card.redeemPoints(amount)) {
            redeemedToday.add(card);
            redeemedCards.put(today, redeemedToday);
            return true;
        }

        return false; // Not enough points
    }

    public void printRedeemedCards() {
        for (Map.Entry<LocalDate, List<LoyaltyCard>> entry : redeemedCards.entrySet()) {
            System.out.println("Date: " + entry.getKey());
            for (LoyaltyCard card : entry.getValue()) {
                System.out.println(card);
            }
        }
    }
}