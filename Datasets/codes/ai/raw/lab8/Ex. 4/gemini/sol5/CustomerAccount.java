// CustomerAccount.java
import java.util.ArrayList;
import java.util.List;

public class CustomerAccount {
    private final String customerId;
    private final List<LoyaltyCard> cards;

    public CustomerAccount(String customerId) {
        this.customerId = customerId;
        this.cards = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addCard(LoyaltyCard card) {
        if (card.getCustomerId().equals(this.customerId) && !cards.contains(card)) {
            this.cards.add(card);
        }
    }

    public LoyaltyCard findCard(String cardId) {
        for (LoyaltyCard card : cards) {
            if (card.getCardId().equals(cardId)) {
                return card;
            }
        }
        return null;
    }

    public int getTotalPoints() {
        return cards.stream().mapToInt(LoyaltyCard::getPoints).sum();
    }

    // In this model, redemption is tied to the individual card
    // If shared points redemption is needed, this class would handle that logic.
}