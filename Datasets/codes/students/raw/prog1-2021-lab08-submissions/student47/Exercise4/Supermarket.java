package lu.uni.programming1.lab8.Exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

    private Map<LocalDate, List<LoyaltyCard>> redeemCards;

    public Supermarket() {
        this.redeemCards = new HashMap<>();
    }

    public Map<LocalDate, List<LoyaltyCard>> getRedeemCards() {
        return redeemCards;
    }

    public void setRedeemCards(Map<LocalDate, List<LoyaltyCard>> redeemCards) {
        this.redeemCards = redeemCards;
    }

    public void buyProducts(Person person, int totalCost) {
        LoyaltyCard loyaltyCard = person.getCard();
        loyaltyCard.addPoints(totalCost * 0.1);
    }

    public String buyWithLoyaltyCard(Person person, int totalCost) {

        LoyaltyCard loyaltyCard = person.getCard();

        if (totalCost > loyaltyCard.getPoints()) {
            return "You do not have enough points.\n";
        } else if (dailyUseOfCards(loyaltyCard)) {
            loyaltyCard.removePoints(totalCost);
            addRedeemCard(loyaltyCard);
            return "You have enough points to buy the item.\n";
        }

        return "You cannot buy anything else today.\n";
    }

    private void addRedeemCard(LoyaltyCard lCard) {
        List<LoyaltyCard> listOfCards = redeemCards.get(LocalDate.now());

        if (listOfCards == null) {
            listOfCards = new ArrayList<>();
            redeemCards.put(LocalDate.now(), listOfCards);
        }

        listOfCards.add(lCard);
    }

    private boolean dailyUseOfCards(LoyaltyCard loyaltyCard) {
        List<LoyaltyCard> listOfCards = redeemCards.get(LocalDate.now());

        if (listOfCards == null) {
            return true;
        }

        for (LoyaltyCard card : listOfCards) {
            if (loyaltyCard.getiD() == card.getiD()) {
                return false;
            }
        }

        return true;
    }

}
