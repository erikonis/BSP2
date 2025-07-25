import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private List<LoyaltyCard> cards;

    // Constructor for a customer
    public Customer(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    // Add a loyalty card to the customer
    public void addCard(LoyaltyCard card) {
        cards.add(card);
    }

    // Get the list of loyalty cards associated with the customer
    public List<LoyaltyCard> getCards() {
        return cards;
    }

    // Get the customer's name
    public String getName() {
        return name;
    }
}