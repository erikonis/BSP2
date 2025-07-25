import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SupermarketLoyaltySystem {
    private final List<LoyaltyCard> loyaltyCards;
    private final SupermarketRedemptionHistory redemptionHistory;

    public SupermarketLoyaltySystem() {
        this.loyaltyCards = new ArrayList<>();
        this.redemptionHistory = new SupermarketRedemptionHistory();
    }

    public LoyaltyCard createCard(String customerId) {
        LoyaltyCard newCard = new LoyaltyCard(customerId);
        loyaltyCards.add(newCard);
        return newCard;
    }

    public LoyaltyCard findCard(String cardId) {
        for (LoyaltyCard card : loyaltyCards) {
            if (card.getId().equals(cardId)) {
                return card;
            }
        }
        return null;
    }

    public void processPurchase(String cardId, double purchaseAmount) {
        LoyaltyCard card = findCard(cardId);
        if (card != null) {
            card.addPoints(purchaseAmount);
            System.out.println("Card " + cardId + ": " + (int)(purchaseAmount * 0.10) + " points added. Current balance: " + card.getPoints());
        } else {
            System.out.println("Loyalty card with ID " + cardId + " not found.");
        }
    }

    public void attemptRedeem(String cardId, int amount) {
        LoyaltyCard card = findCard(cardId);
        LocalDate today = LocalDate.now();

        if (card == null) {
            System.out.println("Loyalty card with ID " + cardId + " not found.");
            return;
        }

        if (redemptionHistory.hasRedeemedOnDate(today, card)) {
            System.out.println("Card " + cardId + " has already been used for redemption today.");
            return;
        }

        if (card.redeemPoints(amount)) {
            redemptionHistory.recordRedemption(today, card);
            System.out.println("Card " + cardId + ": Redeemed " + amount + " points. Remaining balance: " + card.getPoints());
        } else {
            System.out.println("Card " + cardId + ": Insufficient points to redeem " + amount + " points. Current balance: " + card.getPoints());
        }
    }
}