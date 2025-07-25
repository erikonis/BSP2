package lu.uni.programming1.lab8.exercise4;

public class Customer {
    private String name;
    private LoyaltyCard card;
    
    public Customer(String name, LoyaltyCard card) {
        this.name = name;
        this.card = card;
    }

    public LoyaltyCard getCard() {
        return card;
    }

    public String getName() {
        return name;
    }
    
}
