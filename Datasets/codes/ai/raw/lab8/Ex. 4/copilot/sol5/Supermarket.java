import java.time.LocalDate;
import java.util.*;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> redeemedCards = new HashMap<>();

    public void addPurchase(LoyaltyCard card, double amount) {
        card.addPoints(amount);
    }

    public boolean redeem(LoyaltyCard card, double amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> redeemedToday = redeemedCards.getOrDefault(today, new ArrayList<>());

        if (redeemedToday.contains(card)) {
            System.out.println("Card has already been used to redeem today.");
            return false;
        }

        if (card.redeem(amount)) {
            redeemedToday.add(card);
            redeemedCards.put(today, redeemedToday);
            System.out.println("Redeem successful.");
            return true;
        } else {
            System.out.println("Insufficient points.");
            return false;
        }
    }
}
