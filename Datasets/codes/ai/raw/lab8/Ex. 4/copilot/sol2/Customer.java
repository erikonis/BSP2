import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<LoyaltyCard> cards;

    public Customer(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void addCard(LoyaltyCard card) {
        cards.add(card);
    }

    public List<LoyaltyCard> getCards() {
        return cards;
    }

    public String getName() {
        return name;
    }
}