import java.time.LocalDate;
import java.util.*;

public class LoyaltyProgram {
    private final Map<LocalDate, List<LoyaltyCard>> redeemedCards;

    public LoyaltyProgram() {
        this.redeemedCards = new HashMap<>();
    }

    public void registerPurchase(LoyaltyCard card, double amount) {
        card.addPoints(amount);
        System.out.println(card + " received " + (amount * 0.10) + " points.");
    }

    public boolean redeem(LoyaltyCard card, double amount) {
        LocalDate today = LocalDate.now();
        List<LoyaltyCard> todayRedeemed = redeemedCards.getOrDefault(today, new ArrayList<>());

        if (todayRedeemed.contains(card)) {
            System.out.println("Card already used for redemption today.");
            return false;
        }

        if (card.redeemPoints(amount)) {
            todayRedeemed.add(card);
            redeemedCards.put(today, todayRedeemed);
            System.out.println("Successfully redeemed " + amount + " points from " + card);
            return true;
        } else {
            System.out.println("Not enough points on card: " + card);
            return false;
        }
    }
}
