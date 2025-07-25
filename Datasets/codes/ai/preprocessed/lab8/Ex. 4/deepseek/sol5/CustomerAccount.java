import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CustomerAccount {
    private final String customerId;
    private final Set<LoyaltyCard> cards;

    public CustomerAccount(String customerId) {
        this.customerId = customerId;
        this.cards = new HashSet<>();
    }

    public void addCard(LoyaltyCard card) {
        if (!card.getCardId().equals(customerId)) {
            throw new IllegalArgumentException("Card ID must match customer ID");
        }
        cards.add(card);
    }

    public Set<LoyaltyCard> getCards() {
        return Collections.unmodifiableSet(cards);
    }

    public String getCustomerId() {
        return customerId;
    }
}