import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<LocalDate, List<LoyalityCard>> redeemCards;

    public Supermarket() {
        this.redeemCards = new HashMap<>();
    }

    public Map<LocalDate, List<LoyalityCard>> getRedeemCards() {
        return redeemCards;
    }

    public void setRedeemCards(Map<LocalDate, List<LoyalityCard>> redeemCards) {
        this.redeemCards = redeemCards;
    }

    public void buyProducts(Customer customer, int totalCost) {
        LoyalityCard lCard = customer.getCard();
        lCard.addPoints(totalCost * 0.1);
    }

    public boolean buyWithCard(Customer customer, int totalCost) {
        LoyalityCard lCard = customer.getCard();
        if (totalCost > lCard.getPoints()) {
            return false;
        } else if (canWeUseTheCardToday(lCard)) {
            lCard.removePoints(totalCost);
            addRedeemCard(lCard);
            return true;
        }

        return false;
    }

    private void addRedeemCard(LoyalityCard lCard) {
        List<LoyalityCard> list = redeemCards.get(LocalDate.now());

        if (list == null) {
            list = new ArrayList<>();
            redeemCards.put(LocalDate.now(), list);
        }

        list.add(lCard);
    }

    private boolean canWeUseTheCardToday(LoyalityCard card) {
        List<LoyalityCard> list = redeemCards.get(LocalDate.now());

        if (list == null) {
            return true;
        }

        for (LoyalityCard loyalityCard : list) {
            if (card.getiD() == loyalityCard.getiD()) {
                return false;
            }
        }

        return true;
    }

}
