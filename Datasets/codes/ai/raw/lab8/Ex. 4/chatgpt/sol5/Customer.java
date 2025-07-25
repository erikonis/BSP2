import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<LoyaltyCard> loyaltyCards;

    public Customer(String name) {
        this.name = name;
        this.loyaltyCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCard(LoyaltyCard card) {
        this.loyaltyCards.add(card);
    }

    public List<LoyaltyCard> getLoyaltyCards() {
        return loyaltyCards;
    }
}
