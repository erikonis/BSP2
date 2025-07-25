import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<LocalDate, List<LoyaltyCard>> paidWithCard;

    public Supermarket() {
        this.paidWithCard = new HashMap<>();
    }

    public void buy(double amount, LoyaltyCard card) {
        card.buy(amount);
    }

    public void redeem(double amount, LoyaltyCard card) {
        LocalDate today = LocalDate.now();

        if (!this.paidWithCard.containsKey(today)) {
            this.paidWithCard.put(today, new ArrayList<LoyaltyCard>());
        }

        List<LoyaltyCard> redemeed = this.paidWithCard.get(today);

        if (!redemeed.contains(card)) {
           
            if (card.doRedeem(amount)) {

                card.redeem(amount);
                redemeed.add(card);

            } else {
                System.out.println(card + "-> this card does not have enough points.");
            }
        } else
            System.out.println(card + "-> this card has already redeemed today.");

    }


}
