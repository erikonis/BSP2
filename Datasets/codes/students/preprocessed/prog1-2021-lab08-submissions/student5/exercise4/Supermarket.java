import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

    private Map<LocalDate, List<LoyaltyCard>> paidWithTheLoyaltyCard;

    public Supermarket() {
        this.paidWithTheLoyaltyCard = new HashMap<>();
    }

    public void buy(double amount, LoyaltyCard card) {
        card.buy(amount);
    }

    public void redeem(double amount, LoyaltyCard card) {
        LocalDate today = LocalDate.now();

        // Add list for today if yet not created
        if (!this.paidWithTheLoyaltyCard.containsKey(today)) {
            this.paidWithTheLoyaltyCard.put(today, new ArrayList<LoyaltyCard>());
        }

        // Retrieving list of the cards which are redeemed today
        List<LoyaltyCard> cardsRedeemedToday = this.paidWithTheLoyaltyCard.get(today);

        // Check card has not yet redeemed for today
        if (!cardsRedeemedToday.contains(card)) {
            // Check for points on the card
            if (card.doRedeem(amount)) {

                card.redeem(amount);
                cardsRedeemedToday.add(card);

            } else {
                System.out.println(card + ": does not have enough points on the card.");
            }
        } else
            System.out.println(card + ": This card has already redeemed today.");

    }
}
