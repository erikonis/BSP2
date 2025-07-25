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

    public boolean redeem(LoyaltyCard card, double amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> todayRedeemed = redeemedCards.getOrDefault(today, new ArrayList<>());

        if (todayRedeemed.contains(card)) {
            System.out.println("Card has already been used to redeem today.");
            return false;
        }

        if (card.redeem(amount)) {
            todayRedeemed.add(card);
            redeemedCards.put(today, todayRedeemed);
            return true;
        } else {
            System.out.println("Not enough points to redeem.");
            return false;
        }
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
