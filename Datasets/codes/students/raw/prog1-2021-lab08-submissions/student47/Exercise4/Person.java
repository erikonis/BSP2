package lu.uni.programming1.lab8.Exercise4;

public class Person {
    
    private String name;
    private LoyaltyCard loyaltyCard;

    public Person(String name, LoyaltyCard loyaltyCard) {
        this.setName(name);
        this.setCard(loyaltyCard);
    }

    public LoyaltyCard getCard() {
        return loyaltyCard;
    }

    public void setCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t" + loyaltyCard.toString();
    }
}
