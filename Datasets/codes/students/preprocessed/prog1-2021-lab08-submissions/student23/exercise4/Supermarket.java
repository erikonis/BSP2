import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

    private Map<LocalDate, List<LoyaltyCard>> redeemHistory = new HashMap<LocalDate, List<LoyaltyCard>>();

    private LocalDate today = LocalDate.now();

    private List<LoyaltyCard> listOfCards = new ArrayList<>();

    public Supermarket() {

    }
    

    public void makePurchase(Purchase purchase) {
        int points = purchase.getPerson().getCard().getPoints();
        points += (int) Math.ceil(0.1*purchase.getAmount());
        purchase.getPerson().getCard().setPoints(points);

        System.out.printf("Made purchase from %s, new points %d\n\n", purchase.getPerson().getName(), points);
    }

    public boolean checkIfRedeemedToday(LoyaltyCard card) {
        List<LoyaltyCard> redeemedCards = new ArrayList<>();
        redeemedCards = redeemHistory.get(today);
        if (redeemedCards != null) {
            for (LoyaltyCard loyaltyCard : redeemedCards) {
                if (loyaltyCard.equals(card)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;

    }

    public void redeemPoints(Purchase purchase) {
        if (checkIfRedeemedToday(purchase.getPerson().getCard())) {
            if (purchase.getPerson().getCard().getPoints() >= purchase.getAmount()) {
                listOfCards.add(purchase.getPerson().getCard());
                redeemHistory.put(today, listOfCards);
                purchase.getPerson().getCard().setPoints(purchase.getPerson().getCard().getPoints()-purchase.getAmount());
                System.out.println("Redeemed points");
            } else {
                System.out.println("Sorry, you don't have enough points on your card.");
            }
        } else {
            System.out.println("You already redeemed points today.");
        }
        
    }
}
