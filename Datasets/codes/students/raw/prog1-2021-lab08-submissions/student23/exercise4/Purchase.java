package lu.uni.programming1.lab8.exercise4;

public class Purchase {
    private int amount;
    private Customer person;
    // private LoyaltyCard card;
    
    public Purchase(int amount, Customer person) {
        this.amount = amount;
        this.person = person;
    }

    public int getAmount() {
        return amount;
    }

    public Customer getPerson() {
        return person;
    }

    // public LoyaltyCard getCard() {
    //     return card;
    // }
    
}
