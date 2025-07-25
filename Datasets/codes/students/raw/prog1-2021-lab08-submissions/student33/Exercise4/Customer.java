package Exercise4;

public class Customer {
    private String name;
    private LoyalityCard card;

    public Customer(String name, LoyalityCard card) {
        this.setName(name);
        this.setCard(card);
    }

    public LoyalityCard getCard() {
        return card;
    }

    public void setCard(LoyalityCard card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". " + card.toString();
    }
}
